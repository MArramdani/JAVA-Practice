package myApp;

import java.util.Scanner;
 class Practice2{
//hello sayer
    static void sayHello(){
        System.out.println("Hellooo world.");
    }

//counter
    static void count(int x){
        for(int i=1;i<=x;i++){
            System.out.println("Number: "+i);
        }

    }

//average finder
    static double average(double[] average){
        double sum = 0;
        for(double t:average){
            sum+=t;
        }
        return (sum/average.length);
    }

//table maker for double values in used in the average finder
    static double[] table_maker(){
        Scanner in = new Scanner(System.in);
        System.out.println("how many numbers you want to calculate their average?");
        int max=in.nextInt();
        double[] result = new double[max];
        for(int i=1;i<=max;i++){
            System.out.println("enter the value "+i+" from " + max);
            result[i-1]=in.nextDouble();
        }
        in.close();
        return result;
    }


    public static void main(String[] args) throws InterruptedException{
        Scanner read=new Scanner(System.in);
        /***************************************************************** */
        sayHello();
        
        /***************************************************************** */

        System.out.println("enter a number and i will count to it:");
        int coun=read.nextInt();
        count(coun);

        /***************************************************************** */

        double avg =average(table_maker());
        System.out.println("your average number is: "+avg);


        /***************************************************************** */
        Animal cat= new Animal();
        for(int i=0;i<4;i++){
        cat.meow();
        Thread.sleep(500);
        }
        cat.age=2;
        cat.setName("tom");
        System.out.println("the name of your cat is: "+cat.getName());

        /**************************************************************** */
        Animal dog=new Animal("doggo", 5, 100);
        System.out.println("your newly constructed dog object has the name: "+ dog.getName());

        /******************************************************************/
        
        double num=1.96;
        System.out.println("the number "+num +" raised the power of 2 is: "+Math.pow(num, 2)+", using the floor function we would get: "+Math.floor(num)+" while ceil would give us "+ Math.ceil(num));

        /******************************************************************* */
        Animal.hello();
        System.out.println("you created "+Animal.CREATED+" instances of Animal class");

        /***************************************************************** */
        System.out.println(Animal.PI + " is the value of PI saved as a static final variable, which isnt variable anymore.");







        read.close();
    } //end of main
} //end of class





