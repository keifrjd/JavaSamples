public class FieldObject implements Obj{
    double x,y,z;
    FieldObject (double x, double y, double z){
         this.x = x; this.y = y; this.z = z;
         }

    @Override
    public double component(int n) {
        // TODO Auto-generated method stub
        
        switch (n) {
                case 0:
                    return x;

                case 1:
                    return y;

                case 2:
                    return z;

         default: throw new UnsupportedOperationException("Unimplemented method 'component'");
        }
    }

    @Override
    public double lenght() {
        // TODO Auto-generated method stub
        return Math.sqrt(Math.sqrt( x*x + y*y + z*z) );
        //throw new UnsupportedOperationException("Unimplemented method 'lenght'");
        
    }

    @Override
    public Obj plus(Obj other) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'plus'");
        //return new ArrayObject(arr[0]+other.component(0), arr[1]+other.component(1), arr[2]+other.component(2));
    }
    
}