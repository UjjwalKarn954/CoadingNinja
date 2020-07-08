public class Solution {
    public static boolean helpercheck(int input[],int N,int i,int X){
        if(i==N){
            return false;
        }
        else if(input[i]==X){
            return true;
        }else{
            return helpercheck(input,N,i+1,X);
        }
        
    }
	
	public static boolean checkNumber(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
      return helpercheck(input,input.length,0,x);
	}
}
