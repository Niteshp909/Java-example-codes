import java.util.*;

class HashsetEx{
    public static void main (String[] args) {
        Set<Integer> s = new HashSet<>();
        
        int[] arr = {1,3,4,55,6,7,77,8,1,2,33,3};
        for(int i=0 ;i<arr.length;i++){
            s.add(arr[i]);
            
        }
        Iterator<Integer> it = s.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+ " ");
        }
    }
}