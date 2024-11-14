import task1.Cow;
import task1.Farm;
import task1.Horse;
import task1.Sheep;
import task2.*;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // task 1
//        task1();

        // task 2
        // Орел
        Animals animals1 = new Eagle("kok", 5, "Female");

        // Акула
        Animals animals2 = new Shark("kok", 8, "Male");
        //    Черепаха
        Animals animals3 = new Turtle("jashyl", 40, "Male");

        Animals[] animals = {animals1, animals2, animals3};
        System.out.println(Arrays.toString(animals));
        System.out.println("+++++++++++++++++++++++++++");

//        findByColor(animals);
        findByGender(animals,"Female");



    }

    public static void findByColor(Animals[] animals) {
        boolean islaik = false;
        for (Animals animal : animals) {
            if (animal.getColor().equalsIgnoreCase("kok")) {
                islaik = true;
                System.out.print("get color : ");
                System.out.println(animal);
            }
        }
        if (!islaik) {
            System.out.println("not found get color");
        }
    }


    public static void findByGender(Animals[] animals,String gender){
        boolean islaik = false;

        for (Animals animal : animals) {
            if (animal.getGender().equalsIgnoreCase(gender)) {
                islaik = true;
                System.out.print("get gender : ");
                System.out.println(animal);
            }
        }
        if (!islaik) {
            System.out.println("not found get color");
        }
    }



    public static void task1() {
        Sheep[] sheep = {
                new Sheep(56.0,3,"Male","kara kashka"),
                new Sheep(67.0,2,"Female","ak kashka"),
                new Sheep(89.0,1,"Male","kok koz")
        };

        Cow[] cows = {
                new Cow(130.0,5,"Male","ai bash"),
                new Cow(100.0,6,"Male","kun bash"),
                new Cow(145.0,4,"Female","chon bash")
        };


        Horse[] horses = {
                new Horse(170.0,8,"Male","Axiles","ak"),
                new Horse(170.0,8,"Male","gerkules", "kara"),
                new Horse(170.0,8,"Male","gerakyl","bos")
        };

        Farm farm1  = new Farm("Chyi 178","Amir",cows,sheep,horses);
        System.out.println(farm1);

    }


}