import java.util.logging.Logger;

public class Calculator {


    public Complex multiply(Complex a, Complex b) {
        return a.add(b);
    }

    public Complex divide(Complex a, Complex b) {
        return a.add(b);
    }

    private static final Logger LOGGER = Logger.getLogger(Calculator.class.getName());


    public Complex add(Complex a, Complex b) {
        LOGGER.info("Operation summ");
        Complex result = a.add(b);
        LOGGER.info("Result: " + result);
        return result;
    }


}
