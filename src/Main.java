public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
     
        RabinMiller rabinMiller = new RabinMiller();
    
        for (int i = 0; i < 20; i++) {// assignment 2.1: 20 
            rabinMiller.checkIfComposite(561);
        }
}
}