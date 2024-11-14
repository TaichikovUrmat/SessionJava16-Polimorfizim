package task1;

public class Cow extends Animals{


    public Cow(double weight, int age, String gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    @Override
    public String toString() {
        return "Cow{} " + super.toString();
    }
}
