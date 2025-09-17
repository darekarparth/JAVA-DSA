public class switch_9{
    public static void main(String[] args){
        // The switch expression is evaluated once.
        // The result is compared with each case value.
        // If there is a match, the matching block of code runs.
        // The break statement stops the switch after the matching case has run.
        // The default statement runs if there is no match.
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

        int day1 = 4;
        switch (day1) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }
        
        
    }   
}