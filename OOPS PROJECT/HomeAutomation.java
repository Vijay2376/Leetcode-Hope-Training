import java.util.*;
abstract class Device {
    private String name;   
    public Device(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    abstract void turnOn();
    abstract void turnOff();
}
class Light extends Device {
    public Light(String name) {
        super(name);
    }
    void turnOn() {
        System.out.println(getName() + " Light is ON ");
    }
    void turnOff() {
        System.out.println(getName() + " Light is OFF ");
    }
}
class Fan extends Device {
    public Fan(String name) {
        super(name);
    }    
    void turnOn() {
        System.out.println(getName() + " Fan is ON ");
    }
    void turnOff() {
        System.out.println(getName() + " Fan is OFF ");
    }
}
public class HomeAutomation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Device light = new Light("Living Room");
        Device fan = new Fan("Bedroom");
        while (true) {
            System.out.println("\n--- Home Automation ---");
            System.out.println("1. Turn ON Light");
            System.out.println("2. Turn OFF Light");
            System.out.println("3. Turn ON Fan");
            System.out.println("4. Turn OFF Fan");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    light.turnOn();
                    break;
                case 2:
                    light.turnOff();
                    break;
                case 3:
                    fan.turnOn();
                    break;
                case 4:
                    fan.turnOff();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}