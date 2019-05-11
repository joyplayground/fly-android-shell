package cn.honchy.flyshell.cn.honchy.flyshell.js;

import android.webkit.WebView;
import java.util.Map;

public class JSServer {
    private WebView webview;
    private final String JS_CALLBACK_INTERFACE_NAME = "__fly_callback";

    public JSServer(WebView webView) {
        this.webview = webView;
    }

    public void process(String name, Map<String, Object> param, final String callbackId) {
        JSMethod method = JSMethodList.getInstance().lookupMethod(name);
        method.execute(param, new JSAsyncCallback() {
            @Override
            public void callback(JSResponse response) {
                JSServer.this.callback(response, callbackId);
            }
        });
    }

    private void callback(JSResponse response, String callbackId) {
        StringBuffer code = new StringBuffer();

        code
                .append("void ")
                .append(JS_CALLBACK_INTERFACE_NAME)
                .append("(")
                .append(response.toJSONString())
                .append(",")
                .append("\"")
                .append(callbackId)
                .append("\"")
                .append(")");
        webview.evaluateJavascript(code.toString(), null);
    }
}
