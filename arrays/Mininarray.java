package arrays;

public class Mininarray {
    public static void main(String[] args) {
        int arr[] = {12, 13, 1, 10, 34, 10};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(min>arr[i])min=arr[i];
        }System.out.println(min);
    }
}
