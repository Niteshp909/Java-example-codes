import java.util.*;
import java.util.Map.Entry;
public class Strcompress{
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");
    String s = sc.next();
    System.out.println(strcomp(s));
    }
    private static String strcomp(String s){
        Map<Character,Integer> m = new LinkedHashMap<>();
        for(int i = 0;i<s.length();i++){
            
        
        if(m.get(s.charAt(i))!=null){
            m.put(s.charAt(i),m.get(s.charAt(i))+1);
        }else{
            m.put(s.charAt(i),1);
        }
        }
        StringBuilder sb = new StringBuilder();
        for(Entry<Character,Integer> entry : m.entrySet()){
            sb.append(entry.getKey());
            sb.append(entry.getValue());
            
        }
        return sb.toString();
        
    }
}