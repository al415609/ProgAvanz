Test(Version 1)
```
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TablaConversionTest{

	@BeforeEach
	void setUp(){
	}

	@Test
	void celsiusAFahrenheit(){
		TablaConversion tabla = new TablaConversion();
		double valorObtenido = tabla.celsiusFahrenheit(0);
		double valorEsperado = 32.0;
		assertEquals(valorEsperado, valorObtenido);
	}
	@Test
	void celsiusAREamur(){
		TablaConversion tabla = new TablaCOnversion();
		double valorObtenido = tbala.celsiuesAReamur(5.0);
		double valorEsperado = 4.0;
		assertEquals(valorEsperado, valorObtenido);
	}
	@Test
	void celsiusAFahrenheit5(){
		TablaConversion tabla = new TablaCOnversion();
		double valorObtenido = tbala.celsiuesAReamur(5.0);
		double valorEsperado = 41.0;
		assertEquals(valorEsperado, valorObtenido);
	}

}
```

Test(Version 2)
```
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TablaConversionTest{

	@BeforeEach
	void setUp(){
		tabla = new TablaConversion();
	}

	@Test
	void celsiusAFahrenheit(){
		assertEquals(32.0, tabla.celsiusAFahrenheit(0));
	}
	@Test
	void celsiusAReamur(){
		assertEquals(4.0, tabla.celsiusAReamur(5.0));
	}
	@Test
	void celsiusAFahrenheit5(){
		assertEquals(41.0, tabla.celsiusAFahrenheit(5));
	}

}
```

Programa
```
public class TablaConversion {

	public void muestraTabla(){
		for(double celsiues = 0.0; celsius <= 100.0; celsiues += 5.0){
			System.out.println(celsius + "." + celsiusAFahrenheit(celsius) +                 "." + celsiusAReamur(celsius));
		}
	}

	public double celsiusAFahrenheit(double celsius){
		return 9.0/5.0 * celsius + 32;
	}
	public double celsiusAReamur(double celsius){
		return 4.0/5.0 * celsius;
	}
}
```

Programa mejorado:
```
public class TablaConversion {

	private ConversorFahrenheit conversorFahrenheit = new ConversorFahrenheit();
	private ConversorFahrenheit conversorReamur = new ConversorReamur();
	private List<Coonversor> conversores = new ArrayList<>(); /* De esta forma       no hace falta tener un conversor para cada uno se van añadiendo aqui *\

	public void muestraTabla(){
		for(double celsiues = 0.0; celsius <= 100.0; celsiues += 5.0){
			System.out.println(celsius + "." + celsiusAFahrenheit(celsius) +                 "." + celsiusAReamur(celsius));
		}
	}
}

```
```
Esto es una clase separada:

public class ConversorFahrenheit implement Conversor{

	@Override
	public double convierte(double celsius){
		return 9.0/5.0 * celsius + 32;
	}
}

Esto es otra clase separada:

public class ConversorReamur implements Conversor{

	@Overrride
	public double convierte(double celsius){
		return 4.0/5.0 * celsius;
	}
}
```
Como se ve se utiliza el mismo metodo convierte por lo que tmabién se puede introducir una interfaz.
```
public interfave Conversor{
	public obstarct double convierte(double celsius);
}
```
Programa con la lista de conversores
```
public class TablaConversion {

	private ConversorFahrenheit conversorFahrenheit = new ConversorFahrenheit();
	private ConversorFahrenheit conversorReamur = new ConversorReamur();
	private List<Coonversor> conversores = new ArrayList<>(); 
	/* De esta forma no hace falta tener un conversor para cada uno se van añadiendo aqui *\

	public void muestraTabla(){
		for(double celsiues = 0.0; celsius <= 100.0; celsiues += 5.0){
			System.out.print(celsius + ".");
			for(Conversor conversor: conversores){
				System.out.print(conversor.convierte(celsius) + ".");
			}
			System.out.println("");
		}
	}
	
	public void addConversor(Conversor conversor){
		conversores.add(conversor);
	}
}

También nos piden en este caso añadir la magnitud kelvin simplemente creariamos una nueva clase que implemente la interfaz de kelvin de la siguiente forma:

public class ConversorKelvin implements Conversor{

	@Override
	public double convierte(double celsius){
		return celsius + 273.1
	}

}

Programa main.

import conversores.ConversorFahrenheit;
import conversores.ConversorReamur;
import conversores.ConversorKelvin;
import conversores.TablaConversion;

public class Main{
	public static void main(String[] args){
		TablaConversion tabla = nre TablaConversion();
		tabla.addConversor(new ConversorFahrenheit());
		tabla.addConversor(new ConversorReamur());
		tabla.addConversor(new ConversorKelvin());
		tabla.muestraTabla();
	}
}
```
