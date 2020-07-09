public class solution {

     public static void merge(int a[], int b[], int d[]) {
      int i = 0;
      int j = 0;
      int k = 0;

      while (i < a.length && j < b.length) {
       if (a[i] <= b[j]) {
        d[k] = a[i];
        i++;
        k++;
       } else if (b[j] <= a[i]) {
        d[k] = b[j];
        j++;
        k++;
       }
      }
      if (i < a.length) {
       while (i < a.length) {
        d[k] = a[i];
        i++;
        k++;
       }
      }
      if (j < b.length) {
       while (j < b.length) {
        d[k] = b[j];
        j++;
        k++;
       }
      }
     }

     public static void mergeSort(int[] input) {
      // Write your code here
      if (input.length <= 1) {
       return;
      }
      int a[] = new int[input.length / 2];
      int b[] = new int[input.length - a.length];

      for (int i = 0; i < a.length; i++) {
       a[i] = input[i];
      }
      for (int i = a.length; i < input.length; i++) {
       b[i - a.length] = input[i];
      }
      mergeSort(a);
      mergeSort(b);
      merge(a, b, input);
     }
