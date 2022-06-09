package cn.microboat.cglibProxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 自定义 MethodInterceptor 方法拦截器
 *
 * @author zhouwei
 */
public class DebugMethodInterceptor implements MethodInterceptor {

    /**
     * @param o           被代理的对象（需要增强的对象）
     * @param method      被拦截的方法（需要增强的方法）
     * @param objects     方法入参
     * @param methodProxy 用于调用原始方法
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        // 调用方法之前，可自定义操作
        System.out.println("before method " + method.getName());

        // 调用方法
        Object object = methodProxy.invokeSuper(o, objects);

        // 调用方法之后，可自定义操作
        System.out.println("after method " + method.getName());

        return object;
    }
}
