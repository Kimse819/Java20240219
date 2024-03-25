package ch11.lecture.Expro;

public class NotExistIDException extends Exception{
    public NotExistIDException() {}
    public NotExistIDException(String message){
        super(message);
    }

}
