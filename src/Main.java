import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
     
        RabinMiller rabinMiller = new RabinMiller();
        InverseMod inverse = new InverseMod();
        //assignment2_1(rabinMiller);
        //assignment2_2(rabinMiller);
        //assignment3(rabinMiller);
        assignment4(inverse);


        //Print time in milliseconds


    }
    public static void assignment2_1(RabinMiller rabinMiller) {
        long time = System.nanoTime();
        for (int i = 0; i < 20; i++) {// assignment 2.1: 20
            BigInteger res = rabinMiller.checkIfComposite(new BigInteger("7"));
            System.out.println(res);
        }
        System.out.println("Time: " + (System.nanoTime() - time) / 1000000 + "ms");
    }

    public static void assignment2_2(RabinMiller rabinMiller) {
        long time = System.nanoTime();
        //Generate 100 random numbers in 512-4096 bit range
        for (int i = 0; i < 100;) {
            BigInteger random = new BigInteger(4096, new java.util.Random());
            BigInteger res = rabinMiller.checkIfComposite(random);
            if (res != null) {
                System.out.println(res);
                i++;
            }
        }
        System.out.println("Time: " + (System.nanoTime() - time) / 1000000 + "ms");
    }

    public static void assignment3(RabinMiller rabinMiller) {
        for(int i = 0; i< 2;) {
            BigInteger random = new BigInteger(512, new java.util.Random());
            BigInteger res = rabinMiller.checkIfComposite(random);
            if (res != null) {
                System.out.println(res);
                i++;
            }
        }
    }


    public static void assignment4(InverseMod inverse){
            System.out.println(inverse.algorithm(new BigInteger("5"), new BigInteger("2")));
            System.out.println(inverse.algorithm(new BigInteger("8"), new BigInteger("5")));
            System.out.println(inverse.algorithm(new BigInteger("15"), new BigInteger("9")));

            BigInteger p = new BigInteger("8396256305097038999635256212089884981530394099906140493350945987024380991475879049687351465586141395239672922402620271122951794002504747423174474757914887");
            BigInteger q = new BigInteger("2896660929138039314506773379106703725808659510273801341600541083601687547847610760020351611132508924296522771588376198104627460847204831488292757187828521");

            System.out.println(inverse.algorithm(p, new BigInteger("65537")));
            System.out.println(inverse.algorithm(q, new BigInteger("65537")));

            BigInteger mul = p.multiply(q);

            System.out.println(mul);

            BigInteger s = new BigInteger("6969420");

            BigInteger c = s.pow(65537).mod(mul);

            System.out.println("c:" + c);

            BigInteger z = c.pow(1).mod(mul);

            System.out.println("z:" + z);
    }
}