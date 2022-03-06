import java.util.*;
 
class lbmap {
 
    public static void main(String args[])
    {
        Map<String, Integer> lb= new HashMap<String, Integer>();
        lb.put("a ", new Integer(25));
        lb.put("b ", new Integer(20));
        
        for (Map.Entry<String, Integer> me : lb.entrySet()) {
            System.out.print(me.getKey() + ":" + me.getValue()+" ");
        }
    }
}