public class Palingram
{
	public static void main(String[] args) {
		String s = "The quick brown fox jumps over the lazy dog";
		System.out.println(isPaligram(s.toLowerCase()));
	}
	
	private static boolean isPaligram(String s){
	    if(s.length()<26){
	        return false;
	    }
	    else{
	        for(char c = 'a';c<='z';c++){
	            if(s.indexOf(c)<0){
	                return false;
	            }
	        }
	        return true;
	    }
	}
}
