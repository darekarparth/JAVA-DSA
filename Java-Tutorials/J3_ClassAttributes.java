public class J3_ClassAttributes{
    int x = 5;
    int y;
    int z = 10;
    final int a = 1111;
    int k = 15;

    String fname = "Parth";
    String lname = "Darekar";
    int age = 27; 
    public static void main(String[] args){
        J3_ClassAttributes myobj = new J3_ClassAttributes();
        System.out.println(myobj.x);
        System.out.println(myobj.z);
        J3_ClassAttributes myobj1 = new J3_ClassAttributes();
        myobj1.y = 29;
        System.out.println(myobj1.y);
        J3_ClassAttributes myobj2 = new J3_ClassAttributes();
        myobj2.z = 25;
        System.out.println(myobj2.z);
        J3_ClassAttributes myobj3 = new J3_ClassAttributes();
        // myobj3.a = 2222;
        // System.out.println(myobj3.a);
        J3_ClassAttributes myobj4 = new J3_ClassAttributes();
        J3_ClassAttributes myobj5 = new J3_ClassAttributes();
        myobj4.k = 25;
        System.out.println(myobj4.k);
        System.out.println(myobj5.k);

        System.out.println("Name: " + myobj.fname +" " + "Lastname: " + myobj.lname);
        System.out.println("Age: "+ myobj.age);
    }
}