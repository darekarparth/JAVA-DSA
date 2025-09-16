public class string_5_Concatenation {
    public static void main(String[] args){
        String firstname = "John";
        String lastname = "Doe";
        System.out.println(firstname + " " + lastname);
        System.out.println(firstname.concat(lastname));

        String name = "John";
        int age = 27;
        System.out.println("My Name is" + name + "I am " + age + "years old");

        String a = "Java ";
        String b = "is ";
        String c = "fun!";
        String result = a.concat(b).concat(c);
        System.out.println(result);
        
        // WARNING!
        // Java uses the + operator for both addition and concatenation.
        // Numbers are added. Strings are concatenated.
        int x = 10;
        int y = 20;
        System.out.println(x+y);

        String x1 = "10";
        String y1 = "30";
        System.out.println(x1+y1);

        // Strings - Special Characters
        String txt = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt);

        String txt1 = "It\'s alright.";
        System.out.println(txt1);

        String txt2 = "the character \\ is called backslash.";
        System.out.println(txt2);


    }
}