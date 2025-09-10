public class Operators_4 {
    public static void main(String[] args) {
        // Operators are used to perform operations on variables and values.
        // In the example below, we use the + operator to add together two values:
        int x = 100 + 50;
        System.out.println(x);

        int sum1 = 100 + 50;        // 150 (100 + 50)
        int sum2 = sum1 + 250;      // 400 (150 + 250)
        int sum3 = sum2 + sum2;     // 800 (400 + 400)
        System.out.println(sum1 + " " + sum2 + " " + sum3);

        // Arithmetic operators
        // Assignment operators
        // Comparison operators
        // Logical operators
        // Bitwise operators

        // +	Addition	Adds together two values	x + y	
        // -	Subtraction	Subtracts one value from another	x - y	
        // *	Multiplication	Multiplies two values	x * y	
        // /	Division	Divides one value by another	x / y	
        // %	Modulus	Returns the division remainder	x % y	
        // ++	Increment	Increases the value of a variable by 1	++x	
        // --	Decrement	Decreases the value of a variable by 1	--x

        int x1 = 10;
        int y = 3;
        System.out.println(x1 + y); // 13
        System.out.println(x1 - y); // 7
        System.out.println(x1 * y); // 30
        System.out.println(x1 / y); // 3
        System.out.println(x1 % y); // 1

        int z = 5;
        ++z;
        System.out.println(z);
        --z;
        System.out.println(z);

        // Note: When dividing two integers in Java, the result will also be an integer. 
        // For example, 10 / 3 gives 3. If you want a decimal result, use double values, like 10.0 / 3.

        int a = 10;
        int b = 3;
        System.out.println(a/b);
        
        double c= 10.0;
        double d = 3.0;
        System.out.println(c/d);

        // Java Assignment Operators
        // Assignment operators are used to assign values to variables.
        int f = 10;
        f+=5;
        System.out.println(f);

        // Operator	Example	Same As
        // =	x = 5	x = 5	
        // +=	x += 3	x = x + 3	
        // -=	x -= 3	x = x - 3	
        // *=	x *= 3	x = x * 3	
        // /=	x /= 3	x = x / 3	
        // %=	x %= 3	x = x % 3	
        // &=	x &= 3	x = x & 3	
        // |=	x |= 3	x = x | 3	
        // ^=	x ^= 3	x = x ^ 3	
        // >>=	x >>= 3	x = x >> 3	
        // <<=	x <<= 3	x = x << 3

        // Java Comparison Operators
        // Comparison operators are used to compare two values (or variables). 
        // This is important in programming, because it helps us to find answers and make decisions.
        // The return value of a comparison is either true or false. 
        // These values are known as Boolean values, and you will learn more about them in the Booleans and If..Else chapter.

        int j = 5;
        int k = 3;
        System.out.println(j>k);

        // Operator	Name	Example	Try it
        //     ==	Equal to	    x == y	
        //     !=	Not equal	    x != y	
        //     >	Greater than	x > y	
        //     <	Less than	    x < y	
        //     >=	Greater than or equal to	x >= y	
        //     <=	Less than or equal to	x <= y

        int age = 18;
        System.out.println(age>=18);
        System.out.println(age<18);

        // Java Logical Operators
        //  Logical operators are used to determine the logic between variables or values.
        // Operator	   Name	         Description	Example	Try it
        //     && 	Logical and  	Returns true if both statements are true	            x < 5 &&  x < 10	
        //     || 	Logical or	    Returns true if one of the statements is true	        x < 5 || x < 4	
        //     !	Logical not	    Reverse the result, returns false if the result is true	!(x < 5 && x < 10)

        boolean isLoggedin = true;
        boolean isAdmin = false;

        System.out.println("Regular User: " + (isLoggedin && !isAdmin));
        System.out.println("Has Access: " + (isLoggedin || isAdmin));
        System.out.println("Not Logged in " + (!isLoggedin));

    } 
}
