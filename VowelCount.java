import java.util.*;
class VowelCount{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int a =  VowCount(s.toLowerCase());
        System.out.println("Nos. of vowels are"+ " "+a+" " + "Consoants are"+" "+ (n-a) );
    }

private static int VowCount(String s){
    int count = 0;
    for(int i = 0;i<s.length();i++){
        char c = s.charAt(i);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            count++;
        }
    }
    return count;
}
}