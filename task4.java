import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Please enter a positive integer!");
        n = input.nextInt();
        int sum= 0;

        for(int i= 1; i<=n; i++) {
            if(i % 2 == 0) {
                sum += i;
            }
            else{
                sum += i;

            }

        } System.out.println(sum); //sorry I didn't get it

    }
}
