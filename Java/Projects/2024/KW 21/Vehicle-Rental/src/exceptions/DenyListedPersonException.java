package exceptions;

public class DenyListedPersonException extends ContractException{
    public DenyListedPersonException(){
        super("ERROR");
    }
}
