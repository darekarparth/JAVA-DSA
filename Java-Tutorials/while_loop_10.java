public class while_loop_10 {
    public static void main(String[] args){
        // The while loop repeats a block of code as long as the specified condition is true:
        
        int i = 0;
        while (i < 5){
            System.out.println(i);
            i++;
        }
        
        System.out.println("____________");

        // Countdown Example
        int countdown = 3;
        while(countdown>0){
            System.out.println(countdown);
            countdown--;
        }
        System.out.println("Happy New Year");
        
        // 
        int j = 10;
        while(j<5){
            System.out.println("This will never be printed");
            i++;
        }
        // Note: A while loop may never run if the condition is false from the start. 
        // In the next chapter, you will learn about the do while loop, which always runs the code at least once before checking the condition.

        int dice =1;
        while (dice<=6){
            if (dice < 6){
                System.out.println("No Yatzee");
            }
            else{
                System.out.println("Yatzee");

            }
            dice++;
        }

    }
}