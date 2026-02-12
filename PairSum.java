/*Given an array elements check if the their exist a pair [i,j] such that arr[i]+arr[j] ==k
and i is not equal to  j .@interface

Pseudocode:-
Read size n
Input array arr of size n
input value k
set found = false
for loop 
if found == false then 
print "No pair "

*/
public class PairSum {
    public static void main(String[] args) {

        int[] arr = {2, 4, 7, 5, 9};
        int k = 11;

        int count = 0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    System.out.println("Pair found: " + arr[i] + " + " + arr[j] + " = " + k);
                    count++;
                }
            }
        }

        if (count == 0) {
            System.out.println("No pair found");
        }
    }
}