package cn.honchy.flyshell.cn.honchy.flyshell.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class FlyWebView extends WebView {

    public FlyWebView(Context context) {
        super(context);

        this.setWebChromeClient(this.setupChromeClient());
        this.setWebViewClient(this.setupWebViewClient());
    }

    private WebViewClient setupWebViewClient() {
        WebViewClient wvc = new WebViewClient();
        return wvc;
    }

    private WebChromeClient setupChromeClient() {
        WebChromeClient wcc = new WebChromeClient();
        return wcc;
    }
}
