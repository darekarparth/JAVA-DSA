public class J1_methods {
    // Class Scope
    // Variables declared inside a class but outside any method have class scope (also called fields). 
    // These variables can be accessed by all methods in the class:
    int premio = 5;

    
    
    static void myMethod(){ //function defined
        System.out.println("Hello World");
    }

    // Methods Parameters
    static void newMethod(String fname, int age){ //function defined with parameter
        System.out.println(fname + "is" + age + "years old");
    }

    // Example
    static void checkAge(int age){
        if(age<18){
            System.out.println("Cannot vote");
        }
        else if(age==18){
            System.out.println("Eligible for voting");
        }
        else{
            System.out.println("Eligible for citizenship and voting");
        }
    }

    static int newfunction(int x, int y){  //Void method cannot return the value, hence int.
        int z = x+y;
        return z;
    }

    static int myfunction(int a, int b){
        return a%b;
    }

    // Real life example
    static int doublegame(int x){
        return x*2;
    }

    // Method Overloading
    // With method overloading, multiple methods can have the same name with different parameters:
    
    // int myMethod(int x)
    // float myMethod(float x)
    // double myMethod(double x, double y)

    // In the example below, we overload the plusMethod method to work for both int and double:
    static int plusmethod(int x , int y){
        return x+y;
    }

    static double plusmethod(double x, double y){
        return x+y;
    }

    // Java Recursion
    // Recursion is the technique of making a function call itself. 
    // This technique provides a way to break complicated problems down into simpler problems which are easier to solve
    // Use recursion to add all numbers from 1 to 10.
    public static int sum(int k){
        if(k>0){
            return k + sum(k-1);
        }
        else{
            return 0;
        }
    }

    // Use recursion to add all numbers from 5 to 10
    public static int summing(int start, int end){
        if(end>start){
            return end + summing(start, end-1);
        }
        else{
            return 0;
        }
    }
    // Countdown with Recursion
    static void countdown(int n){
        if(n>0){
            System.out.println(n + " ");
            countdown(n-1);
        }
    }
    // Factorial
    static int factorial(int f){
        if(f>1)
        {
            return f*factorial(f-1);
        }
        else
        {
            return 1;
        }
    }

    public static void main(String[] args){
        myMethod(); //Function Called
        myMethod(); //Function Called
        myMethod(); //Function Called
        newMethod("Parth", 27);
        newMethod("Darekar", 100);
        checkAge(18);
        System.out.println(newfunction(10, 10));
        float c = myfunction(5, 9);
        System.out.println(c);

        for(int i=1; i<=5; i++){
            System.out.println("Double of " + i + " is " + doublegame(i));
        }

        int num1 = plusmethod(5,10);
        double num2 = plusmethod(5.6, 6.5);
        System.out.println(num1);
        System.out.println(num2);

        // Java Scope
        // In Java, variables are only accessible inside the region where they are created. This is called scope.

        // Class Scope
        J1_methods myobj = new J1_methods();
        System.out.println(myobj.premio); 

        // Method Scope
        // Variables declared directly inside a method are available anywhere in the 
        // method following the line of code in which they were declared:
        
        // Code here CANNOT use x
        int x = 100;
        // Code here CAN use x
        System.out.println(x);

        // Block Scope
        //A block of code refers to all of the code between curly braces { }.
        // Variables declared inside a block of code are only accessible by the code between the curly braces, 
        // and only after the line in which the variable was declared:
           
           // Code here CANNOT use x
        {  //This is a block
           // Code here CANNOT use x
            int y =200;
           // Code here CAN use x 
            System.out.println(y);
        }  // The block ends here
        // Code here CANNOT use x


        // Loop Scoped
        // Variables declared inside a for loop only exist inside the loop:
        for (int i = 0; i <=10; i++){
            System.out.println(i);
        }
        
        System.out.println("________________");
        // Recursion
        int result = sum(10);
        System.out.println(result);
        System.out.println("________________");
        int result1 = summing(5, 10);
        System.out.println(result1);

        System.out.println("________________");
        countdown(5);
        
        System.err.println("________________");
        int fact = factorial(5);
        System.out.println(fact);

    }   


}

// myMethod() is the name of the method
// static means that the method belongs to the Main class and not an object of the Main class. 
// You will learn more about objects and how to access methods through objects later in this tutorial.
// void means that this method does not have a return value. 
// You will learn more about return values later in this chapter