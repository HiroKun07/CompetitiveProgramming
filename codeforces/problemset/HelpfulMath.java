package codeforces.problemset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class HelpfulMath {
    private static void solve(FastScanner fs) {
        // add code
        String[] s = fs.next().split("\\+");
        int[] a = new int[s.length];
        for(int i=0; i<s.length; i++)
            a[i] = Integer.parseInt(s[i]);
        Arrays.sort(a);
        System.out.print(a[0]);
        for(int i=1; i<a.length; i++)
            System.out.print("+" + a[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        solve(fs);
    }

    static class FastScanner {
        BufferedReader br = null;
        StringTokenizer st;
        
        FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while(st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch(IOException e) {
                e.printStackTrace();;
            }
            return str;
        }

        long[] readArray(int n) {
            long[] arr = new long[n];
            for(int i=0; i<n; i++)
                arr[i] = nextLong();
            return arr;
        } 
    }
}
