import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class PascalsTreangleTest {

    public PascalsTreangle pascalsTreangle;

    @Before
    public void init() {
        pascalsTreangle  = new PascalsTreangle();
    }

    @Test(expected = IOException.class)
    public void pascalsTreangleTestZero() throws IOException {
        pascalsTreangle.bildPascalsTreangle(0);
    }

    @Test(expected = IOException.class)
    public void pascalsTreangleTestMinusInput() throws IOException {
        int num = -7;
        pascalsTreangle.bildPascalsTreangle(num);
    }

}
