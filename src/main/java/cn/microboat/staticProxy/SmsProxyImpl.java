package cn.microboat.staticProxy;

import cn.microboat.SmsService;

/**
 * @author zhouwei
 */
public class SmsProxyImpl implements SmsService {

    private final SmsService smsService;

    public SmsProxyImpl(SmsService smsService) {
        this.smsService = smsService;
    }


    @Override
    public String send(String message) {
        // 调用方法前，可自定义操作
        System.out.println("before method send()");
        // 调用方法
        smsService.send(message);
        // 调用方法后，可自定义操作
        System.out.println("after method send()");
        return null;
    }
}
