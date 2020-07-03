import java.util.Arrays;
public class FindUnique{	

	public static int findUnique(int[] arr){
		/* Your class should be named FindUnique
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		 */
        Arrays.sort(arr);
        int ans=0;
          for(int i=0;i<arr.length;i++){
              ans=ans^arr[i];
          }
        return ans;
	}
}
