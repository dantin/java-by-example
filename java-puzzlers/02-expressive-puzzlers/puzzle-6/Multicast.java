public class Multicast {
    public static void main(String[] args) {
        // 32 bit --> 8 bit --> 16 bit --> 32bit
        //
        // Sign extension is performed if the type of the original value
        // is signed; zero extension if it is a char, regardless of the
        // type to which it is being converted. 
        System.out.println((int)(char)(byte) -1);
    }
}
