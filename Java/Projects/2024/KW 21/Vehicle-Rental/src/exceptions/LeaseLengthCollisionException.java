package exceptions;

public class LeaseLengthCollisionException extends ContractException{
    public LeaseLengthCollisionException(){
        super("I'm sorry but there is someone else renting this car during your rental period already.");
    }
}
