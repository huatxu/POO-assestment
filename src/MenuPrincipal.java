import java.io.BufferedReader;
import java.io.IOException;

public class MenuPrincipal implements Menu {
	private BufferedReader reader;
	public MenuPrincipal(BufferedReader reader) {
		this.reader = reader;
	}
	@Override
	public void show() throws IOException {
		System.out.println("Bienvenido al menu principal");
		System.out.println("Seleccione una opci�n");
		System.out.println("A�adir alumno        : A");
		System.out.println("Eliminar alumno      : B");
		System.out.println("Ver alumnos          : C");
		System.out.println("Estad�sticas         : D");
		System.out.println("Salir                : E");
		char option = process(reader.readLine());
		selectOption(option);
	}
	private void selectOption(char option) throws IOException {
		switch(option) {
			case 'A':
				Driver.addAlumno();
				break;
			case 'B':
				Driver.deleteAlumno();
				break;
			case 'C':
				Driver.showAlumnos();
				break;
			case 'D':
				Driver.stats();
				break;
			case 'E':
				break;
			default:
				System.out.println("Opci�n no v�lida");
				show();
				break;
		}
	}
	private char process(String readLine) {
		return readLine.trim().length() > 0 ? readLine.trim().toUpperCase().charAt(0) : ' ';
	}
	
}
