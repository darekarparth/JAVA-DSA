public class math_6 {
    public static void main(String[] args) {
        System.out.println(Math.max(5, 10));
        System.out.println(Math.min(5,10));
        System.out.println(Math.sqrt(81));
        System.out.println(Math.abs(-4.4)); // returns the absolute (positive) value of -4.4
        System.out.println(Math.pow(2, 8)); // returns 2 to the power of 8 = 256
        System.out.println(Math.round(4.6566));
        System.out.println(Math.ceil(4.1));
        System.out.println(Math.floor(4.9));
        System.out.println(Math.random()); // returns a random number between 0.0 and 1.0

        // To get more control over the random number, for example, if you only want a random number between 0 and 100, 
        // you can use the following formula:
        int randomnum = (int)(Math.random()*101); // 0 to 100
        System.out.println(randomnum);
    }

    
}
