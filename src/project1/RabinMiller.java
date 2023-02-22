package project1;
import java.math.BigInteger;

public class RabinMiller {

    public RabinMiller() {
    }

    public BigInteger checkIfComposite(BigInteger n) { // Composite = not prime
        BigInteger res = n;
        BigInteger bigX;
        if (!((n.mod(new BigInteger("2"))).equals(new BigInteger("0")))) {
            BigInteger r = new BigInteger("0"); // 2^0
            BigInteger s = n.subtract(new BigInteger("1")); // write n-1 = 2^0 * s
            while ((s.mod(new BigInteger("2"))).equals(new BigInteger("0"))){// check if s % 2 ==0, increment r to find out the smallest factor s
                r = r.add(new BigInteger("1"));
                s = s.divide(new BigInteger("2"));

            }

             //pick a random integer a in the range [2, n - 2]
            BigInteger random = new BigInteger(n.bitLength(), new java.util.Random());
           

            BigInteger temp = random;
            bigX = temp.modPow(s, n);

            if (bigX.equals(BigInteger.valueOf(1)) || bigX.equals(n.subtract(BigInteger.valueOf(1))))
                return res; // Probably Prime

            for (int j = 1; j <= r.intValue() - 1; j++) {
                //Alternative 1
                BigInteger bigA1 = bigX.pow(2);
                bigA1 = bigA1.mod(n);

                //Alternative 2
                //int i = (int) Math.round(Math.pow(2, j) * s);
                // BigInteger bigA2 = bigA.pow(i);
                //System.out.println("x: " + x);
                if (bigA1.equals(BigInteger.valueOf(1))) return null; // Composite
                if (bigA1.equals(n.subtract(BigInteger.valueOf(1)))) return res; // Probably Prime
            }
        }
        return null; // Composite
    }
}
