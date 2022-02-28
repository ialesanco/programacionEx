import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;

public class Examen {
	public static void main(String[] args) {
		ArrayList<Integer> resultado = new ArrayList<>();
		Collections.shuffle(resultado);// Desordenar
		Collections.sort(resultado);// Menor a mayor
		Collections.reverse(resultado);// Mayor a menor
	}

	// PALABRAS REPETIDAS ARRAYS
	public static boolean hayRepetidos(ArrayList<String> array) {
		int posicionPalabraBuscada = 0;
		boolean estaRepetida = false;
		while (!estaRepetida && posicionPalabraBuscada < array.size()) {
			int i = 0;
			String palabraBuscada = array.get(posicionPalabraBuscada);
			while (!estaRepetida && i < array.size()) {
				if (posicionPalabraBuscada != i && palabraBuscada.equalsIgnoreCase(array.get(i))) {
					estaRepetida = true;
				}
			}
			posicionPalabraBuscada++;
		}
		return estaRepetida;
	}

	// ORDENAR ARRAYS DE MAYOR A MENOR
	public static ArrayList<Integer> ordenarArray(ArrayList<Integer> array) {
		ArrayList<Integer> arrayOrdenado = new ArrayList<>();
		int tamanio = array.size();
		for (int i = 0; i < tamanio; i++) {
			Integer max = getMax(array);
			arrayOrdenado.add(max);
			array.remove(max);
		}

		return arrayOrdenado;
	}

	private static Integer getMax(ArrayList<Integer> array) {
		Integer max = Integer.MIN_VALUE;
		for (Integer integer : array) {
			if (integer > max) {
				max = integer;
			}
		}
		return max;
	}

	// SACAR EL MINIMO DE UN ARRAYLIST DE INTEGERS
	private static Integer getMin(ArrayList<Integer> array) {
		Integer min = Integer.MAX_VALUE;
		for (Integer num : array) {
			if (num < min) {
				min = num;
			}
		}
		return min;
	}

	// INVERTIR UN NUMERO CON CHARS[]
	public static Integer invertirEntero(Integer entero) {
		char[] enteroChars = entero.toString().toCharArray();
		char[] enteroInvertidoChars = new char[enteroChars.length];
		int j = 0;
		for (int i = enteroChars.length - 1; i >= 0; i--) {
			enteroInvertidoChars[j] = enteroChars[i];
		}
		String enteroInvertido = "";
		for (char c : enteroInvertidoChars) {
			enteroInvertido = enteroInvertido + c;
		}
		return Integer.valueOf(enteroInvertido);
	}

	// SABER SI UN NUMERO ESPRIMO
	public static boolean esPrimo(Integer numero) {
		int contador = 2;
		boolean primo = true;
		while ((primo) && (contador != numero)) {
			if (numero % contador == 0) {
				primo = false;
			}
			contador++;

		}
		return primo;

	}

	// SABER SI UN NUMERO ES CAPICUA/PALINDROMO
	public static boolean Capicua(Integer numero) {
		String num = numero.toString();
		boolean noCapicua = true;
		int contador = num.length() - 1;
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i) == num.charAt(contador)) {
				contador--;
			} else {
				noCapicua = false;
			}
		}
		return noCapicua;

	}

	// SACAR EL MENOR DE UN ARRAYLIST DE STRING
	public static String menor(ArrayList<String> trabajar) {
		String min = trabajar.get(0);
		for (String palabra : trabajar) {
			if (palabra.compareTo(min) < 0) {
				min = palabra;
			}
		}
		trabajar.remove(min);
		System.out.println(trabajar);
		return min;
	}

	// FUNCION QUE SACA LOS MAYORES DE EDAD
	public static ArrayList<Persona> mayoresEdad(ArrayList<Persona> personas) {
		ArrayList<Persona> personasDevueltas = new ArrayList<Persona>();
		for (Persona persona : personasDevueltas) {
			long edad = new Date().getTime() - persona.getFechNacimiento().getTime();
			long anios18EnMs = 18 * 365 * 24 * 60 * 60 * 1000;// 18 anios en milisegundos
			if (edad >= anios18EnMs) {
				personasDevueltas.add(persona);
			}
		}
		return personasDevueltas;
	}

// SABER SI DOS FECHAS SON EL MISMO DIA
	public Boolean esMismoDia(Date d1, Date d2) {
		GregorianCalendar gc1 = new GregorianCalendar();
		gc1.setTime(d1);
		GregorianCalendar gc2 = new GregorianCalendar();
		gc2.setTime(d2);
		return gc1.get(GregorianCalendar.DAY_OF_MONTH) == gc2.get(GregorianCalendar.DAY_OF_MONTH)
				&& gc1.get(GregorianCalendar.MONTH) == gc2.get(GregorianCalendar.MONTH)
				&& gc1.get(GregorianCalendar.YEAR) == gc2.get(GregorianCalendar.YEAR);
	}
}
