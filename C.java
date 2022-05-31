public class C extends B {
    
    public void init(){
        super.init();
        v3 = 2;
    }

    public int m1(int max){
        if(max >= (v1 + v2 + v3) | max == 2){
            max = max + (v1 * v2 * v3);
            return max;
        }
        return super.m1(max);
    }
}
