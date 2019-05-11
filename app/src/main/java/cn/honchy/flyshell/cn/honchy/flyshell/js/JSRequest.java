package cn.honchy.flyshell.cn.honchy.flyshell.js;

import java.util.Map;

public class JSRequest {
    private String methodName;
    private Map<String, Object> param;
    private String callbackId;

    public JSRequest(String methodName, Map<String, Object> param, String callbackId) {
        this.methodName = methodName;
        this.param = param;
        this.callbackId = callbackId;
    }
}
