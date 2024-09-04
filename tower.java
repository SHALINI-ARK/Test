import java.util.*;
public class tower {
    public static int largest(int arr[]){
        int maximum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maximum){
                maximum=arr[i];
            }
        }
        return maximum;
    }
    public static int smallest(int arr[]){
        int minimum=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minimum){
                minimum=arr[i];
            }
        }
        return minimum;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int greatest=largest(arr);
        int small=smallest(arr);
        System.out.println((greatest-k)-(small+k));
    }
}
