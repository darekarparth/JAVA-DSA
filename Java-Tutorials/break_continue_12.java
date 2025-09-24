public class break_continue_12{
    public static void main(String[] args){
        int i;
        for (i = 0; i < 10; i++)
        {
            if (i == 4){
                break;
            }
            System.out.println(i);

        }
        

        int j;
        for(j = 0; j<=10; j++){
            if(j == 4){
                continue;
            }
            System.out.println(j);
        }

        int k;
        for(k=0; k<10; k++){
            if(k==2){
                continue;
                
            }
            if(k==8){
                break;
            }
            System.out.println(k);
        }

        int l = 0;
        while(i<10){
            System.out.println(l);
            l++;
            if(l == 4){
                break;
            }
        }

        int m = 0;
        while(m<10){
            m++;
            if(m == 6){
                continue;
            }
            System.out.println(m);
            m++;
        }
        System.err.println("");
        // Real life Example
        int[] numbers = {3, -1, 7, 0, 9};
        for(int n:numbers){
            if (n<0){
                continue;
            }
            if (n == 0){
                break;

            }
            System.out.println(n);
        }
    }
}