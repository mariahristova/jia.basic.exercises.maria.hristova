/**
 * Created by IntelliJ IDEA.
 * User: Maria
 * Date: 2010-11-11
 * Time: 18:46:47
 * To change this template use File | Settings | File Templates.
 */
public class Exercise2 {
    public static void main(String[] arg){
        int sum=0;
        for (int i=1;i<=1000;i++)
            if((i%3==0)&&(i%5==0))
            {
                sum+=i;
            }
        System.out.printf("The sum is:%d",sum);
    }
}
