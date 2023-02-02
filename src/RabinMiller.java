public class RabinMiller {
    private int iterations;

    public RabinMiller(int iterations) {
        this.iterations = iterations;

        boolean s = checkIfComposite(561);
        System.out.println(s);
    }

    public boolean checkIfComposite(int n) { //Composite = not prime
        int x;
        if (n > 3 && (n % 2 != 0)) {
            int r = 0;
            int s = (n - 1); //Write n-1 = 2^0 * s
            while(s % 2 == 0) {
                r++;
                s = s / 2;
            }
            System.out.println("n-1 = 2^" + r + " * " + s);

            // pick a random integer a in the range [2, n - 2]
            int a = (int) (Math.random() * (n - 4)) + 2;
            System.out.println("a = " + a);

            x = (int) Math.pow(a, s) % n;
            System.out.println("x = " + x);

            if(x == 1 || x == (n - 1)) return false; // Probably Prime.

            for(int j = 1; j<= (r-1);j++) {
                x = (int) Math.pow(x, 2) % n;
                System.out.println("x = " + x);
                if(x == 1) return true; // Composite
                if(x == (n - 1)) return false; // Probably Prime
            }
        }
        return true; // Composite
    }
}
