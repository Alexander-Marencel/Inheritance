/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alex Marencel
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //public EmbeddedCourse(ForeignAddress place, Professor supervisor, CourseName name, int credits, String description, boolean genEd, String genEdType)
        EmbeddedCourse object0 = new EmbeddedCourse();
        EmbeddedCourse object1 = new EmbeddedCourse(new ForeignAddress("France", 0, "Champs-Elysees", "Paris", "Ile de France", 75000), new Professor("IST", "Information Science", "Fed Fonz", 44, new Address(100, "West College Avenue", "State College", "PA", 16801)), new CourseName("IST", 431), 3, "The Information Environment", true, "IL");
        
        System.out.println("Professor " + object0.getSupervisor().getName() + " is teaching " + object0.getName().getMajor() + " " + object0.getName().getNumber() + " in " + object0.getPlace().getCity() + "," + object0.getPlace().getCounty());
        System.out.println("Professor " + object1.getSupervisor().getName() + " is teaching " + object1.getName().getMajor() + " " + object1.getName().getNumber() + " in " + object1.getPlace().getCity() + "," + object1.getPlace().getCounty());
    }
}
