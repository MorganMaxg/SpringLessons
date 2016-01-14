package model;

/**
 * @auther dell
 * @date 2016/1/2.
 */
public class UserMessage {
    private User user;
    private MessageModel messageModel;

    public UserMessage(){
    }

    public UserMessage(User user,MessageModel messageModel){
        this.user = user;
        this.messageModel = messageModel;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public MessageModel getMessageModel() {
        return messageModel;
    }

    public void setMessageModel(MessageModel messageModel) {
        this.messageModel = messageModel;
    }
}
