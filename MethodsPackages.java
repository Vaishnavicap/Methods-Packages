package methodspackages;
import java.util.Scanner;

public class MethodsPackages 
{

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");

        //Input from the User
        long min = scan.nextLong();

        //Total number of minutes in a year is 525600 mins. 
        long years = (min / 525600);
        
        /*Total number of minutes in a day is 1440 mins 
          and Total number of days in year is 365 days */ 
        int days = (int)(min / 1440) % 365;

        System.out.println(min + " minutes is approximately " + years + " years and " + days + " days");
        
    }
    
}
