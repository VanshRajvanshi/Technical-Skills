import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int maxElement= A[0];
        for (int i : A) {
            if (i > maxElement) {
                maxElement = i;
            }
        }
        int minimumTime=0;
        for(int i:A){
            minimumTime += (maxElement - i);
        }
        System.out.println("Minimum time required: " + minimumTime);
        sc.close();
    }
}