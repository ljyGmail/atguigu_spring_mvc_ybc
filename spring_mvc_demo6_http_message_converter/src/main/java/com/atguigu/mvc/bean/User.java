package com.atguigu.mvc.bean;

/**
 * ClassName: User
 * Package: com.atguigu.mvc.bean
 * Description:
 *
 * @Author ljy
 * @Create 2025. 6. 14. 오전 10:48
 * @Version 1.0
 */
public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private String sex;

    public User() {
    }

    public User(Integer id, String username, String password, Integer age, String sex) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
