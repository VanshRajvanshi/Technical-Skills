// Given an array count number of elements having atleast one element greater than itself.
// a=[-1, -5, 0, 2, -3, 5]
// O/P=> 5
// Observation: For every max element there won't be ane element greater than itself
/* Psuedocode
    S1: Iterate and find the max value
    S2: Iterate and get the number of elements which are not equals to max
 */

import java.util.Scanner;
class Question1{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of the array");
        int n = sc.nextInt();

        int [] A = new int[n];

        System.out.println("enter array elements");
        for(int i = 0; i<n; i++)
            A[i] = sc.nextInt();

        int max = A[0];
        int count = 0;

        for(int i : A){
            if (max<i)
                max=i;
        }

        for(int i : A){
            if(max!=i)
                count++;
        }
        
        System.out.println(count);
    }
}