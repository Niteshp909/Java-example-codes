import java.util.*;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

class Prifre{
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    
    HashMap<Character,Integer> m  = new HashMap<>();
    for(int i = 0;i<s.length();i++)
    {
        
        char c = s.charAt(i);
        Integer value = m.get(c);
        if(value != null)
        {
            m.put(c,new Integer(value+1));
            
        }
        else
        {
            m.put(c,1);
        }
    }
    
    Set<Entry<Character,Integer>> set = m.entryset();
    
    List<Entry<Character,Integer>> l = new ArrayList<Entry<Character,Integer>>(set);
    
    Collections.sort(l,new Comparator<Map.Entry<Character,Integer>>()
    {
        @Override 
        public int compare(Entry<Character,Integer> o1, Entry<Character,Integer> o2)
        {
            return o2.getValue.compareTo(o1.getValue());
        }
    }
    );
    
    for(Entry<Character,Integer> entry : l)
    {
        System.out.println("Frequecy of occurence"+" "+ entry.getKey()+" "+ entry.getValue());
    }
}




