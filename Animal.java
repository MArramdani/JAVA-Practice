public class Animal{
    public String name;
    public int age;
    public double height;
    public static int CREATED=0;
    public static final double PI=3.14;

    /****************************************** */

    public Animal(String name, int age, double height){
        this.name=name;
        this.age=age;
        this.height=height;
        CREATED++;
    }//End of 3 parameters constructer

    public Animal(){
        CREATED++;
    }//End of 0 parameters constructer


    /****************************************** */
    public static void hello(){
        System.out.println("hello using static method");
    }

    public void meow(){
        System.out.println("Meow!!!");
    }//end of meow

    public void setName(String n){
        this.name=n;
    }//end of name setter

    public String getName(){
        return name;
    }//end of name getter


}//end of class
