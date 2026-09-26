import java.util.*;
public class Secondlargest{
    public static void Secondmax(int arr[],int n ){
       int max,smax;
       
       if(arr[0]>arr[1]){
           max=arr[0];
           smax=arr[1];
       }
       else{
           max=arr[1];
           smax=arr[0];
       }
        
        for(int i=2;i<n;i++){
            if(arr[i]>max){
            smax=max;
            max=arr[i];
            }
            else if(arr[i]>smax && arr[i]!=max){
                smax=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(smax);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
    
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    Secondmax(arr,n);
   
    }
}