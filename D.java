public class D extends C {
    
    int v4, v5;
    B o1;

    public void init(int x, int y){
        super.init();
        v1 = x + y + 4;
        v4 = x;
        v5 = x + y;
        o1 = new B();
        o1.init();
    }

    public int m2(){
        int j;
        int aux = o1.m2(v1 + v4 + v5/2);
        j = this.m1(aux + 11*v3);
        return j;
    }

    public int opD(int num){
        switch (num) {
            case 1:
                return num * 10;
                break;
            case 2: 
                return num + 10;
                break;
            default:
                return num;
        }
    }
}
