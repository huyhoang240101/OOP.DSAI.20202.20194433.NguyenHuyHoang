package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {

	public static void main(String[] args) throws IOException{
		String test = "f:/Study/20202/Object-Oriented Programming/Lab/Lab03/samples1.exe";
		byte[] inputBytes = {0};
		inputBytes = Files.readAllBytes(Paths.get(test));
		long startTime = System.currentTimeMillis();
		String outputString = "";
		for (byte b : inputBytes) {
			outputString += "b";
		}
		System.out.println("Running time: " + (System.currentTimeMillis() - startTime));
	}

}
