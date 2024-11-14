package task1;

import java.util.Arrays;

public class Farm {

    private String address;
    private String ownerName;
    private Cow[] cows = new Cow[20];
    private Sheep[] sheep = new Sheep[20];
    private Horse[] horses = new Horse[20];


    public Farm(String address, String ownerName, Cow[] cows, Sheep[] sheep, Horse[] horses) {
        this.address = address;
        this.ownerName = ownerName;
        this.cows = cows;
        this.sheep = sheep;
        this.horses = horses;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "address='" + address + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", cows=" + Arrays.toString(cows) +
                ", sheep=" + Arrays.toString(sheep) +
                ", horses=" + Arrays.toString(horses) +
                '}';
    }
}

