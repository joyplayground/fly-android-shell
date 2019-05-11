package cn.honchy.flyshell.cn.honchy.flyshell.js;

import java.util.HashMap;
import java.util.Map;

public class JSMethodList {
    private Map<String, JSMethod> methodList = new HashMap<>();
    private static JSMethodList self = new JSMethodList();
    private JSMethodList() {}

    static JSMethodList getInstance() {
        return self;
    }

    public JSMethod lookupMethod(String name) {
        return methodList.get(name);
    }
    public void registerMethod(String name, JSMethod method) {
        methodList.put(name, method);
    }

    public void unRegisterMethod(String name) {
        methodList.remove(name);
    }
}
