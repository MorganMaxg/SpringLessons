package action;

import model.UserMessage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther dell
 * @date 2016/1/2.
 */
public class UserMessageAction {

    private static UserMessage userMessage;
    public static void main(String ... args){
        ApplicationContext context =new ClassPathXmlApplicationContext(new String[] {"classpath:spring-beans.xml"});
        userMessage = context.getBean("userMessage",UserMessage.class);
        System.out.println("USER_MESSAGE:"+userMessage.getUser().getName());

        UserMessage userMessage = context.getBean("userMessage2",UserMessage.class);
        System.out.println("USER_MESSAGE2:"+userMessage.getUser().getAge());
    }
}
