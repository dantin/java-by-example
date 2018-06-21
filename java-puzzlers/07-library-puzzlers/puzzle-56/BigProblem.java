import java.math.BigInteger;

public class BigProblem {
    public static void main(String[] args) {
        BigInteger fiveThousand        = new BigInteger("5000");
        BigInteger fiftyThousand       = new BigInteger("50000");
        BigInteger fiveHandredThousand = new BigInteger("500000");

        BigInteger total = BigInteger.ZERO;
        //total.add(fiveThousand);
        //total.add(fiftyThousand);
        //total.add(fiveHandredThousand);
        total = total.add(fiveThousand);
        total = total.add(fiftyThousand);
        total = total.add(fiveHandredThousand);
        System.out.println(total);
    }
}
