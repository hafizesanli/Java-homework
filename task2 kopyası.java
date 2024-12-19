import java.util.Collections;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please press 1 to sort ascending order, press 2 to sort descending order: ");

        int[] array = {3, 7, 9, 12, 4, 3};
        task1.sort(array);

        int a = input.nextInt();

        if(a == 1){
            for (int e : array){
                System.out.print(e + " ");
            }

        }
        if(a == 2){
            for (int e : array){
                task1.sort(array,Collections.reverseOrder());
                System.out.print(e + " ");
            }
        }
    }
}
