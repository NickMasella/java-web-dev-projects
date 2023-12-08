package src.main.java.org.example;
import java.util.Arrays;
public class Array {
    public static void main(String[] args){
        int[] integerArray = {1, 1, 2, 3, 5, 8};

        for (int i : integerArray){
            System.out.println(i);
        }
        for (int i : integerArray){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

        String catInHat = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

        String[] catArray = catInHat.split(" ");
        System.out.println(Arrays.toString(catArray));
        String[] catArray2 = catInHat.split("\\.");
        System.out.println(Arrays.toString(catArray2));

    }
}
