  import java.math.BigInteger;
/**
 * Created by IntelliJ IDEA.
 * User: Maria
 * Date: 2010-11-11
 * Time: 18:47:35
 * To change this template use File | Settings | File Templates.
 */
public class Exercise3 {
    public static void main (String[] args){

      BigInteger sum=BigInteger.valueOf(0);
      BigInteger s=BigInteger.valueOf(0);
      BigInteger value=BigInteger.valueOf(1);
      BigInteger fac=BigInteger.valueOf(10);
      long factorial=100;
      long i;

      for (i=2;i<=factorial;i++)
      {
       s=BigInteger.valueOf(i);
       value=value.multiply(s);
      }
      System.out.println("The value of 100! is: " +value);
      do
      {
       sum=sum.add(value.remainder(fac));
       value=value.divide(fac);
      } while (value!=BigInteger.valueOf(0));

      System.out.println("The sum of the numbers of 100! is: " +sum);
     }
      
}
