package Task7B;

public class LinearSearchDemo {
	    static int LinearSearch(int arr[], int n, int x) {
	        for (int i = 0; i < n; i++) {
	            if (arr[i] == x)
	                return i;
	        }
	        return -1;
	    }

	    public static void main(String[] args) {
	        int[] arr = {40,60,50,75};
	        int n = arr.length;
	        int x = 50;
	        int index = LinearSearch(arr, n, x);
	        if (index == -1)
	            System.out.println("Element is not present in the array");
	        else
	            System.out.println("Element found at position " + index);
	    }
	

}