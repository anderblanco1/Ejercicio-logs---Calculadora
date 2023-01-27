package operaciones;
public class Operaciones{
	/*
	 * @param valor1 un numero entero
	 * @param valor2 un numero entero
	 * @param numero suma valor1 y valor 2
	 * @return suma dos valores 
	 */
    public int sumar (int valor1, int valor2){
        int numero;
        numero = valor1 + valor2;
        return numero;
    }
    /*
	 * @param valor1 un numero entero
	 * @param valor2 un numero entero
	 * @param numero resta valor1 y valor 2
	 * @return resta dos valores
	 */
    public int restar (int valor1, int valor2){
        int numero;
        numero = valor1 - valor2;
        return numero;
    }
    /*
	 * @param valor1 un numero entero
	 * @param valor2 un numero entero
	 * @param numero multiplica valor1 y valor 2
	 * @return multiplica dos valores
	 */
    public int multiplicar (int valor1, int valor2){
        int numero;
        numero = valor1 * valor2;
        return numero;
    }
    /*
	 * @param valor1 un numero entero
	 * @param valor2 un numero entero
	 * @param numero divide valor1 y valor 2
	 * @return divide dos valores
	 */
    public int dividir (int valor1, int valor2){
        int numero;
        numero = valor1 / valor2;
        return numero;
    }
    
    public int resto (int valor1, int valor2){
        int numero;
        numero = valor1 % valor2;
        return numero;
    }
}