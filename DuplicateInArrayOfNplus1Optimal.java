public class DuplicateInArrayOfNplus1Optimal {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 6, 6}; // Input array with a duplicate element
        int slow = a[0], fast = a[0];
        // 1. Detect starting point of cycle in linked list
        do{
            slow = a[slow];
            fast = a[a[fast]];
        } while (slow != fast);
        // 2. Find the number
        slow = a[0];
        while(slow != fast){
            slow = a[slow];
            fast = a[fast];
        }
        System.out.println("Duplicate element: " + slow);
    }
}
