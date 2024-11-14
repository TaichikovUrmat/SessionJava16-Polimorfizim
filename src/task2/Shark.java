package task2;

public class Shark extends Animals{


    public Shark(String color, int age, String gender) {
        super(color, age, gender);
    }

    @Override
    public String toString() {
        return "Shark{} " + super.toString();
    }
}
