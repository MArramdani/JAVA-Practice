

import java.util.Scanner;
import ConverterApp.Converter;

public class App {
    public static void main(String[] args) throws Exception {
    
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to be converted to binary");
        int x = sc.nextInt();
        System.out.print(Converter.toBinary(x));
        sc.close();

    }
}
