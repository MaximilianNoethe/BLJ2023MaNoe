package exceptions;

public class DenyListedPersonException extends ContractException {
    public DenyListedPersonException() {
        super("You aren't permitted to rent this car.");
    }
}
