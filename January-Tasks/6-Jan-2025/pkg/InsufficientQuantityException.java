//InsufficientQuantityException -> Checked Exception

public class InsufficientQuantityException extends Exception
{
    public InsufficientQuantityException(String errorMessage){
        this.errorMessage = errorMessage;
    }
}