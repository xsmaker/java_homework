package compare;

import java.util.Calendar;

public class main {
    public static void main(String[] args) {
        for (int n = 10000; n <= 200000; n += 10000) {
            Str S1 = new Str();
            S1.set();;
            StrBu S2 = new StrBu();
            S2.set();
            long a = S1.addString(n);
            long b = S2.addString(n);
            System.out.println(a +"  " +b);
        }
    }
}
