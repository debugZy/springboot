package com.java.annotations;

@DBTable(name = "MEMBER")
public class Member {
    @SqlString(30)
    String firstName;
    @SqlString(50)
    String lastName;
    @SqlString
    Integer age;
    @SqlString(value = 30, constraints = @Constraints(primaryKey = true))
    String handler;
    static int memberCount;

    public String getHandler() {
        return handler;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return handler;
    }

    public Integer getAge() {
        return age;
    }
}
