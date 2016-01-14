package action;

import model.MessageModel;
import model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @auther dell
 * @date 2016/1/1.
 */
public class UserAction {

    public static User user;
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:spring-beans.xml"});
        user = context.getBean("user1",User.class);
        System.out.println("USER:"+user.getName());

        User userAlias = context.getBean("userAlias",User.class);
        System.out.println("USER ALIAS:"+ userAlias.getName());

        MessageModel messageModel = context.getBean("messageModel",MessageModel.class);
        messageModel.setCreateDate(new Date());
        System.out.println("MESSAGE_MODEL:" + messageModel.getInfo());

        MessageModel messageModel2 = context.getBean("messageModel2",MessageModel.class);
        messageModel2.setCreateDate(new Date());
        System.out.println("MESSAGE_MODEL:" + messageModel2.getInfo());
    }
}
