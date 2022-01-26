import java.util.*;
class factsum
{
    public static void main(String args[])
    {
        factsum obj1=new factsum();
        obj1.sum();
        obj1.fact();
    }
    void sum()
    {
        Scanner obj=new Scanner(System.in);
        int s=0,a;
        System.out.println("Enter the number");
        int x=obj.nextInt();
        while(x>0)
        {
            a=x%10;
            s=s+a;
            x=x/10;
        }
        System.out.println("sum:"+s);
    }
    void fact()
    {
        Scanner obj1=new Scanner(System.in);
        int fat=1,i;
        System.out.println("Enter digit");
        int n=obj1.nextInt();
        for(i=1;i<=n;i++)
        {
            fat=fat*i;
        }
        System.out.println("Factorial:"+fat);
    }
}
