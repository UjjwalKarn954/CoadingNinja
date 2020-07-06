 public class Solution {  

//     public static void rotate(int[] arr, int d) {
//     	//Your code goes here
//         int j=arr.length;
//          while(d>0){
//              for(int i=0;i<j;i++){
//              int temp=arr[i];
//                  arr[i]=arr[i+1];
//                  arr[j-1]=temp;
                
//          }
//              d--;
//         }
       
//      }

//  }


    public static void rotate(int[] arr, int d) {
     
        int arr1[]=new int[d];
    
        for(int i=0;i<arr1.length;i++){
            arr1[i]=arr[i];
        }
        for(int j=0;j<arr.length-d;j++){
            arr[j]=arr[j+d];
        }
        int k=arr.length-d;
        int i=0;
        while(k<arr.length){
            arr[k]=arr1[i];
            i++;
            k++;
        }
        
            
    }
}
