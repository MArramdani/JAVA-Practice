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
        Scanner read = new Scanner(System.in);
        String inputvar = read.nextLine();
        System.out.println("write something here: " + inputvar);
    


        //Problem using + A bartender sold 64 bottles of lemonade and 23 bottles of fanta. You need to calculate how many total bottles are sold. :
        int lemonade = 64;
        int fanta = 23;
        int total = lemonade + fanta ;
        System.out.println(--total); //one was free. removed 1 using decremenent

        //Problem: sort by Km and M from a normal distance from meters
       int distance = read.nextInt();
       
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

   
       boolean isSuspended = read.nextBoolean();
       int ourScore = read.nextInt();
       int theirScore = read.nextInt();
      
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

       /*Problem  Logical statements:
        You can win cash by playing the lottery. If the ticket number is a multiple of 10 and 9, the program outputs "You won $200".
        If it is a multiple of 4 or 6, the program outputs "You won $50". In all other cases, there is no prize and the output is "Try again".*/

      
       int number = read.nextInt();
       

       if(number%10 == 0 && number%9 == 0){
           System.out.println("You won $200");
       }
       else if(number%4 == 0 || number%6 == 0){
           System.out.println("You won $50");
       }
       else{
           System.out.println("Try again");
       }
   

       read.close();
}

    
}