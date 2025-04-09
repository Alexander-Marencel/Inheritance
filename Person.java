/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alex Marencel
 */
public class Person {
    //encapsulated attributes
    private String name;
    private int age;
    private Address homeAddress;
    
    //full-parameter
    public Person(String name, int age, Address homeAddress) {
        this.name = name;
        this.age = age;
        this.homeAddress = homeAddress;
    }
    //no-parameter
    public Person() {
        this.name = "No Name";
        this.age = 0;
        this.homeAddress = new Address();
    }
    //initials method
    public String initials() {
        String n = this.name;
        int start = n.indexOf(" ") + 1;
        int stop = n.indexOf(" ") + 2;
        return n.substring(0, 1) + "." + n.substring(start, stop) + ".";
    }
    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }
    //toString()
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", homeAddress=" + homeAddress + '}';
    }
}
