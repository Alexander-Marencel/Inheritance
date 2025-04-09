/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alex Marencel
 */
public class Professor extends Person{
    //encapsulated attributes
    private String college;
    private String expertise;

    //full-param const
    public Professor(String college, String expertise, String name, int age, Address homeAddress) {
        super(name, age, homeAddress);
        this.college = college;
        this.expertise = expertise;
    }
    //no-param const
    public Professor() {
        super();
        this.college = "IST";
        this.expertise = "Programming Languages";
    }

    //getters and setters
    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    //toString()
    @Override
    public String toString() {
        return "Professor{" + "college=" + college + ", expertise=" + expertise + '}' + " " + super.toString();
    }
    
}
