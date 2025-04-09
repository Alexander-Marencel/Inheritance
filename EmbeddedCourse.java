/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alex Marencel
 */
public class EmbeddedCourse extends Course {
    //encapsulated attributes
    private ForeignAddress place;
    private Professor supervisor;
    
    //full-param constructor
    public EmbeddedCourse(ForeignAddress place, Professor supervisor, CourseName name, int credits, String description, boolean genEd, String genEdType) {
        super(name, credits, description, genEd, genEdType);
        this.place = place;
        this.supervisor = supervisor;
    }
    //no-param constructor
    public EmbeddedCourse() {
        super();
        this.place = new ForeignAddress();
        this.supervisor = new Professor();
    }
    
    //getters and setters
    public ForeignAddress getPlace() {
        return place;
    }

    public void setPlace(ForeignAddress place) {
        this.place = place;
    }

    public Professor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Professor supervisor) {
        this.supervisor = supervisor;
    }
    
    //toString()
    @Override
    public String toString() {
        return "EmbeddedCourse{" + "place=" + place + ", supervisor=" + supervisor + '}' + " " + super.toString();
    }   
}
