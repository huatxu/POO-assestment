
public class Alumno {
	private String nombre;
	private String apellido;
	private int clase;
	private int[] notas;
	Alumno(String nombre, String apellido, int clase) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.clase = clase;
		this.notas = new int[5];
	}
	void add(CLASES clase, int nota) {
		this.notas[clase.ordinal()] = nota;
	}
	int get(CLASES clase) {
		return this.notas[clase.ordinal()];
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getClase() {
		return clase;
	}
}
