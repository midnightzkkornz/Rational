import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void subtract() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.subtract(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void multiply() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.multiply(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(8, x.denominator);
    }
    @Test
    public void divide() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 3;
        x.divide(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(2, x.denominator);
    }

    @Test
    public void equals() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 3;

        Assert.assertEquals(false, x.equals(y));
        Assert.assertEquals(true, x.equals(x));
    }

    @Test
    public void compareTo() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 3;
        Rational z = new Rational();
        z.numerator = 1;
        z.denominator = 1;

        Assert.assertEquals(1,x.compareTo(y));
        Assert.assertEquals(0,x.compareTo(x));
        Assert.assertEquals(-1,x.compareTo(z));
    }

    @Test
    public void itoString() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 3;

        Assert.assertEquals("1/2",x.toString());
        Assert.assertEquals("1/3",y.toString());
    }

}
