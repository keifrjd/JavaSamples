abstract class AbstractObject implements Obj {
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Obj)) return false;
        Obj that = (Obj) o;
        return this.component(0) == that.component(0) &&
        this.component(1) == that.component(1) &&
        this.component(2) == that.component(2) ;
    }
    @Override
    public String toString(){
        return "(" + component(0) + "," + component(1) + "," +component(2);
    }
}
