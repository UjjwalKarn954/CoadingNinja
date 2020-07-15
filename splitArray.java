public class solution {

	

    public static boolean helper(int input[],int start,int lsum,int rsum){
        
        if(start==input.length){
            return rsum==lsum;
        }
        if(input[start]%5==0){
            lsum+=input[start];
        }
        else if(input[start]%3==0){
            rsum+=input[start];
        }
        else{
            return helper(input,start+1,lsum+input[start],rsum)||helper(input,start+1,lsum,rsum+input[start]);
        }
        return helper(input,start+1,lsum,rsum);

        
    }
	public static boolean splitArray(int input[]) {
		/* Your class should be named solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		return helper(input,0,0,0);
	}
	


        
		
	
	

}
