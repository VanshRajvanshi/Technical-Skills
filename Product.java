/*Given an array of integre A find and return the product array of the same size where 
the ith element of the array will be equal to the product of all elemnts divided by the ith element of the array.@interface


Pseudocode:-

Input array A of size n 
Create array product of size n 
for i=0 to n-1
totalproduct = totalproduct - A[i]
for i =0 to n-1
totalproduct = totalproduct / A[i]
print product array
*/

public class Product {
    public static void main(String[] args) {
        int []A = {1,2,3,4};
        int n =A.length;
        int totalProduct =1;
        for (int i = 0; i < n; i++){
            totalProduct =totalProduct*A[i];
        }
        int [] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i]=totalProduct/A[i];

        }
        for (int i = 0; i < n; i++) {
            System.out.println(result[i]+ " ");
            
        }
            
        }
    }