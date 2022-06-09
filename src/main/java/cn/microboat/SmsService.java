package cn.microboat;

/**
 * 发送短信接口
 *
 * @author zhouwei
 */
public interface SmsService {

    /**
     * 发送消息
     *
     * @param message 消息
     * @return String
     */
    String send(String message);
}
