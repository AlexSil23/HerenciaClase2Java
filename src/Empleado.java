
public class Empleado extends Persona {
	protected int sueldo;
	
	public void cargarSueldo() {
		System.out.print("Ingrese el sueldo de "+nombre+": ");
		sueldo=entrada.nextInt();
	}
	public void imprimirSueldo() {
		System.out.print("Nombre: "+nombre+", sueldo "+sueldo+" pesos.");
	}
}
