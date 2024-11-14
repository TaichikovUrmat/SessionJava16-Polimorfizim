package task2;

public class Turtle extends Animals{

    public Turtle(String color, int age, String gender) {
        super(color, age, gender);
    }

    @Override
    public String toString() {
        return "Turtle{} " + super.toString();
    }
}
