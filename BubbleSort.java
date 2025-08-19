import java.util.Scanner;
 class BubbleSort {
    public static void main(String[] args){
        int arr[]={44,22,55,33,11};
        int n;
        Scanner Sc=new Scanner(System.in);
        n= arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(" array after sorted:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}