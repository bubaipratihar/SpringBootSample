package bprat;

/**
 * Simulated Business logic exception indicating a desired business entity or record missing.
 */
public class UserException extends RuntimeException {
    public UserException(String msg){
        super(msg);
    }
}
