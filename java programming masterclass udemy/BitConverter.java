public class BitConverter {
    public static void main(String[] args) {
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        System.out.println(kiloBytes + " KB = " + (kiloBytes / 1024) + " MB and " + (kiloBytes % 1024) + " KB");
    }
}
