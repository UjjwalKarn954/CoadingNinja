
public class Solution {
    public static int helper(int input[],int x,int N,int i){
        if(i==N){
            return -1;
        }
    int k=helper(input,x,N,i+1);
        if(k != -1){
            return k;
        }else{
            if(input[i]==x){
            return i;
        }else{
            return -1;
        }
        }
    }

	public static int lastIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        return helper(input,x,input.length,0);
	}
	
}
