import java.util.*;


public class lpalin{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         String str=sc.nextLine();
         String sub;
         int len=str.length();
         int sublen;
         int hsublen=0;
         String outstr="";
         String rev="";
         for(int c=0;c<len;c++)
         {
             for(int i=1;i<=len-c;i++)
             {
                 sub=str.substring(c,c+i);
                 sublen=sub.length();
                 for(int j=sublen-1;j>=0;j--)
                 {
                     rev=rev+sub.charAt(j);
                     
                     
                 }
                 
                 //System.out.println(rev);
                 if(sub.equals(rev) && sublen>hsublen)
                 {
                 hsublen=sublen;
                     outstr=rev;
                     
                   //  System.out.println(hsublen);
                 //System.out.println(outstr);
                     
                 }
                 rev="";
                 
                 //System.out.println(sub);
             }
         }
         
         
         
         
        System.out.println(outstr);
     }
}