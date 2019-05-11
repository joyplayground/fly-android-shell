package cn.honchy.flyshell.cn.honchy.flyshell.js;

import org.json.JSONException;
import org.json.JSONObject;

public class JSResponse {
    static int SUCCESS = 0;
    static int FAIL = 1;

    private int code = SUCCESS;
    private String message;
    private Object data = null;

    public JSResponse() {}

    public JSResponse(int code, Object data) {
        this.code = code;
        this.data = data;
    }

    public void setCode(int code) {
        this.code = code;
    }
    public void setData(Object data) {
        this.data = data;
    }

    public void success(Object data) {
        this.code = SUCCESS;
        this.data = data;
    }

    public void fail(String message) {
        this.code = FAIL;
        this.message = message;
    }

    public String  toJSONString() {
        JSONObject obj = new JSONObject();
        try {
            obj.put("code", this.code);
            obj.put("data", this.data);
            obj.put("message", this.message);
        } catch(JSONException e) {
            try {
                obj.put("code", FAIL);
                obj.put("message", "JSON to String error");
            } catch (JSONException jse) {
//                ignore
            }
        }

        return obj.toString();
    }
}
