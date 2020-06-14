import JenkinsLearner.Calculator;
import org.testng.*;
import org.testng.annotations.Test;
public class CalculatorTest {
    Calculator c = new Calculator(10,2);
    @Test
    public void addtest(){
        Assert.assertEquals(new Integer(12),c.add());
    }

    @Test
    public void multiplytest(){
        Assert.assertEquals(new Integer(21),c.multiply());
    }
}
