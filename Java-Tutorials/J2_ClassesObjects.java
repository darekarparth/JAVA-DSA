public class J2_ClassesObjects{
    int x = 5;

    public static void main(String[] args){
        J2_ClassesObjects myobj1 = new J2_ClassesObjects();
        J2_ClassesObjects myobj2 = new J2_ClassesObjects();
        System.out.println(myobj1.x);
        System.out.println(myobj2.x);
    }
}

class second{
    public static void main(String[] args){
        J2_ClassesObjects myobj = new J2_ClassesObjects();
        System.out.println(myobj.x); 
    }
}