import java.io.*;
import java.util.*;

public class CDuckSurplus{
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        long nextLong() throws IOException {
            int c;
            while ((c = read()) <= ' ') ;
            long sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }
            long val = 0;
            while (c > ' ') {
                val = val * 10 + c - '0';
                c = read();
            }
            return val * sign;
        }

        int nextInt() throws IOException {
            return (int) nextLong();
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();

        int T = fs.nextInt();

        while (T-- > 0) {
            int n = fs.nextInt();

            ArrayDeque<Long> st = new ArrayDeque<>();

            for (int i = 0; i < n; i++) {
                long x = fs.nextLong();

                while (!st.isEmpty() && st.peekLast() > x) {
                    x += st.pollLast();
                }
                st.addLast(x);
            }

            long ans = 0;
            for (long v : st) ans = Math.max(ans, v);

            out.append(ans).append('\n');
        }

        System.out.print(out);
    }
}