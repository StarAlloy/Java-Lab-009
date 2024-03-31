import java.math.BigInteger;
// Why can't I,
// hold all these integers
public class BigIntRewrite {
    public static void main(String[] args) {
        new BigIntRewrite();
        BigInteger result = pow(20, 20);
        System.out.println(result);

    }
        public static BigInteger pow(int x, int n) {
            BigInteger result = BigInteger.ONE;
            BigInteger base = BigInteger.valueOf(x);
            while (n > 0) {
                if (n % 2 == 1) {
                    result = result.multiply(base);
                }
                base = base.multiply(base);
                n = n / 2;
            }
            return result;
        }
    }


