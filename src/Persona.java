import java.util.Scanner;

public class Persona {
	protected Scanner entrada;
	protected String nombre;
	protected int edad;
	
	public Persona() {
		entrada=new Scanner(System.in);
	}
	public void cargarDatos() {
		System.out.print("Ingrese el nombre: ");
		nombre=entrada.next();
		System.out.print("Ingrese la edad: ");
		edad=entrada.nextInt();
	}
	public void imprimir() {
		System.out.println("Nombre "+nombre+", su edad "+edad+" años.");
	}
	
	
}
