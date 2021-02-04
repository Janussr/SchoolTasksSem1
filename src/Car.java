import java.util.Scanner;

public class Car {
    private String color;
    private int age;
    private int amountOfWheels;
    private boolean isWorking;

    public Car(String color, int age, int amountOfWheels, boolean isWorking){
        this.color = color;
        this.age = age;
        this.amountOfWheels = amountOfWheels;
        this.isWorking = isWorking;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAmountOfWheels() {
        return amountOfWheels;
    }

    public void setAmountOfWheels(int amountOfWheels) {
        this.amountOfWheels = amountOfWheels;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
