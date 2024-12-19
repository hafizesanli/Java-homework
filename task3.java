import java.util.Scanner;
public class task3 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        int num1, num2;
        System.out.println("Please enter 2 integers: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        int gcd = GCD(num1, num2);
        System.out.println("GCD = " +gcd);

    }
    public static int GCD(int num1, int num2){
        if(num2==0){
            return num1;
        }
        else {
            return GCD(num2, num1 % num2);
        }
    }
}
