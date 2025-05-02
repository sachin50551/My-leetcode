import java.util.*;
public class deleteduplicate {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int [size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int j=1;
        for(int i=1;i<size;i++){
            if(arr[i]!=arr[i-1]){
                arr[j]=arr[i];
                j++;
            }

        }
        for(int i=0;i<j;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}