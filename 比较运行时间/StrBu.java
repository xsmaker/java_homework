package compare;

import java.util.Calendar;

public class StrBu {
    private StringBuffer S;
    public void set(){
        S = new StringBuffer("a");
    }
    public long addString(int n) {
        StringBuffer S = new StringBuffer("a");
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            S.append("a");
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
