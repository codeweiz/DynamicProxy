package cn.microboat.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zhouwei
 */
public class DebugInvocationHandler implements InvocationHandler {

    /**
     * 代理类中的真实对象
     */
    private final Object target;

    public DebugInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 调用方法之前，可自定义操作
        System.out.println("before method " + method.getName());

        // 调用方法
        Object result = method.invoke(target, args);

        // 调用方法之后
        System.out.println("after method " + method.getName());
        return result;
    }
}
