public class Principal {	
    public static void main(String[] args){
        int x1, x2;
        x1 = Sistema.read();
        x2 = Sistema.read();
        
        D oA;
        oA = new D();
        oA.init(x1, x2);
        
        Sistema.print(oA.m2());
    }
}
  