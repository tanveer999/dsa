package Strings;

public class Basics {
    public static void main(String[] args) {
        String s1 = "I am Tanveer";
        String s2 = "Java is a programming language";
        String s3 = "I am Tanveer";
        String s4 = "i am tanveer";
        String s5 = new String("I am Tanveer");

        // System.out.println(s1.charAt(s1.length()));
        s1.concat(s2);
        System.out.println(s1); // I am Tanveer

        System.out.println(s1.concat(s2)); // I am TanveerJava is a programming language

        System.out.println("abc".length()); // 3
        System.out.println("".isEmpty()); // true
        char[] chArr1 = {'a', 'b', 'c', 'd'};
        // String str3 = String.join("", chArr1); // error
        String str3 = new String(chArr1);
        System.out.println(str3); // abcd
        
        String str1 = String.join("/", "cat", "bat", "rat");
        System.out.println(str1); // cat/bat/rat

        String[] strArr1 = {"rat", "lion", "tiger"};
        String str2 = String.join("->", strArr1);
        System.out.println(str2); // rat->lion->tiger

        String[] strArr = s1.split(" ", 2);
        for(String str : strArr) {
            System.out.print(str + "-");
        } // I-am Tanveer-
        System.out.println();

        strArr = s1.split(" ");
        for(String str : strArr) {
            System.out.print(str + "-");
        } // I-am-Tanveer-
        System.out.println();
        String a = String.valueOf(5);
        System.out.println(a); // 5

        System.out.println(s1.substring(5)); // Tanveer
        System.out.println(s1.substring(5,8)); // Tan

        System.out.println(s1.endsWith("veer")); // true
        System.out.println(s1.endsWith("java")); // false
        System.out.println(s1.startsWith("I am")); //true
        System.out.println(s1.startsWith("Java")); // false

        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1 == s3);  // true
        System.out.println(s1 == s5); // false(s1 and s5 point to different location)

        System.out.println(s1.equals(s4)); // false
        System.out.println(s1.equalsIgnoreCase(s4)); // true

        s2.toUpperCase();
        System.out.println(s2); // Java is a programming language

        s2 = s2.toUpperCase();
        System.out.println(s2); // JAVA IS A PROGRAMMING LANGUAGE

        s2 = s2.toLowerCase();
        System.out.println(s2); // java is a programming language

        System.out.println(s1.charAt(0)); // I

        System.out.println(s1.compareTo(s2)); // -33
        System.out.println(s1.compareTo(s5)); // 0
        System.out.println(s1.compareTo("Abc")); // 8

        System.out.println(s1.compareTo(s4)); //-32
        System.out.println(s1.compareToIgnoreCase(s4)); // 0

        System.out.println(s1.indexOf('T')); //5
        System.out.println(s1.indexOf("Tan")); //5

        System.out.println(s1.contains("Tan")); // true
        System.out.println(s1.contains("tan")); // false

        char[] chArr = s1.toCharArray();
        for(char ch : chArr) {
            System.out.print(ch);
        } // I am Tanveer
        System.out.println();
    }
}
