import java.util.*;
public class OrderFreq
{
    public  static void printDup(String s){
        Map<Character,Integer> m = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!m.containsKey(c)){
                m.put(c,1);
            }
            else{
                m.put(c,m.get(c)+1);
            }
        }
       List<Map.Entry<Character,Integer>> list = new ArrayList<Map.Entry<Character,Integer>>(m.entrySet());
       Collections.sort(list,new Comparator<Map.Entry<Character,Integer>>(){
           @Override
            public int compare(Map.Entry<Character,Integer> o1,Map.Entry<Character,Integer> o2){
               return (o1.getValue()).compareTo(o2.getValue());
           }
       });
       for(Map.Entry<Character,Integer> entry : list){
           System.out.println(entry.getKey()+" "+ entry.getValue());
       }
       
        
    }
	public static void main(String[] args) {
		String s = "HelloWorld";
		printDup(s);
		
	}
}
