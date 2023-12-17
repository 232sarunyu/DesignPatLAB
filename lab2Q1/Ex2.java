import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Ex2 {
    public static final int MAX = 5;
    public static void main(String[] args) {
            System.out.println("Welcome to the Application!");
            
            Scanner inp = new Scanner(System.in);
            
            List<Integer> nums = new ArrayList<>();
            
            System.out.println("Enter 5 valid integers in the range [0, 10]");
            
            inputNumbers(inp , nums);
            checktype(nums);
            checkRange(nums);
            sortNumber(nums);
            printDis(nums);

            
        }
        public static void inputNumbers(Scanner inp, List<Integer> nums) {
            while (nums.size() < MAX) {
                String s = inp.nextLine();
    
                try {
                    nums.add(Integer.parseInt(s));
                } catch (NumberFormatException nfe) {
                    System.out.println("Invalid! Try again!");
                }
            }
        }

        public static void checktype(List<Integer> nums){
            for (Number num : nums) {
                if (num instanceof Integer) {
                    System.out.println(num + " is an integer.");
                } else if (num instanceof Float) {
                    System.out.println(num + " is a float.");
                }
            }
        }
        public static void checkRange(List<Integer> nums){
            for (int num : nums) {
                if(num<0 || num > 10) {
                    System.out.println("Invalid range! Try again!");
                }
            }
        }
        public static void sortNumber(List<Integer> nums){
            Collections.sort(nums);
        }
        public static void printDis(List<Integer> nums){
            for (int num : nums) {
                System.out.print(num+" ");
            }
        }
    
}