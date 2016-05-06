package org.smart4j.framework.bean;

import java.lang.reflect.Method;

/**
 * 封装 Action 信息
 * Created by Administrator on 2016/5/6.
 */
public class Handler {

    private Class<?> controllerCLass;

    private Method actionMethod;

    public Handler(Class<?> controllerCLass, Method actionMethod) {
        this.controllerCLass = controllerCLass;
        this.actionMethod = actionMethod;
    }

    public Class<?> getControllerCLass() {
        return controllerCLass;
    }

    public Method getActionMethod() {
        return actionMethod;
    }


}
