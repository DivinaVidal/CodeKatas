import java.util.ArrayList;


public class Passenger {

    private String name;

    public Passenger() {
        name = "Unknown";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Passenger: " + this.getName();
    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
    }
}

