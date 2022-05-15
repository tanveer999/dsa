public class App {
    public static void main(String[] args) throws Exception {
        message1(1);
    }

    public static void message1(int i) {
        if(i < 5) {
            System.out.println(i);
            message1(i + 1);
        }
    }

    // public static void message1(int i) {
    //     System.out.println(i);
    //     message2(2);
    // }

    // private static void message2(int i) {
    //     System.out.println(i);
    //     message3(3);
    // }

    // private static void message3(int i) {
    //     System.out.println(i);
    //     message4(4);
    // }

    // private static void message4(int i) {
    //     System.out.println(i);
    // }

    

    
}
