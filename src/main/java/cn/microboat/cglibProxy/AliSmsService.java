package cn.microboat.cglibProxy;

/**
 * @author zhouwei
 */
public class AliSmsService {
    public String send(String message) {
        System.out.println("send message: " + message);
        return message;
    }
}
