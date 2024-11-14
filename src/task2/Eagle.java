package task2;

public class Eagle extends Animals{

    public Eagle(String color, int age, String gender) {
        super(color, age, gender);
    }

    @Override
    public String toString() {
        return "Eagle{} " + super.toString();
    }
}
