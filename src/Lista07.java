
import java.util.Scanner;

public class Lista07{
public static void main(String[] args) {
    
    double lado, area;
    Scanner input;
    
    System.out.println("Escreva um dos lados:");
    input = new Scanner(System.in);
    lado = input.nextDouble(); 

    area = (lado * lado) * 2;
    
    System.out.println("O dobro da area do seu quadrado: " + area);
    input.close();
    }
}