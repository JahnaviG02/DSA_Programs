import java.util.*;
public class Solution {

    public static void main(String[] args) {	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
    int a[] = new int [n];

    int count = 0;
    while (count < n && scan.hasNextInt())
    { 
        int x = scan.nextInt(); 
        a[count] = x; 
        count++;
    }
        scan.close();
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}