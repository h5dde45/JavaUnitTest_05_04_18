package com.p2;

public class User {
    private int age;
    private int purse;
    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public User(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int grow() {
        return ++age;
    }

    public int grow2() {
        return age += 2;
    }
}
