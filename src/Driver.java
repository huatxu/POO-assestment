import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Driver {

	public static void main(String[] args) {
		final DB db; 
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			db = new DB("db.txt");
			Menu menu = new MenuPrincipal(reader);
			menu.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void addAlumno() {
		
	}

	public static void deleteAlumno() {
		
	}

	public static void showAlumnos() {
		
	}

	public static void stats() {
		
	}

}
