import java.util.Scanner;
class SecondLargest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int l=arr[0];
        int sl=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]>l){
                sl=l;
                l=arr[i];
            }
            else if(arr[i]>sl && arr[i]<l){
                sl=arr[i];
            }
        }
        System.out.println("The second largest is"+sl);
    }
}
