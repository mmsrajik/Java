A man invests a certain amount on monthly basis in a bank. He withdraws that money once in 4 years which is a leap year, to make a big scale purchase .He starts next investment exactly 183 days after the purchase .
Initially, he makes a note of his purchase date
Given the date(dd) and month(mm) of his purchase. The task here is to help him find the date and month to start his investment.
His next investment date is calculated from the next day of his purchase.
Display the date as on 183rd day.


Example 1:
Input:
15- Value of dd 
January-Value of mm


Output:
16 July- Date 183 days after his purchase

Constraints

D<dd<=12

mm -{January to December}

Inputs
First input-Accept value for dd (positive integer number)
Second Input-Accept value for mm (month)
The output format for testing:The output should be a positive integer number followed by the name of the month.





import java.util.*;
public class dateIncraeseBasedOnWaitingTime{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int date=sc.nextInt();
        sc.nextLine();
        String month=sc.nextLine();
        
        int datearr[]={31,29,31,30,31,30,31,31,30,31,30,31};
        String montharr[]={"January","Febraury","March","April","May","June","July","August","September","October","November","December"};
        
        
        int days=183;
        
       
        int darrindex=-3; // current date index
         int marrindex=-4;  //current month index
        
        int currentdate=date;
        String currentmonth=month;
        
        for(int i=0;i<montharr.length;i++)
        {
            if(month.equalsIgnoreCase(montharr[i]))
            {
                
               
                darrindex=i;
                 marrindex=i;
            }
            
        }
        for(int i=darrindex;i<datearr.length;i++)
        {
        
        
        while(currentdate!=datearr[i])
        {
          currentdate=currentdate+1;
          days=days-1;
        //  System.out.println("currentdate"+currentdate);
        //  System.out.println("days"+days);
            
            
        if(days==0)
        {
            System.out.println(currentdate+" "+currentmonth);
            System.exit(0);
        }
        }
        
        currentdate=0;
        currentmonth=montharr[i+1];
        
      //  System.out.println("currentdate"+currentdate);
      //  System.out.println("currentmonth"+currentmonth);
        
        }
        
     }
}