
public class data_types {
    public static void main(String[] args) {
        // Integer Types
        // Byte
        // The byte data type can store whole numbers from -128 to 127. 
        // This can be used instead of int or other integer types to save memory when you are certain that the value will be within -128 and 127:
        
        byte myNum = 100;
        System.out.println(myNum);

        // Short
        // The short data type can store whole numbers from -32768 to 32767:
        short mynum1 = 5000;
        System.out.println(mynum1);


        // Int
        // The int data type can store whole numbers from -2,147,483,648 to 2,147,483,647.
        int myNum2 = 100000;
        System.out.println(myNum2);

        // Long
        // The long data type can store whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
        // Note that you should end the value with an "L": 
        long myNum3 = 15000000000L;
        System.out.println(myNum3);
        
        // Floating Point Types
        // You should use a floating point type whenever you need a number with a decimal, such as 9.99 or 3.14515.
        // The float and double data types can store fractional numbers. 
        // Note that you should end the value with an "f" for floats and "d" for doubles:

        float myNum4 = 5.75f;
        System.out.println(myNum4);

        double myNum5 = 19.99d;
        System.out.println(myNum5);
        
        // Use float or double?
        // The precision of a floating point value indicates how many digits the value can have after the decimal point. 
        // The precision of float is only 6-7 decimal digits, while double variables have a precision of about 16 digits.
        // Therefore it is safer to use double for most calculations.

        // Scientific Numbers
        // A floating point number can also be a scientific number with an "e" to indicate the power of 10:
        float f1 = 35e3f;
        double d1 = 12E4d;          
        System.out.println(f1);
        System.out.println(d1);


        // Boolean Type
        // Very often in programming, you will need a data type that can only have one of two values, like:

        // YES / NO
        // ON / OFF
        // TRUE / FALSE

        boolean isjavafun = true;
        boolean isfishtasty = false;
        System.out.println(isjavafun);
        System.out.println(isfishtasty);

        // Characters Type
        //  The char data type is used to store a single character.         
        //  Char values are surrounded by single quotes, like 'A' or 'c'.
        char myGrade = 'B';
        System.out.println(myGrade);

        // Alternatively, if you are familiar with ASCII values, you can use those to display certain characters:
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        // The String Type
        String greetings = "Hello World";
        System.out.println(greetings);

        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        // Print variables
        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost = " + totalCost + currency);

        // Non-Primitive Data Types

        // Non-primitive data types are called reference types because they refer to objects.

        // The main differences between primitive and non-primitive data types are:

        // Primitive types in Java are predefined and built into the language, while non-primitive types are created by the programmer (except for String).
        // Non-primitive types can be used to call methods to perform certain operations, whereas primitive types cannot.
        // Primitive types start with a lowercase letter (like int), while non-primitive types typically starts with an uppercase letter (like String).
        // Primitive types always hold a value, whereas non-primitive types can be null.
        // Examples of non-primitive types are Strings, Arrays, Classes etc. You will learn more about these in a later chapter.

        // Var Keyword
        // The var Keyword
        // The var keyword was introduced in Java 10 (released in 2018).
        // The var keyword lets the compiler automatically detect the type of a variable based on the value you assign to it.
        // This helps you write cleaner code and avoid repeating types, especially for long or complex types.
        // For example, instead of writing int x = 5;, you can write:
        var x = 5;
        System.out.println(x);
        // When using var, the compiler understands that 5 is an int.
        var myNum7 = 5;         // int
        var myDouble = 9.98;   // double
        var myChar = 'D';      // char
        var myBoolean = true;  // boolean
        var myString = "Hello"; // String

        // 1. var only works when you assign a value at the same time (you can't declare var x; without assigning a value):
        // var x; // Error
        // var x = 5;  // OK

        // 2. Once the type is chosen, it stays the same. See example below:
        // var x = 5;  // x is now an int
        // x = 10;     // OK - still an int
        // x = 9.99;   // Error - can't assign a double to an int

        // When to Use var
        // For simple variables, it's usually clearer to write the type directly (int, double, char, etc.).
        // But for more complex types, such as ArrayList or HashMap, var can make the code shorter and easier to read:
        
        // // Without var
        // ArrayList<String> cars = new ArrayList<String>();

        // // With var
        // var cars = new ArrayList<String>();


    }
    
}
