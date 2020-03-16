import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTestSuite {
    MathUtils mathUtils = new MathUtils();
    @Test
    public void ShouldReturnExceptionWhenDividingByZero() throws ArithmeticException {
       assertThrows(ArithmeticException.class, ()->mathUtils.divide( 1,0));
    }
}