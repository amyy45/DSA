package basic_recursion;

public class nTo1 {
    void printNto1(int i,int n) {
        if(i<1) {
            return;
        }
        System.out.println(i);
        printNto1(i-1,n);
    }
    public static void main(String[] args) {
        int n=5;
        nTo1 obj=new nTo1();
        obj.printNto1(n,n);
    }
}
    