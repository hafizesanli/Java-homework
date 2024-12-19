import java.util.Scanner;
public class task2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("You have to enter a positive integer!");
        int num = input.nextInt();
        if (num<0){
            System.out.println("Please enter a positive integer!");

        }
        else{
            int count = nrDigits(num);
            System.out.println("This integer has "+ count+" digits.");

        }

    }
    public static int nrDigits(int num){
        if (num<10){
            return 1;

        }
        else{
            return 1+ nrDigits(num/10);
        }

    }
}
