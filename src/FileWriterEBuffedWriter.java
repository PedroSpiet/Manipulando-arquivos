import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEBuffedWriter {
	public static void main(String[]args) {
		String[] lines = new String[] {"Good Morning", "Good Afternoon"};

		String path = "/home/pedro/Documentos/out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true)))
		{
			for (String line: lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
