public class Booleans_7 {
    public static void main(String[] args) {
        // Very often in programming, you will need a data type that can only have one of two values, like:

        // YES / NO
        // ON / OFF
        // TRUE / FALSE

        boolean isJavafun = true;
        boolean isFishtasty = false;
        System.out.println(isJavafun);
        System.out.println(isFishtasty);

        int x = 10;
        int y = 11;
        System.out.println( x>y);
        System.out.println( x<y);
        System.out.println( x==y);
        System.out.println(x == 10); // returns true, because the value of x is equal to 10
        System.out.println(10 == 15); // returns false, because 10 is not equal to 15

        int myAge = 27;
        int voteAge = 18;
        if (myAge >= voteAge){
            System.out.println("Eligible to vote");
            }
            else{
                System.out.println("Not eligible to vote");
            }
        
        
        // System.out.println(myAge>=voteAge);
        

        
    }

}
