import org.junit.Test;

public class CalculadoraFrankTest {
	
	@Test
	public void sumaTest() {
		Double numero1 = 3D;
		Double numero2 = 12.3D;
		Double resultado = CalculadoraFrank.sumar(numero1, numero2);
		
		System.out.println("La suma es: " + resultado);
	}
	
	@Test
	public void restaTest() {
		Double numero1 = 3D;
		Double numero2 = 12.3D;
		Double resultado = CalculadoraFrank.restar(numero1, numero2);
		
		System.out.println("La resta es: " + resultado);
	}
	
	@Test
	public void multiplicacionTest() {
		Double numero1 = 3D;
		Double numero2 = 12.3D;
		Double resultado = CalculadoraFrank.multiplicacion(numero1, numero2);
		
		System.out.println("La multiplicación es: " + resultado);
	}
	
	@Test
	public void divisionTest() {
		Double numero1 = 3D;
		Double numero2 = 12.3D;
		Double resultado = CalculadoraFrank.division(numero1, numero2);
		
		System.out.println("La división es: " + resultado);
	}

}
