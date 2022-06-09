package cn.microboat.cglibProxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * Cglib 代理工厂
 *
 * @author zhouwei
 */
public class CglibProxyFactory {

    /**
     * 根据 class 获取 代理类，无须实现接口
     */
    public static Object getProxy(Class<?> clazz) {
        // 创建动态代理增强类
        Enhancer enhancer = new Enhancer();
        // 设置类加载器
        enhancer.setClassLoader(clazz.getClassLoader());
        // 设置被代理类
        enhancer.setSuperclass(clazz);
        // 设置方法拦截器
        enhancer.setCallback(new DebugMethodInterceptor());
        // 创建代理类
        return enhancer.create();
    }

}
