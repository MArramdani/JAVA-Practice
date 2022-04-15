package myApp;

import myApp.Converter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
         Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Converter con=new Converter();
        System.out.print(con.toBinary(x));
        sc.close();

    }
}
