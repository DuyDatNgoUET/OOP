package LopTongQuat;

public class Pair<T,S> {
    private T first;
    private S second;

    public Pair() {
        first = null;
        second = null;
    }

    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(T newValue){
        this.first = newValue;
    }
    public T getFirst(){
        return this.first;
    }

    public void setSecond(S newValue){
        this.second = newValue;
    }
    public S getSecond(){
        return this.second;
    }
}
