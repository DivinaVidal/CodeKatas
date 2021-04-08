package org.airline.reservations;
//passenger class creates passenger object
public class Passenger {
    private String name; //object

    //constructor
    public Passenger() {
        name = "Unknown name";
    }

    //getter and setter methods
    //fields describe what the object is (state)
    //method describe what the object does (behavior) (verbs object can perform)
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }
}

