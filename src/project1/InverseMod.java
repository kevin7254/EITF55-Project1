package project1;
import java.math.BigInteger;

public class InverseMod {

    public InverseMod(){
       
    }


    
    public  BigInteger algorithm (BigInteger a, BigInteger m){
        System.out.println(a + " " + m);
        BigInteger v2 =  new BigInteger("1");
        BigInteger v1 =  new BigInteger("0");
        BigInteger d1 = m;
        BigInteger d2 =a;
        BigInteger q, t2,t3, v, d;


        
        while (!d2.equals(BigInteger.ZERO)) {
            q = d1.divide(d2);
            t2 = v1.subtract(q.multiply(v2));
            t3 = d1.subtract(q.multiply(d2));
            v1 = v2; d1 = d2;
            v2 = t2; d2 = t3;   
        }
        if (v1.compareTo(BigInteger.ZERO) < 0) {
            v1 = v1.add(m);
        }
        
        v=v1;
        d=d1;
        
        if (d.equals("1")){
            return v;
        }
        return v;
    }
}


