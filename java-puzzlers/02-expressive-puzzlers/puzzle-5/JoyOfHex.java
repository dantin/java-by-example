public class JoyOfHex {
    public static void main(String[] args) {
        // Hex and Octal literals are negative if their high-order bit is set.
        //
        // Explain:
        //
        //     1111111
        //   0xffffffffcafebabeL
        // + 0x0000000100000000L
        // ----------------------
        //   0x00000000cafebabeL
        //
        System.out.println(Long.toHexString(0x100000000L + 0xcafebabe));
        //System.out.println(Long.toHexString(0x100000000L + 0xcafebabeL));
    }
}
