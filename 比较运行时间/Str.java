package compare;

public class Str {
    private String S;
    public Str(String S){
        this.S = S;
    }
    public Str(){
    }
    public void set(){
        this.S = "a";
    }
    public long addString(int n){
        long start = System.currentTimeMillis();
        for ( int i = 0; i < n; i ++){
            this.S = this.S + "a";
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
