//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Please input some integers to find the maximum pairwise product!");
        Scanner sc = new Scanner(System.in);
        int list_length = sc.nextInt();
        sc.nextLine();
        String[] input_string_array = sc.nextLine().split(" ");

        int biggest = 0;
        int second_biggest = 0;
        for (int i=0; i < list_length; i++) {
            if (Integer.parseInt(input_string_array[i]) > biggest) {
                second_biggest = biggest;
                biggest = Integer.parseInt(input_string_array[i]);
            }
            else if (Integer.parseInt(input_string_array[i]) > second_biggest) {
                second_biggest = Integer.parseInt(input_string_array[i]);
            }
        }
        System.out.println("The maximum pairwise product is: " + biggest*second_biggest);

    }
}