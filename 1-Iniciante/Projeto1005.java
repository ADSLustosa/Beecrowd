import java.util.Scanner;


public class Projeto1005 {
    public static void main(String[] args) {
        double A = scanner.next();
        double B = scanner.next();

        
        double A = Double.parseDouble(inputA);
        double B = Double.parseDouble(inputB);

        
        double pesoA = 3.5;
        double pesoB = 7.5;
        double media = (A * pesoA + B * pesoB) / (pesoA + pesoB);

        System.out.printf("MEDIA = %.5f%n", media);
    }
}