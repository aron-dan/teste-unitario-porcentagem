import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TesteCalculo {
	Calculo calculo = new Calculo();

	@Test
	public void testCalculo() {
		
		double result = calculo.calculo();
		Assertions.assertEquals(result, calculo.calculo());
	}

}
