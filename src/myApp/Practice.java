package myApp;

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

        System.out.println("enter any word or text:");
        String inputvar = read.nextLine();
        System.out.println("write something here: " + inputvar);
    


        //Problem using + A bartender sold 64 bottles of lemonade and 23 bottles of fanta. You need to calculate how many total bottles are sold. :
        int lemonade = 64;
        int fanta = 23;
        int total = lemonade + fanta ;
        System.out.println(--total); //one was free. removed 1 using decremenent

        //Problem: sort by Km and M from a normal distance from meters
        System.out.println("enter at least a 4 digits integer to be sorted to Km and M:");
       int distance = read.nextInt();
       
       int km = distance / 1000;
       int m = distance % 1000;
       System.out.println(km + " Kelometers \n" + m + " meters");

       /* Probem using logical statments:
    You are an administrator at a football club who must categorize already played games on the team's website.
    The given program takes 3 inputs:
    1. match status - which checks if the match is suspended ("true") or not suspended ("false")
    2. your team's score
    3. opposing team's score.
    Complete the program so that if the match is suspended (the 1st input is "true"), it will output "Suspended".
    If the match is not suspended ( the1st output is false), the following statuses should be set depending on the match result: "Won", "Lost" and "Draw".*/

    System.out.println("enter true or false to indicate your team is suspended or not:");
       boolean isSuspended = read.nextBoolean();
       System.out.println("enter our team score (integer):");
       int ourScore = read.nextInt();
       System.out.println("enter their team score:");
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

        System.out.println("enter any integer to see if you win the lottery:");
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
       //Switch statmenets 2 methods

       //method1 
       int day = 15;

       switch (day%7){
            case 1,2,3,4,5:
                System.out.println("Weekday");
                break;
            case 6,7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("unknown day");
       }

       //method2
       String day_type = switch (day%7) {
           case 1,2,3,4,5 -> "Weekday 2.0";
           case 6,7 -> "Weekend 2.0";
           default -> "unknown day 2.0";
       };
       System.out.println(day_type);

       //Factorial of any number entered
            System.out.println("enter a number to calculate its factorial");
            int number_1 = read.nextInt();
            int fact = 1;
            while (number_1>1){
                fact=fact*number_1;
                number_1--;
            }
            System.out.println("your result is: "+fact);

        //For loop example
            for(int i=0;i<3;i++){
                System.out.println("hello Number. "+i);
            }
        //using do while loop to guess numbers with the advantage of the loop to run at least once
            int password;
            do{
                System.out.println("guess a number between 0 and 9");
               password=read.nextInt();
            }while(password!=3);
            System.out.println("Well done!");
	
            /*Loan Calculator

            You take a loan from a friend and need to calculate how much you will owe him after 3 months.
            You are going to pay him back 10% of the remaining loan amount each month.
            Create a program that takes the loan amount as input, calculates and outputs the remaining amount after 3 months.*/
            System.out.println("Enter an amount to remove 10% each time");
            int amount = read.nextInt();
	        for(int i=0;i<3;i++){
		        amount*=0.9;
	        }
	        System.out.println(amount);

            //arrays basics

            int[] arr = new int[4];
            arr[0]=2;

            String[] letters = {"A","B","C","D"};
            System.out.println("the letter at index 2 is: "+ letters[arr[0]]);

            //Summing elements in arrays

            /* a program that takes the length of the array as the first input, creates it, and then takes the next inputs as elements of the array. 
            then go through the array and calculate the sum of the numbers that are multiples of 4.*/
            System.out.println("enter lengh of array to calculate sum of numbers that are multiples of 4:");
            int length = read.nextInt();
            int[] array =  new int[length];
            int sum=0;
            for (int i = 0; i < length; i++) {
                System.out.println("Enter number in place "+ i +" of the array");
                array[i] = read.nextInt();
                if(array[i]%4==0)
                    sum+=array[i];
             }
             System.out.println("the sum of multiples of 4 is: "+sum);

             //using enhanced for loop to calculate the sum of every array entry
             sum=0;
             for(int t: array){
                sum+=t;
             }
             System.out.println("the sum of all entries is: "+sum);


             //handling multi-dimensional arrays: output the content of a 3x3 matrix with numbers 

            int[][] matrix = {
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 0},
            };
            System.out.println("here is the output of the matrix 3x3: ");
            for(int i=0;i<3;i++){
                for(int t: matrix[i]){
                    System.out.println(t);
                }
            }


            /*Problem: Reverse a String
                Write a program to take a string as input and output its reverse.
            The given code takes a string as input and converts it into a char array, which contains letters of the string as its elements.*/

            System.out.print(" enter a sentence: ");
            Scanner read1 = new Scanner(System.in);
            String text = read1.nextLine();
	    	char[] arr2 = text.toCharArray();
	    	char[] result = new char[arr2.length];
	    	for(int i=0; i<arr2.length;i++){
	    		result[i]=arr2[arr2.length-i-1];
	    	}
    		String reverse = new String(result);
	    	System.out.println("the reverese of "+ text +" is: "+reverse);



       read.close();
       read1.close();

}}

    
