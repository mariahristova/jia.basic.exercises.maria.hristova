 import java.util.Scanner;
/**
 * Created by IntelliJ IDEA.
 * User: Maria
 * Date: 2010-11-11
 * Time: 18:48:57
 * To change this template use File | Settings | File Templates.
 */
public class Exercise4 {
    public static void main(String[] arg){
               Scanner in = new Scanner ( System .in);
               System.out.print("Enter a number:");
               int num=in.nextInt();
               String e ="";
               String d="";
               String s="";
               String h="";
               String o="";
               int hund=num/100;
               int dec=(num/10)%10;
               int dec1=num%100;
               int ed=num%10;
               switch(hund){
               case 0:h="";break;
                   case 1:h="OneHundred";break;
                   case 2:h="TwoHundred";break;
                   case 3:h="ThreeHundred";break;
                   case 4:h="FourHundred";break;
                   case 5:h="FiveHundred";break;
                   case 6:h="SixHundred";break;
                   case 7:h="SevenHundred";break;
                   case 8:h="EightHundred";break;
                   case 9:h="NineHundred";break;

               }
               switch(dec){
               case 0:d="";break;
               case 2:d="Twenty";break;
               case 3:d="Thirty";break;
               case 4:d="Fourty";break;
               case 5:d="Fifty";break;
               case 6:d="Sixty";break;
               case 7:d="Seventy";break;
               case 8:d="Eighty";break;
               case 9:d="Ninety";break;
               }
               if(dec!=1){
               switch (ed){
               case 0:e="";break;
               case 1:e="One";break;
               case 2:e="Two";break;
               case 3:e="Three";break;
               case 4:e="Four";break;
               case 5:e="Five";break;
               case 6:e="Six";break;
               case 7:e="Seven";break;
               case 8:e="Eight";break;
               case 9:e="Nine";break;
               }
               String m=h+d+e;
               System.out.println(m);
               System.out.println("The count of letter is:"+m.length());
               }
               if(dec==1){
               switch(dec1)
               {
               case 10:s="Ten";break;
               case 11:s="Eleven";break;
               case 12:s="Twelve";break;
               case 13:s="Thirteen";break;
               case 14:s="Fourteen";break;
               case 15:s="Fifteen";break;
               case 16:s="Sixteen";break;
               case 17:s="Seventeen";break;
               case 18:s="Eighteen";break;
               case 19:s="Nineteen";break;
               }
               String k=h+s;
               System.out.println(k);
               System.out.println("The count of letter is"+k.length());
               }
               else if (num==1000){
               o="Onethousand";
               System.out.println(o);
               System.out.println("The count of letter is:"+o.length());
               }
           }
    
}
