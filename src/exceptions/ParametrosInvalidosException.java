package exceptions;

public class ParametrosInvalidosException extends Exception {
    
    // constrói um objeto NumeroNegativoException com a mensagem passada por parâmetro
    public ParametrosInvalidosException(String msg){
        super(msg);
    }

    // contrói um objeto NumeroNegativoException com mensagem e a causa dessa exceção, utilizado para encadear exceptions
    public ParametrosInvalidosException(String msg, Throwable cause){
        super(msg, cause);
    }


}
