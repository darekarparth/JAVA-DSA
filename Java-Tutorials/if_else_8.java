public class if_else_8 {
    public static void main(String[] args) {
        boolean isRaining = true;
        if (isRaining)
        {
            System.out.println("Bring an umbrella");

        }
        else{
            System.out.println("Enjoy your Day");

        }   

        int time = 20;
        if (time < 18) {
            System.out.println("You are early");
        }
        else{
            System.out.println("You are late");
        }
    
        
        int x = 20;
        int y = 18;
        if (x > y) {
        System.out.println("x is greater than y");
        }

        int x1 = 20;
        int y1 = 20;
        if (x1==y1) {
            System.out.println("X1 is equal to y1");
        }

        boolean islightson = true;
        if (islightson == true){
            System.out.println("Lights ar on");    
        }
        System.out.println("This line runs no matter what, because it is outside the if statement.");

        int weather = 2;
        if (weather == 1 ) {
            System.out.println("Sunny");
        } 
        else if (weather == 2) {
            System.out.println("Its cloudy");
        }
        else {
            System.out.println("It's Raining");
        }

        int timing = 22;
        if (timing < 10) {
        System.out.println("Good morning.");
        } else if (timing < 18) {
        System.out.println("Good day.");
        } else {
        System.out.println("Good evening.");
        }

        // Short Hand if...else
        // There is also a short-hand if else, which is known as the ternary operator because it consists of three operands.
        // It can be used to replace multiple lines of code with a single line, and is most often used to replace simple if else statements:
        // variable = (condition) ? expressionTrue :  expressionFalse;
        
        int timer = 20;
        if (timer < 18) {
        System.out.println("Good day.");
        } else {
        System.out.println("Good evening.");
        }

        int timer1 = 20;
        String result = (timer1<18)?"Good day" : "Good evening";
        System.out.println(result);


        // Nested If
        // You can also place an if statement inside another if. This is called a nested if statement.
        // A nested if lets you check for a condition only if another condition is already true.

        int num1 = 10;
        int num2 = 20;
        if (num1<15){
            System.out.println("Num is smaller than 15");
            if (num2>18) {
                System.out.println("Num2 is greater than 18");
            }
        }

        int age1 = 27;
        boolean isCitizen = false;
        if (age1>=18){
            if (isCitizen == true){
                System.out.println(" Citizen Eligible for vote ");
            }else{
                System.out.println("Not Citizen hence not eligible for vote");
            }
        }
        else{
            System.out.println("Not Eligible for vote");
        }

        // Logical Operators in Conditions
        // && (AND) - all conditions must be true
        // || (OR) - at least one condition must be true
        // ! (NOT) - reverses a condition (true = false, false = true)
        int a = 100;
        int b = 33;
        int c = 400;
        if (a>b && c>a){
            System.out.println("Both conditions are true");
        }
        if (a>b || b>c){
            System.out.println("One of the condition is True");
        }
        if (!(a>b)){
            System.out.println("Condition is false");
        }

        // Real Life Example
        boolean isLoggedIn = true;
        boolean isAdmin = false;
        int securityLevel = 3; // 1 = highest

        if (isLoggedIn && (isAdmin || securityLevel <= 2)) {
        System.out.println("Access granted");
        } else {
        System.out.println("Access denied");
        }
        
    }
}
