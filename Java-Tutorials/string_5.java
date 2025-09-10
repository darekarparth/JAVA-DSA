public class string_5 {
    public static void main(String[] args){
        String greetings = "Hello";
        System.out.println(greetings);

        String txt = "FDKSKNFRIJRIE";
        System.out.println("The length og the txt string is: " + txt.length());

        String txt1 = "Hello World";
        System.out.println(txt1.toUpperCase());
        System.out.println(txt1.toLowerCase());

        // The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):
        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(txt2.indexOf("locate")); // Outputs 7

        // Java counts positions from zero.
        // 0 is the first position in a string, 1 is the second, 2 is the third ...
        // You can use the charAt() method to access a character at a specific position in a string:
        String txt3 = "Hello";
        System.out.println(txt3.charAt(0));
        System.out.println(txt3.charAt(4));

        // Comparing Strings
        // To compare two strings, you can use the equals() method:
        String txt4 = "Hello";
        String txt5 = "Hello";

        String txt6 = "Greetings";
        String txt7 = "Great things";
        System.out.println(txt4.equals(txt5));
        System.out.println(txt6.equals(txt7));

        // Removing Whitespace
        // The trim() method removes whitespace from the beginning and the end of a string:
        String txt8 = "  Hello World   ";
        System.out.println("Before: [" + txt8 + "]");
        System.out.println("After: [" + txt8.trim() + "]");
        


    }
}
