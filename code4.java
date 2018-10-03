import java.util.Scanner;
class code4
{
     static Scanner s=new Scanner(System.in);
     static void sequence(String str1,String str2){
      if(str2.length()<0)
      return;

      System.out.println(str1);
      for(int i=0;i<str2.length();i++)
       seq(str1+str2.charAt(i),str2.substring(i+1,str2.length()));
      }   


       public static void main (String args[]){
        String st=s.next();
          sequence("",st);
        }
}
