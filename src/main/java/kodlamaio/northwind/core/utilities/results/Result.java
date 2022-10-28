package kodlamaio.northwind.core.utilities.results;

public class Result {
    private boolean success;
    private String message;

    public Result(boolean success){

        this.success = success;
    }

    public Result(boolean success,String message){

        this(success);  // kendini tekrar etmemek adına tekrar setlememiz gerekirse this() kullanabiliriz, tek parametreli constructorı çalıştırır
        this.message = message;
    }

    public boolean isSuccess(){
        return this.success;
    }

    public String getMessage(){
        return this.message;
    }
}
