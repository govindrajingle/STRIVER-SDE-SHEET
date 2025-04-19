package a2z.striver;

public class MajorityElementOptimal {
    public static void main(String[] args) {
        int arr [] = {3, 2, 1, 2, 2, 4, 2};
        //Moore's voting algorithm
        int freq = 0, element = arr[0],  n = arr.length;
        for(int i=0; i<n; i++){
            if(freq == 0){
                element = arr[i];
            } if (arr[i] == element){
                freq++;
            } else {
                freq--;
            }
        }
        int count = 0;
        for(int i : arr){
            if(i == element) {
                count++;
            }
        }
        if(count > n/2){
            System.out.println("majority element is " + element);
        } else {
            System.out.println("majority element does not exist");
        }

    }
}
