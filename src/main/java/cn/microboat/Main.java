package cn.microboat;

import cn.microboat.cglibProxy.AliSmsService;
import cn.microboat.cglibProxy.CglibProxyFactory;
import cn.microboat.jdkProxy.JdkProxyFactory;
import cn.microboat.staticProxy.SmsProxyImpl;

/**
 * @author zhouwei
 */
public class Main {
    public static void main(String[] args) {

        // 静态代理
        SmsServiceImpl smsService = new SmsServiceImpl();
        SmsProxyImpl smsProxy = new SmsProxyImpl(smsService);
        smsProxy.send("java based on static proxy");

        // JDK 代理
        SmsService proxy = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
        proxy.send("java based on JDK proxy");

        // Cglib 代理
        AliSmsService aliSmsService = (AliSmsService) CglibProxyFactory.getProxy(AliSmsService.class);
        aliSmsService.send("java based on Cglib proxy");
    }
}
