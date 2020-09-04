package codeforces.problemset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Team {
    private static int solve(FastScanner fs) {
        // add code
        int p = fs.nextInt();
        int v = fs.nextInt();
        int t = fs.nextInt();
        int ans = 0;
        if(p == 1)
            ans++;
        if(v == 1)
            ans++;
        if(t == 1)
            ans++;
        return ans;
    }

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int tests = fs.nextInt();
        int ans = 0;
        while(tests-- > 0) {
            int canSolve = solve(fs);
            if(canSolve > 1)
                ans++;
        }
        System.out.println(ans);
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