package CollectionsJava;

public class StringExample {
    public static void main(String[] args) {
        String str = "tanveer";
        System.out.println(str.hashCode());

        String str2 = "tanveer";
        System.out.println(str2.hashCode());

        String str3 = "tan";
        System.out.println(str3.hashCode());

        System.out.println(str.hashCode() == str2.hashCode()); // true
        System.out.println(str.hashCode() == str3.hashCode()); // false
    }
}
