public class Heapsort {
    public static void main(String[] args) {


        int n = 10;
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = (int) (Math.random() * 10);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        HeapSort(arr);
        System.out.println("HeapSort");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
    private static void HeapSort(int[] arr) {
        int n = arr.length;
        for (int i = n/2 - 1; i >= 0 ; i--) {
            Heapify(arr, i, n);
        }

        for (int i = n-1; i >=0 ; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            Heapify(arr, 0, i);
        }
    }
    private static void Heapify(int[] arr, int i, int n) {
        int l = i*2 + 1;
        int r = i*2 + 2;
        int largest = i;

        if (l<n && arr[l] > arr[largest])
            largest = l;
        if (r<n && arr[r] > arr[largest])
            largest = r;
        if (i != largest) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            Heapify(arr, largest, n);
        }
    }
}
