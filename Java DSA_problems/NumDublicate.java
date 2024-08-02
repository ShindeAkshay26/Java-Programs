package com.Q_preap;
    //{ Driver Code Starts
import java.io.*;
import java.util.*;

    class NumDublicate {
        public static int[] input(BufferedReader br, int n) throws IOException {
            String[] s = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

            return a;
        }

        public static void print(int[] a) {
            for (int e : a) System.out.print(e + " ");
            System.out.println();
        }

        public static void print(ArrayList<Integer> a) {
            for (int e : a) System.out.print(e + " ");
            System.out.println();
        }
    }

    class GFG {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t;
            t = Integer.parseInt(br.readLine());
            while (t-- > 0) {

                int n;
                n = Integer.parseInt(br.readLine());

                int[] arr = NumDublicate.input(br, n);

                Solution obj = new Solution();
                ArrayList<Integer> res = obj.duplicates(arr);

                NumDublicate.print(res);
            }
        }
    }

// } Driver Code Ends



    class Solution {
        public static ArrayList<Integer> duplicates(int[] arr) {
            // code here
            int n=arr.length;
            int i=0;
            int j=n-1;
            ArrayList<Integer> list=new ArrayList<>();
            while(i<j)
            {
                if(arr[i]==arr[j])
                {
                    list.add(arr[i]);
                }
                i++;
                j--;
            }
            if(list==null)
            {
                list.add(-1);

                return list;
            }
            else
            {
                return list;
            }
        }
    }


