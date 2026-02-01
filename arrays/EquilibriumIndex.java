package arrays;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2};

        // Base case: empty array
        if (arr.length == 0) {
            System.out.println("No equilibrium index");
            return;
        }
        int totalSum=0;
        //calc tot sum 
        for (int i = 0; i < arr.length; i++) {
            totalSum+=arr[i];
        }
        int leftSum=0;
        for (int i = 0; i < arr.length; i++) {
            int rightSum=totalSum-leftSum-arr[i];
            if(leftSum==rightSum){
                System.out.println("Equilibrium index is: " + i);
                return;
            }
            leftSum+=arr[i];//update for next index
        }

        // If no equilibrium index found
        System.out.println("No equilibrium index found");
    }//tc:o(n),sc:o(1)
}
