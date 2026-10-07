import java.util.Scanner;
class Missing {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int e_sum = ((n + 1) * (n + 2)) / 2;
        int a_sum=0;
        for(int i=0;i<n;i++){
            a_sum=a_sum+arr[i];
        }
        int missing = (e_sum - a_sum);
        System.out.println("The missing number is:" + missing);
    }
}
// Not optimal . we have to use xor operation