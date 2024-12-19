import java.util.Scanner;

public class PatchAntennaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter the operating frequency in GHz: ");
        double frequency = input.nextDouble();


        System.out.println("Enter the dielectric constant of the substrate: ");
        double dielectricConstant = input.nextDouble();


        System.out.println("Enter the desired resonant frequency in GHz: ");
        double resonantFrequency = input.nextDouble();


        double wavelength = 300 / frequency;
        System.out.println("The wavelength in millimeters is: " + wavelength);


        double effectiveDielectricConstant = (dielectricConstant + 1) / 2 + (dielectricConstant - 1) / 2 * Math.sqrt(1 + 12 / dielectricConstant * (1 - resonantFrequency / frequency));
        System.out.println("The effective dielectric constant is: " + effectiveDielectricConstant);


        double length = wavelength / (2 * Math.sqrt(effectiveDielectricConstant));
        System.out.println("The length of the patch antenna in millimeters is: " + length);


        double width = wavelength / (2 * Math.sqrt(effectiveDielectricConstant));
        System.out.println("The width of the patch antenna in millimeters is: " + width);

        input.close();
    }
}
