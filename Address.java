/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alex Marencel
 */
public class Address {
    private int number;
    private String street;
    private String city;
    private String state;
    private int zipcode;

    
    public Address(int number, String street, String city, String state, int zipcode) {
        this.number = number;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }
    
    public Address() {
        this.number = 100;
        this.street = "Old Main";
        this.city = "University Park";
        this.state = "PA";
        this.zipcode = 16802;
    }

    
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    
    @Override
    public String toString() {
        return "Address{" + "number=" + number + ", street=" + street + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + '}';
    }
    
}
