package kodlamaio.northwind.core.utilities.results;

public class DataResult<T> extends Result{

    private T data;

    public DataResult(T data,boolean success, String message) {
        super(success, message);  //this o sınıfın constructorını calıstırırken super base (super) sınıfın constructorlarını calıstırır
        this.data = data;
    }

    public DataResult(T data,boolean success) {
        super(success);  //this o sınıfın constructorını calıstırırken super base (super) sınıfın constructorlarını calıstırır
        this.data = data;
    }

    public T getData(){
        return this.data;
    }
}
