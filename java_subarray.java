import java.util.*;
public class SubArray {
    static int[] array (){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = s.nextInt();
        }
        s.close();
        return arr;
    }
    static int NegativeCount(int[] arr1){   
        int sum=0, count=0;

        for(int i=0;i<arr1.length;i++){

            for(int j=i;j<arr1.length;j++) {

                for(int k=i; k<=j;k++){
                    sum = sum + arr1[k];
                }
                
                if(sum < 0) {
                    count =count+1;
                }
                sum =0;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
       System.out.print(NegativeCount(array()));

    }
}