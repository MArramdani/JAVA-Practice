public class Animal{
    String name;
    int age;
    double height;

    public Animal(String name, int age, double height){
        this.name=name;
        this.age=age;
        this.height=height;
    }//End of 3 parameters constructoer

    public Animal(){
        
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
