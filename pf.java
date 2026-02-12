/*WAP OF PREFIX ARRAY

Pseudocode:-

1.Read the array and add the length
2.Create the prefix array of the givern array
3.Initialize the count 0
4.Calculate left sum
5.Calculate right sum 

*/
public class pf {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n =arr.length;
        int [] prefix = new int[n];
        prefix[0]=arr[0];
        int i,ls,rs;
        for (i = 0; i <n; i++) {
        prefix[i] =prefix[i-1]+arr[i];

            }
        for(i=0;i<n;i++){
            ls=prefix[i]-arr[i];
            rs=prefix[n-i]-prefix[i];
            System.out.println("left sum = " +ls + "right sum "+ rs );
        }
            
        }
    }