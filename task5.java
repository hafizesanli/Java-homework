import java.util.Scanner;
public class task5 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the lenght of the array: ");
        int lenght = input.nextInt();
        int[] array = new int[lenght];
        int sum= 0;
        System.out.println("Please enter the integers of the array: ");
        for (int i=0; i < lenght; i++){
            array[i] = input.nextInt();
            sum += array[i];
            input.close();

        }
        double avg = ((double) sum/lenght);
        System.out.println("Sum: " + sum + "Avarage: "+ avg);
        input.close();


    }

}
