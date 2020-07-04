import java.util.Arrays;
public class PairSum{	

	public static void pairSum(int[] arr, int num){
		/* Your class should be named PairSum
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Print output and don't return it.
	 	 * Taking input is handled automatically.
		 */
        Arrays.sort(arr);
       
for(int i=0;i<arr.length-1;i++){
    int a=num-arr[i];
    for(int j=i+1;j<arr.length;j++){
        if(arr[j]==a){
            if(arr[i]<a){
                System.out.println(arr[i]+" "+a);
        } else{
                               System.out.println(a+" "+arr[i]);
        }
 
        }
    }
}
	}
}
