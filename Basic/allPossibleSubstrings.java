input:
rajikahamed
output:
r
ra
raj
raji
rajik
rajika
rajikah
rajikaha
rajikaham
rajikahame
rajikahamed
a
aj
aji
ajik
ajika
ajikah
ajikaha
ajikaham
ajikahame
ajikahamed
j
ji
jik
jika
jikah
jikaha
jikaham
jikahame
jikahamed
i
ik
ika
ikah
ikaha
ikaham
ikahame
ikahamed
k
ka
kah
kaha
kaham
kahame
kahamed
a
ah
aha
aham
ahame
ahamed
h
ha
ham
hame
hamed
a
am
ame
amed
m
me
med
e
ed
d



import java.util.*;
public class allPossibleSubstrings{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      
      
      for(int i=0;i<str.length();i++)
      {
          for(int j=i+1;j<=str.length();j++)
          {
              System.out.println(str.substring(i,j));
          }
      }

     }
}