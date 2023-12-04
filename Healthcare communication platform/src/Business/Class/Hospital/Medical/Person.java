/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class.Hospital.Medical;

/**
 *
 * @author dell
 */
public class Person {
    int id;
    String pwd;
    String name;
    int age;
    String gender;
    String contact;

    public Person(){

    }

    public Person(int id, String name, String pwd, String gender){
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.gender = gender;
    }

    public Person(int id, String name, String gender, int age){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    
}
