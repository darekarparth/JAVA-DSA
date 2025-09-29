public class J4_ClassMethods {
    //An example to demonstrate the differences between static and public methods:
    static void mystaticMethod(){
        System.out.println("Static methods can be called without creating objects");
    } 

    public void mypublicMethod(){
        System.out.println("Public method must be called by creating objects");
    }

    public void fullthrottle(){
        System.out.println("The car is going fast");
    }

    public void speed(int maxspeed){
        System.out.println("Max speed is: " + maxspeed);
    }
    public static void main(String[] args){
        mystaticMethod();
        // myPublicMethod(); This would compile an error

        J4_ClassMethods myObj = new J4_ClassMethods();
        myObj.mypublicMethod();
        myObj.fullthrottle();
        myObj.speed(400);

    }
}

class Second{
    public static void main(String[] args){
        J4_ClassMethods myObj1 = new J4_ClassMethods();
        myObj1.fullthrottle();
        myObj1.speed(400);
    }
}
