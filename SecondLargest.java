/*
You are given an integer array A.
Find the second largest element/value in the array or report that no such element exists.

Pseudocode:-

START

1. READ size n
2. INPUT array A of size n

3. IF n < 2 THEN
      PRINT "No second largest element exists"
      STOP
   END IF

4. SET largest = -∞
5. SET secondLargest = -∞

6. FOR each element in array
      IF element > largest THEN
          secondLargest = largest
          largest = element
      ELSE IF element > secondLargest AND element != largest THEN
          secondLargest = element
      END IF
   END FOR

7. IF secondLargest == -∞ THEN
      PRINT "No second largest element exists"
   ELSE
      PRINT secondLargest
   END IF

END
*/

class SecondLargest{
    public static void main(String[] args) {

        int[] arr = {3, 5, 2, 5, 1};

        if (arr.length < 2) {
            System.out.println("No second largest element exists");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element exist");
        } else {
            System.out.println("Second largest element is: " + secondLargest);
        }
    }
}