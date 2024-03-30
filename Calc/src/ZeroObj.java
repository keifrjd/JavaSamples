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
    
}
