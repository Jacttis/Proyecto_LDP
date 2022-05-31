public class B extends A {

    int v3;

    public void init(){
        super.init();
        v3 = 10;
    }

    public int m2(int x){
        int aux = this.m2();
        return v3 + aux/2;
    }
}
