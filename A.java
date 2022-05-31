public class A {
    
    int v1, v2;

    public void init(){
        v1 = 2;
        v2 = 0;
    }

    public int m1(int max){
        int i = 0;
        boolean seguir = true;

        while (seguir & i < max){

            if (v1 + i > v2 * i){
                v2 = v2 + i;
                v1 = v1 + 1;
            } else {
                return v1*v2;
            }
            seguir = v1 != v2;
            i = i+1;
        }
        return v1+v2;  
    }

    public int m2(){
        int j;
        j = this.m1(v1*3); 
        return j; 
    } 
}
