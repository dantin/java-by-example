import java.nio.charset.Charset;

public class StringCheese {
    public static void main(String[] args) {
        byte bytes[] = new byte[256];
        for(int i = 0; i < 256; i++)
            bytes[i] = (byte)i;
        String str = new String(bytes;
        //String str = new String(bytes, Charset.forName("ISO-8859-1"));
        for(int i = 0, n = str.length(); i < n; i++)
            System.out.print((int)str.charAt(i) + " ");
    }
}
