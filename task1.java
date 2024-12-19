import java.util.Scanner;
public class task1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive integer n: ");

        int n= input.nextInt();
        int count=1;

        int a= 0;

        int b= 1;

        while(count<=n){
            System.out.println(a+ " ");
            int sum = a + b;
            a = b;
            b = sum;
            count++;


            }
    }
}
