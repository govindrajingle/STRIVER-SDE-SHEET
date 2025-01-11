public class MajorityElementTwoOptimal {
    public static void main(String[] args) {
        int arr [] = {2, 1, 4, 2 ,2 ,2, 1, 1, 6, 2, 1};
        int count1 = 0, count2 = 0;
        int ele1 = Integer.MAX_VALUE, ele2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(count1 == 0 && arr[i] != ele2){
                count1++;
                ele1 = arr[i];
            } else if(count2 == 0 && arr[i] != ele1){
                count2++;
                ele2 = arr[i];
            } else if(ele1 == arr[i]){
                count1++;
            } else if(ele2 == arr[i]){
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        System.out.println("elements are "+ele1+" and "+ele2+" with occurrences "+count1+" and "+count2+" respectively.");
    }
}
