import java.util.Scanner;

public class Practice2 {

    static void sayHello(){
        System.out.println("Hellooo world.");
    }
    static void count(int x){
        for(int i=1;i<=x;i++){
            System.out.println("Number: "+i);
        }

    }



    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        sayHello();
        System.out.println("enter a number and i will count to it:");
        int coun=read.nextInt();
        count(coun);

    } //end of main
} //end of class





