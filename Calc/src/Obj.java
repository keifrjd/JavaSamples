/** 
*ObjectVector
*/
interface Obj{
    double component(int n);
    double lenght();
    Obj plus(Obj other);
    @Override
    String toString();

   /*default double lenght() { //дальше наше дело, переопределять метод или нет
        double x = component(0);
        double y = component(0);
        double z = component(0);
        return Math.sqrt(x*x + y*y + z*z);
    } */ 
    static Obj of(double x, double y, double z){
        if ( x==0 && y== 0 && z == 0 ){
            return ZeroObj.INSTANSE;
        }
        return new ArrayVector(x,y,z);
    }
    Obj Zero = new AbstractObject() {

        @Override
        public double component(int n) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'component'");
        }

        @Override
        public double lenght() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'lenght'");
        }

        @Override
        public Obj plus(Obj other) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'plus'");
        }
        @Override
        public String toString(){
            return "(0,0,0)";
        };
    };
}

    
