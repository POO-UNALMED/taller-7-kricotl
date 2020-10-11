package comunicacion;
import java.util.*;

public class Alfabeto extends Pictograma {
	private static String letras[];
	private String interpretacion;
	public Alfabeto (String origen,String[] letras, String interpretacion) {
		super(origen);
		Alfabeto.letras=letras;
		this.interpretacion=interpretacion;
	}
	
	public String interpretacion() {
		return interpretacion;
	}

	public String toString() {
		String a="";
		for (int x=0;x<letras.length-1;x++) {
			a += letras[x]+", ";
		}
		a += letras[letras.length-1];
		return a;
	}
	public int cantidadLetras() {
		return letras.length;
	}

}
