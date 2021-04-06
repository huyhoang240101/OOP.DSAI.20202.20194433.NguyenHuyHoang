package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {

	public static void main(String[] args) throws IOException {
		String test = "f:/Study/20202/Object-Oriented Programming/Lab/Lab03/samples1.exe";
		byte[] inputBytes = {0};
		inputBytes = Files.readAllBytes(Paths.get(test));
		long startTime = System.currentTimeMillis();
		StringBuilder outputStringBuilder = new StringBuilder();
		for (byte b : inputBytes) {
			outputStringBuilder.append(b);
		}
		System.out.println("Running time: " + (System.currentTimeMillis() - startTime));

	}

}
