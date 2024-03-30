public  class ArrayObject implements Obj{
    double[] arr;
    ArrayObject (double x, double y, double z){ arr = new double[] {x, y, z}; }

    @Override
    public double component(int n) {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'component'");
        return n;
    }

    @Override
    public double lenght() {
        // TODO Auto-generated method stub
        return Math.sqrt(arr[0] * arr[0] + arr[1]*arr[1]+ arr[2]* arr[2]);
        //throw new UnsupportedOperationException("Unimplemented method 'lenght'");
        
    }

    @Override
    public Obj plus(Obj other) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'plus'");
        return new ArrayObject(arr[0]+other.component(0), arr[1]+other.component(1), arr[2]+other.component(2));
    }
   
     @Override
     public String toString(){
         return "(" + arr[0] + ", " + arr[1] + ", " + arr[2] + ")";
     }

}

