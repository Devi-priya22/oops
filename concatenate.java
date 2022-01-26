import java.util.*;
class concatenate {
    public static void main(String args[])
    {
        concatenate Obj=new concatenate();
        Obj.consum("1"+"9");
        Obj.consum("Devipriya"+""+"S");
    }
    void consum(int a)
    {
        System.out.println("Concated number:"+a);
    }
    void consum(String a)
    {
        System.out.println("Concated String="+a);
    }
    
}
