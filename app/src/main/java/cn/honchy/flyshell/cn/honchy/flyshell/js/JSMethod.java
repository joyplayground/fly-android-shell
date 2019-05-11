package cn.honchy.flyshell.cn.honchy.flyshell.js;

import java.util.Map;


public interface JSMethod {
    void execute(Map<String, Object> param, JSAsyncCallback callback);
}
