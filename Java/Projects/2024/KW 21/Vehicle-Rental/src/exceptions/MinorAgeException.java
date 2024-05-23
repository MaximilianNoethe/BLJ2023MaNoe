package exceptions;

public class MinorAgeException extends ContractException{
    public MinorAgeException(){
        super("You are too young to rent this car.");
    }
}
