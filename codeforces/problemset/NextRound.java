package codeforces.problemset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class NextRound {
    private static void solve(FastScanner fs) {
        // add code
        int n = fs.nextInt();
        int k = fs.nextInt();
        long[] a = fs.readArray(n);
        long threshold = a[k-1];
        int ans = 0;
        for(long s : a)
            if(s != 0 && s >= threshold)
                ans++;
        System.out.println(ans);
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