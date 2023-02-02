import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
     
        RabinMiller rabinMiller = new RabinMiller();
        //assignment2_1(rabinMiller);
        //assignment2_2(rabinMiller);
        assignment3(rabinMiller);


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
}