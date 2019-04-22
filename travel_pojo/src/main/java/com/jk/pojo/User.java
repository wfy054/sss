package com.jk.pojo;

public class User {
    private Integer id;
    private String name;
    private String pwd;
    private String idNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public User(Integer id, String name, String pwd, String idNumber) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.idNumber = idNumber;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", idNumber='" + idNumber + '\'' +
                '}';
    }
}
