package hust.soict.dsai.garbage;

public class ConcatenationInLoops {

	public static void main(String[] args) {
		long startTime1 = System.currentTimeMillis();
		String string = new String("Hello");
		for (int i = 0; i < 100000; i++) {
			string += " World";
		}
		System.out.println("String processing time is: " + (System.currentTimeMillis() - startTime1) + "ms");
		
		long startTime2 = System.currentTimeMillis();
		StringBuffer buffer = new StringBuffer("Hello");
		for (int i = 0; i < 100000; i++) {
			buffer.append(" World");
		}
		System.out.println("StringBuffer processing time is: " + (System.currentTimeMillis() - startTime2) + "ms");
		
		long startTime3 = System.currentTimeMillis();
		StringBuilder builder = new StringBuilder("Hello");
		for (int i = 0; i < 100000; i++) {
			builder.append(" World");
		}
		System.out.println("StringBuilder processing time is: " + (System.currentTimeMillis() - startTime3) + "ms");
	}

}
