package cn.microboat;

import cn.microboat.SmsService;

/**
 * 发送短信实现类
 *
 * @author zhouwei
 */
public class SmsServiceImpl implements SmsService {
    @Override
    public String send(String message) {
        System.out.println("send message:" + message);
        return message;
    }
}
