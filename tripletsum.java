import java.util.Arrays;
public class TripletSum {	

	public static void FindTriplet(int[] arr, int x){
		/* Your class should be named TripletSum.
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Print output and don't return it.
		 * Taking input is handled automatically.
		 */
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++){
            int a=x-arr[i];
           int low=i+1;
            int high=n-1;
            while(low<high){
                if(arr[low]+arr[high]<a){
                    low++;
                }
                else if(arr[low]+arr[high]>a){
                    high--;
                }
                else{
                   System.out.println(arr[i]+" "+arr[low]+" "+arr[high]);
                    int temp=low+1;
                    while(temp<high&&arr[temp]+arr[high]==a){
                    System.out.println(arr[i]+" "+arr[low]+" "+arr[high]);
                       temp++; 
                    }
                    temp=high-1;
                    while(temp>low&&arr[temp]+arr[low]==a){
                    System.out.println(arr[i]+" "+arr[low]+" "+arr[high]);
                        temp--;
                    }
                    low++;
                    high--;
                }
            }
            
        }
	}
