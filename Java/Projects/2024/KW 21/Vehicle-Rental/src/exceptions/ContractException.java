package exceptions;

public class ContractException extends Exception {
    public ContractException(String errorCode) {
        super(errorCode);
    }
}
