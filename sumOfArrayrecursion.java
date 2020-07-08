public class Solution {
    
    /*
    public static int helper(int input[], int index) {
    
    //base cond if index==input.length then return 0;
     return helper(input,index+1) + input[index];
    
    }
    
    
    
    
    */

	public static int sum(int input[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
      /* public static int helper(int input[],int index){
          if(index==input.length){
              return 0;
          }
           return helper(input,index+1)+input[index];
       }*/
        return helper(input,0);
	}
    private static int helper(int[] input,int si){
        if(si==input.length){
            return 0;
        }
        return helper(input,si+1)+input[si];
    }
