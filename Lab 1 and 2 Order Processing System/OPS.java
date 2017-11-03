package ops;
import java.util.*;
public class OPS 
{
    static String usr[]={"User","Admin"};
    static String pass[]={"usr420","admin007"};
    public static void main(String[] args) 
    {
        OrderPlace obj1=new OrderPlace();
        obj1.setVisible(true);
    }
    public static boolean sear(String s,String p)
    {            
        for(int i=0;i<usr.length;i++)
        {
            if(s.equals(usr[i]))
            {
                if(p.equals(pass[i]))
                    return true;
            }
        }
        return false;
    }
}