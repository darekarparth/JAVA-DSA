public class Arrays_13 {
    public static void main(String[] args){
        int[] mynumbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(mynumbers[0]);
        int i;
        for(i=0; i<=10; i++){
            System.out.println(i);
        }

        System.out.println("-------");
        
        String[] cars = {"Volvo", "BMW", "Audi"};
        System.out.println(cars[1]);
        for(String car: cars){
            System.out.println(car);
        }
        cars[0]="Mercedes";
        System.out.println(cars[0]);
        System.out.println(cars.length);
        
        System.out.println("-------");
        // You can also create an array by specifying its size with new. 
        // This makes an empty array with space for a fixed number of elements, which you can fill later:
        int[] mynum = new int[5];
        mynum[0]=10;
        mynum[1]=20;
        mynum[2]=30;
        mynum[3]=40;
        mynum[4]=50;
        for(int num:mynum){
            System.out.println(num);
        }
        
        System.out.println("-------");
        
        String[] mycar = new String[3];
        mycar[0]= "Ferrari";
        mycar[1]= "Lamborghiniveneno";
        mycar[2]= "Porsche";
        for(String sportster : mycar){
            System.out.println(sportster);
        }
        
        System.out.println("-------");
        
        String[] fruits = {"Apple","Orange","Mango","Kiwi"};
        int j;
        for(j = 0; j<fruits.length; j++){
            System.out.println(fruits[j]);
        }

        System.out.println("-------");
        
        System.out.println("-------");
        int[] numericals = {5,6,7,8,9,10};
        int k;
        for (k=0; k<numericals.length; k++){
            System.out.println(numericals[k]);
        }

        int[] newnumbers = {1,2,3,4,5,6};
        int sum = 0;
        int l;
        for (l=0; l<newnumbers.length; l++){
            sum+=newnumbers[l];
        }
        System.out.println("Sum is:" + " " + sum );

        // Real Life Example
        int[] numero  = {45, 12, 98, 33, 27};
        int max = numero[0];
        int min = numero[0];
        for (int nu : numero){
            if (nu>max){
                max = nu;
            }
            if(nu<min) {
                min = nu;
            }

        } 
        System.out.println(max);
        System.out.println(min);


        // Multidimensional Arrays
        int[][] mynumero = {{1,4,2},{6,3,5}};
        mynumero[1][1] = 8;
        System.out.println(mynumero[0][1]);
        System.out.println(mynumero[1][1]);


        int[][] myNumbers = { {1, 4, 2}, {3, 6, 8, 5, 2} };
        System.out.println("Rows: " + myNumbers.length);             // 2
        System.out.println("Cols in row 0: " + myNumbers[0].length); // 3
        System.out.println("Cols in row 1: " + myNumbers[1].length); // 5

        System.err.println("");

        int[][] num = {{1,4,2},{3, 6, 8, 5, 2}};
        int m;
        int n;
        for(m=0; m<num.length; m++){
            for(n=0; n<num[m].length; n++){
                System.out.println(num[m][n]);
            }
        }


        System.out.println("-------");
        int[][] mynumb = { {1, 4, 2}, {3, 6, 8, 5, 2} };
        for (int[] row : mynumb) {
        for (int col : row) {
            System.out.println(col);
            }
        }

    }
}
