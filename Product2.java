/*  Given an array of integre A find and return the product array of the same size where 
the ith element of the product array will be equal to the product of all elemnts divided by the ith element of the array.@interface


Pseudocode:-

Input array A of size n 
Create array product of size n 
for i=0 to n-1
totalproduct = totalproduct - A[i]
for i =0 to n-1
totalproduct = totalproduct / A[i]
print product array
*/

import java.util.Scanner;

public class Product2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int n =sc.nextInt();
        int [] A = new int [n];
        int [] product = new int [n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++){
            A[i]=sc.nextInt();
        }

        int totalProduct = 1;
        for (int i = 0; i < n; i++) {
           totalProduct*=A[i];

        }
        for (int i = 0; i < n; i++) {
           product[i]=totalProduct/A[i];
            
        }
        System.out.println("Product array:");
        for (int i = 0; i < n; i++) {
            System.out.print(product[i]+ " ");
            
        }
            
        }
    }