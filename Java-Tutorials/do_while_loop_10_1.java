public class do_while_loop_10_1 {
    public static void main(String[] args){
        // The do/while loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true. 
        // Then it will repeat the loop as long as the condition is true.
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while(i<5);

        System.out.println("____________");
        // Condition is False from the Start
        int j = 10;
        do {
            System.out.println(j);
            j++;
        }       
        while(j<5);
        // Note: The do/while loop is used when you want to run a block of code at least once, regardless of the condition being true or false.
    }
}
