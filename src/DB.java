import java.io.File;
import java.io.IOException;

public class DB {
	File file;
	public DB(String input) throws IOException {
		file = new File(input);
		if (!file.exists()) {
			file.createNewFile();
		}
	}
}
