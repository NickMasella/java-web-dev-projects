package src.main.java.org.example;
import java.util.ArrayList;
public class ArrayList1 {
    public static int sumEven (ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
    public static String printWords(ArrayList<String> arr){
        String[] fiveLetterWords;
        for (String str : arr){
            if (str.length()== 5){

            }
        }
        return "yea";
    }
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
            integers.add(1);
            integers.add(2);
            integers.add(3);
            integers.add(4);
            integers.add(5);
            integers.add(6);
            integers.add(7);
            integers.add(8);
            integers.add(9);
            integers.add(10);

        System.out.println(sumEven(integers));




    }
}

