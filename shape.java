import java.util.*;
class shape
{
    public static void main(String args[])
    {
        new shape(5);
        new shape(5,4);
    }
    shape(int a)
    {
        System.out.println("Perimeter of circle is:"+(3.14*2*a));
    }
    shape(int n,int m)
    {
        int p=n+m;
        int t=2*p;
        System.out.println("Perimeter  of Rectangle is:"+t);
    }
} 
