import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
       System.out.print("Digite a temperatura em Celsius: ");
       double celsius = scanner.nextDouble();
       scanner.close();
       @SuppressWarnings("unused")
    double fahenheit = (celsius * 9/5) + 32;
       System.out.printf(celsius+" graus Celsius é igual a "+fahenheit+" graus fahrewnheit");
        
    }
}