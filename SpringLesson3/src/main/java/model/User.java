package model;

/**
 * @auther dell
 * @date 2016/1/1.
 */
public class User {
    private static User user = new User();
    private String name;
    private String age;
    private long id;

    public static User createInstance(){
        user.setName("maxg default");
        user.setAge("23 default");
        user.setId(1);
        return user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
