import java.io.IOException;

public class Hello{
	public static void main(String[] args) throws IOException {
		for (int i = 1; i <= 10; ++i) {
			System.out.println("Hello world.." + i);
			throw new IOException();
		}
	}
}