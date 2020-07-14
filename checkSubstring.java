public class Solution {
    public static boolean check(String a, String b, int m,int n){
        	 
    
        if(m==0){
            return false;
        }
        if(n==0){
            return true;
        }    
      if(a.charAt(m-1)==b.charAt(n-1)){
          return check(a,b,m-1,n-1);
      }else{
          return check(a,b,m-1,n);
      }
    }
	public static boolean checkSequence(String a, String b) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
	*/
       return check(a,b,a.length(),b.length());
	}
}
