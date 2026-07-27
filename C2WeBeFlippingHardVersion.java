import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class C2WeBeFlippingHardVersion{

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
            do {
                c = read();
            } while (c <= ' ');

            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }

            long val = 0;
            while (c > ' ') {
                val = val * 10 + (c - '0');
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

        int t = fs.nextInt();

        while (t-- > 0) {
            int n = fs.nextInt();

            long[] a = new long[n + 1];

            for (int i = 1; i <= n; i++) {
                a[i] = fs.nextLong();
            }

            /*
             Let x[i] = parity of operations on suffix including i
             final sign of a[i]:
                unchanged if x[i] even
                flipped if x[i] odd

             Constraint:
                operation at i possible only when current a[i] > 0
                => x[i+1] == (a[i] < 0 ? 1 : 0)

             Therefore:
                x[i] is fully determined from right to left.
             Operation at i exists iff x[i] != x[i+1]
            */

            int[] x = new int[n + 2];

            x[n + 1] = 0;

            for (int i = n; i >= 1; i--) {
                x[i] = (a[i] < 0) ? 1 - x[i + 1] : x[i + 1];
            }

            ArrayList<Integer> ops = new ArrayList<>();

            for (int i = 1; i <= n; i++) {
                if (x[i] != x[i + 1]) {
                    ops.add(i);
                }
            }

            out.append(ops.size()).append('\n');

            for (int i = 0; i < ops.size(); i++) {
                if (i > 0) out.append(' ');
                out.append(ops.get(i));
            }

            out.append('\n');
        }

        System.out.print(out);
    }
}