import java.util.Scanner;

public class while_döngüsü {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = input.nextInt();
        int faktoriyel = 1;
        while (sayi >= 1){
            faktoriyel = faktoriyel * sayi;
            sayi--;
        input.close();
        }
        System.out.println("Bu sayının faktöriyeli:  " + faktoriyel);
    }
}
