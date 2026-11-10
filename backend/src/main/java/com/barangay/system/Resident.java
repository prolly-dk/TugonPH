package com.barangay.system;

public class Resident {

    private String name;
    private String barangayId;
    private String password;
    private int age;


    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public String getBarangayId(){
        return barangayId;
    }

    public void setBarangayId(String barangayId){
        this.barangayId = barangayId;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){  
        this.age = age;
    }
}
