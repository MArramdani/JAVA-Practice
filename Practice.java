import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        /**example documentation comment*/
        System.out.println("hello world"); //single line comment
        /* multi lines
        comment as we 
        can see here
        */
        String name = "Mohamed";
        int age = 25;
        double score = 16.61;
        char group = 'S';
        boolean online = true;

        System.out.println("My name is "+ name + " and I am " + age + " years old.");
        
        //getting user input 
        Scanner myVar = new Scanner(System.in);
        String inputvar = myVar.nextLine();
        System.out.println("write something here: " + inputvar);
        in.close();

        //Problem using + A bartender sold 64 bottles of lemonade and 23 bottles of fanta. You need to calculate how many total bottles are sold. :
        int lemonade = 64;
        int fanta = 23;
        int total = lemonade + fanta ;
        System.out.println(--total); //one was free. removed 1 using decremenent

        //Problem: sort by Km and M from a normal distance from meters
        Scanner read = new Scanner(System.in);
       int distance = read.nextInt();
        read.close();
       int km = distance / 1000;
       int m = distance % 1000;
       System.out.println(km + "Kelometers \n" + m + "meters");

       /* Probem using logical statments:
    You are an administrator at a football club who must categorize already played games on the team's website.
    The given program takes 3 inputs:
    1. match status - which checks if the match is suspended ("true") or not suspended ("false")
    2. your team's score
    3. opposing team's score.
    Complete the program so that if the match is suspended (the 1st input is "true"), it will output "Suspended".
    If the match is not suspended ( the1st output is false), the following statuses should be set depending on the match result: "Won", "Lost" and "Draw".*/

    Scanner read = new Scanner(System.in);
       boolean isSuspended = read.nextBoolean();
       int ourScore = read.nextInt();
       int theirScore = read.nextInt();
       read.close();
       if(isSuspended){
           System.out.println("Suspended");
       }
       else{
           if(ourScore > theirScore){
              System.out.println("Won"); 
           }
           else if(ourScore == theirScore){
              System.out.println("Draw"); 
           }
           else{
               System.out.println("Lost"); 
           }
       }



   
}

    
}