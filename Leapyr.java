
public class Leapyr
{
    public static boolean isLeap(int x){
        boolean leap = false;
        if(x%4 == 0){
            if(x%100 == 0){
                if(x%400 == 0){
                    leap = true;
                }
                else{
                    leap = false;
                }
            }
            else{
                leap = true;
            }
        }
        else{
            leap = false;
        }
        return leap;
    }
	public static void main(String[] args) {
		System.out.println(isLeap(2100));
	}
}
