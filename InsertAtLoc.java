import java.util.*;
class InsertAtLoc{
    public static void main(String args[]){
        int n =  0;
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0;i<arr.length-1;i++){
            
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before Inserting is");
        for(int i : arr){
            System.out.println(i);
        }
        
        System.out.println("Enter the loc where want to insert in Array");
        int loc= sc.nextInt();
        System.out.println("Enter the value");
        int val = sc.nextInt();
        
        for(int i = arr.length-1;i>loc;i--){
            arr[i]= arr[i-1];
        }
        arr[loc] = val;
        System.out.println("After insertion array is");
        
        for(int i : arr){
            System.out.println(i);
        }
    }
}