Write a program to accept the array and count the number of odd and even numbers in the given array

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int count = 0;
        int count1=0;
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
          if(a[i]%2==0){
              count++;
          }
            else{
                count1++;
            }
        }
        System.out.println("Odd = " + count1);
             System.out.println("Even = " + count);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
