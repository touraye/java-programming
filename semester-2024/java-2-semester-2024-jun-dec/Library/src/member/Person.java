package java2.Library.src.member;

import types.UserType;

public class Person {
    private String id;
    private String name;
    private String email;
    private UserType type;
    static int count = 0;

    public Person(String id, String name, String email, UserType type){
        this.id = id;
        this.name = name;
        this.email = email;
        this.type = type;
        count += 1;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }
}
