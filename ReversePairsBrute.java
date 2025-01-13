    public class ReversePairsBrute {
        public static void main(String[] args) {
            //return the number of pairs which has arr[i] > 2 * arr[j] , return count of (i, j)
            int arr [] = {-5, -5};
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) { //it does not include self, count starts from i + 1
                    if(arr[i] > (2 * arr[j])){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
