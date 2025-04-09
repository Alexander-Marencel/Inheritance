/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alex Marencel
 */
public class ForeignAddress extends Address {
    //encapsulated attributes
    private String county;

    //full-param constructor
    public ForeignAddress(String county, int number, String street, String city, String state, int zipcode) {
        super(number, street, city, state, zipcode);
        this.county = county;
    }
    //no-param constructor
    public ForeignAddress() {
        super();
        this.county = "Not Informed";
    }

    //getters and setters
    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    //toString()
    @Override
    public String toString() {
        return "ForeignAddress{" + "county=" + county + '}' + " " + super.toString();
    }
}


