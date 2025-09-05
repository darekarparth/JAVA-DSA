public class Variables {
    public static void main(String[] args) {
        String name = "Parth";
        System.out.println(name);

        int myNum = 15;
        System.out.println(myNum);

        int num;
        num = 16 ;
        System.out.println(num);

        int num1 = 15;
        num1 = 20;
        System.out.println(num1);

        // Final Variables
        // If you don't want others (or yourself) to overwrite existing values, use the final keyword 
        // (this will declare the variable as "final" or "constant", which means unchangeable and read-only):

        // final int num2 = 15;
        // num2 = 20;  // will generate an error: cannot assign a value to a final variable

        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        String name1 = "John";
        System.out.println("Hello " + name1);

        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        int x = 5;
        int y = 6;
        System.out.println(x + y); // Print the value of x + y

        int a = 5;
        int b = 6;
        int c = 50;
        System.out.println(a + b + c);

        int p, q, r;
        p = q = r = 50;
        System.out.println(p + q + r);

        // Java Identifiers
        // All Java variables must be identified with unique names.
        // These unique names are called identifiers.
        // Identifiers can be short names (like x and y) or more descriptive names (age, sum, totalVolume).
        // Note: It is recommended to use descriptive names in order to create understandable and maintainable code:
        
        // Good
        int minutesPerHour = 60;

        // OK, but not so easy to understand what m actually is
        int m = 60;
    
        String studentName = "John Doe";
        int studentID = 15;
        int studentAge = 23;
        float studentFee = 75.25f;
        char studentGrade = 'B';

        // Print variables
        System.out.println("Student name: " + studentName);
        System.out.println("Student id: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);

        // Create integer variables
        int length = 4;
        int width = 6;
        int area;

        // Calculate the area of a rectangle
        area = length * width;

        // Print variables
        System.out.println("Length is: " + length);
        System.out.println("Width is: " + width);
        System.out.println("Area of the rectangle is: " + area);
    
    }
}

// In Java, there are different types of variables, for example:

// String - stores text, such as "Hello". String values are surrounded by double quotes
// int - stores integers (whole numbers), without decimals, such as 123 or -123
// float - stores floating point numbers, with decimals, such as 19.99 or -19.99
// char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
// boolean - stores values with two states: true or false


// Names can contain letters, digits, underscores, and dollar signs
// Names must begin with a letter
// Names should start with a lowercase letter, and cannot contain whitespace
// Names can also begin with $ and _
// Names are case-sensitive ("myVar" and "myvar" are different variables)
// Reserved words (like Java keywords, such as int or boolean) cannot be used as names