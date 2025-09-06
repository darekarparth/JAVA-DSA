public class Type_Casting {
    public static void main(String[] args) {
        // Type casting is when you assign a value of one primitive data type to another type.

        // In Java, there are two types of casting:

        // Widening Casting (automatically) - converting a smaller type to a larger type size
        // byte -> short -> char -> int -> long -> float -> double

        // Narrowing Casting (manually) - converting a larger type to a smaller size type
        // double -> float -> long -> int -> char -> short -> byte
        
        // Widening Casting
        int myInt = 9;
        double mydouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);
        System.out.println(mydouble);


        // Narrowing Casting
        double myDouble = 9.5d;
        int myint = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);
        System.out.println(myint);

        // Real Life Example
        int maxScore = 500; // Maximum score in a game is 500
        int userScore = 427; // User scored 427 points
        double percentage = (double) userScore / maxScore * 100.0d; // Calculate percentage
        System.out.println("User's percentage" + percentage);

    }
}
