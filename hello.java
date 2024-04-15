

import java.lang.*;
import java.util.*;


class GFG{


/**
 * @param args
 */
public static void main(String args[])
{
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter value of n=");
    int n =sc.nextInt();
    int i,j,k;

   for(i=1;i<=n;i++)
   {
    for(j=1;j<=n-i;j++)
    {
        System.out.print(" ");
    }

    System.out.print("*");

    for(k=1;k<=2*(i-1)-1;k++)
    {
        System.out.print(" ");
    }
    if(i!=1)
    {
    System.out.print("*");
    }
    System.out.println();

   }



   for(i=n-1;i>=1;i--)
   {
    for(j=1;j<=n-i;j++)
    {
        System.out.print(" ");
    }

    System.out.print("*");

    for(k=1;k<=2*(i-1)-1;k++)
    {
        System.out.print(" ");
    }
    if(i!=1)
    {
    System.out.print("*");
    }
    System.out.println();

   }



    }
    

    
}


