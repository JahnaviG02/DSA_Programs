import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> listOfArrays = new ArrayList<ArrayList<Integer>>();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 0; i<n; i++){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int d = sc.nextInt();
        for(int j = 0;j<d;j++){
            int a = sc.nextInt();
            list.add(a);
        }
        listOfArrays.add(list);
    }
    int q = sc.nextInt();
    for(int k = 0; k<q; k++){
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();
        try{
           System.out.println(listOfArrays.get(x-1).get(y-1)); 
        } catch (IndexOutOfBoundsException e){
            System.out.println("ERROR!");
        }
    }
    sc.close();
    }
}