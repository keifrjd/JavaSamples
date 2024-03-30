
public class ZeroObj implements Obj {
    public static final ZeroObj INSTANSE = new ZeroObj();
    private ZeroObj(){}
    @Override
    public double component(int n) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double lenght() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Obj plus(Obj other) {
        // TODO Auto-generated method stub
        return other;
    }
    @Override
     public String toString(){
         return "(" + 0 + ", " + 0 + ", " + 0 + ")";
     }
     
    public static void main(String[] args) {
        Obj v1 = ZeroObj.INSTANSE;
        Obj v2 = new ArrayObject(1, 2, 3);
        Obj v3 = new FieldObject(4, 5, 6);
        Obj sum = v1.plus(v2).plus(v3);
        System.out.println(sum.component(0)+ "," + sum.component(1) + "," + sum.component(2)); 
    } 
}
