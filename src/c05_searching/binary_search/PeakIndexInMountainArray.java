package c05_searching.binary_search;

public class PeakIndexInMountainArray {
	public static void main(String[] args) {

	}

	public int peakIndexInMountainArray(int[] arr) {
int start =0;
int end =arr.length-1;

while(start<end) {
	int mid = start +(end-start)/2;
	if( arr[mid]>arr[mid+1]) {
		//you are in decreasing part of array
		// this is may be the ans, but look at left
		// this is why end!= mid -1;
		end=mid;
	} else {
		// you are in asc part of array
		start =mid+1; // bcoz 
	}
}
	}

}
