// Given an array and a value, find if there is a triplet in array whose sum is equal to the given value. 
// If there is such a triplet present in array, then print the triplet and return true. Else return false.
// Examples: 
// Input: array = {12, 3, 4, 1, 6, 9}, sum = 24; 
// Output: 12, 3, 9 
// Explanation: There is a triplet (12, 3 and 9) present 
// in the array whose sum is 24. 
// Input: array = {1, 2, 3, 4, 5}, sum = 9 
// Output: 5, 3, 1 
// Explanation: There is a triplet (5, 3 and 1) present 
// in the array whose sum is 9.


import java.util.*;

class TripletSumArray {

	static boolean find3Numbers(int A[], int arr_size, int sum) {
		for (int i = 0; i < arr_size - 2; i++) {

			HashSet<Integer> s = new HashSet<Integer>();
			int curr_sum = sum - A[i];
			for (int j = i + 1; j < arr_size; j++) {
				if (s.contains(curr_sum - A[j])) {
					System.out.printf("Triplet is %d, %d, %d", A[i], A[j], curr_sum - A[j]);
					return true;
				}
				s.add(A[j]);
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int A[] = { 1, 4, 45, 6, 10, 8 };
		int sum = 22;
		int arr_size = A.length;

		find3Numbers(A, arr_size, sum);
	}
}