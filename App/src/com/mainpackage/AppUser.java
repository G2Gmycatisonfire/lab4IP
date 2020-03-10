package com.mainpackage;

public class AppUser {
    public AppUser(int id, String name, String password, String accessFlags) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.accessFlags = accessFlags;
    }

    private int id;
    public int getID() {
        return this.id;
    }
    private void setID(int id) {
        this.id = id;
    }
    private String name;
    public String getName() {
        return this.name;
    }
    private void setName(String name) {
        this.name = name;
    }
    private String password;
    private String getPassword() {
        return this.password;
    }
    private void setPassword(String password) {
        this.password = password;
    }
    private String accessFlags;
    public String getAccessFlags() {
        return this.accessFlags;
    }
    private void setAccessFlags(String accessFlags) {
        this.accessFlags = accessFlags;
    }

    public String getHashedPassword() {
        return Crypto.hashPassword(this.password);
    }
}
