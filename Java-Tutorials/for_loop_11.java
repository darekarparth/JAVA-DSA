public class for_loop_11 {
    public static void main(String[] args){
        // When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:
        // Print Numbers
        for(int i=0; i<5; i++){
            System.out.println(i);
            
        } 

        //Sum of Numbers 
        int sum = 0;
        int i;
        for(i = 0; i<=10; i++){
            sum +=i ;
        }
        System.out.println("Sum is: " + sum);


        // Countdown
        int countdown = 4;
        for (countdown=4; countdown>=0; countdown--){
            System.out.println(countdown);
        } 

        // Print Even Numbers
        for(int j = 0; j<=10; j+=2){
            System.out.println(j);
        }

        // For Loop With False Condition
        for (int k = 10; k < 5; k++) {
        System.out.println("This will never be printed");
        }

        //Nested For Loops
        for (int l = 0; l<=10; l++){
            System.out.println("Outer loop:" + l); // Executed 11 times
            for(int m=0; m<=10; m++){
                System.out.println(" Inner loop:" + m); // Executed 11 times for each iteration of the outer loop
            }
        }
        
        // Multiplication Table Example
        for (int n=1; n<=3; n++){
            for(int o=1; o<=3; o++){
                System.out.println(n*o+" ");
            }
            System.out.println();
        }

        // For-each Loop
        // The for-each loop is used to loop through elements in an array or collection.
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car: cars){
            System.out.println(car);
        }

        int [] numbers = {10, 20, 30, 40, 50};
        for(int number: numbers){
            System.out.println(number);
        }

        // Real Life Example
        for (int p = 0; p <= 100; p += 10) {
              System.out.println(p);
        } 

        int q = 5;
        int fact = 1;
        for (int r = 1; r<=q; r++){
            fact*=r; // fact = fact * r
        }
        System.out.println("Factorial of"  + q + "is" + fact);
    }
}
