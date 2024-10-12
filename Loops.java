class Loops {

    // // first and last value
    // public static void logic(int[] arr, int n) {
    //     for(int i=0; i<(n+1)/2; i++) {
    //         System.out.println(arr[i] + " " + arr[n - 1 - i]);
    //         // System.out.println("\n");
    //     }
    // }
    // o/p:-
    //  2 132
    //  5 89
    //  7 9

    // // binary search
    // public static void logic(int[] arr, int n) {
    //     int low = 0;
    //     int high = n;
    //     while(low < high) {
    //         int mid = (low + (high - low)) / 2;
    //         if(arr[mid] < 5) {
    //             low = mid + 1;
    //         } else if(arr[mid] > 5) {
    //             high = mid - 1;
    //         } else {
    //             System.out.println(arr[mid]);
    //             break;
    //         }
    //     }
    // }

    // // fast and slow ptr
    // public static void logic(int[] arr, int n) {
    //     int slow = 0;
    //     int fast = 0;
    //     while (fast < n) {
    //         System.out.println("Slow ptr: " + arr[slow] + " " + "Fast ptr:" + arr[fast]);
    //         slow++;
    //         fast += 2;
    //     }
    // }

   
        

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 9, 2, 132};
        
        logic(arr, arr.length);
    }
}