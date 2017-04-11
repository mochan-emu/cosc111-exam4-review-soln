import java.io.IOException;

public class MagicSquaresApp 
{
	public static void main(String[] args) throws IOException
	{
		// The files that we will check if are magic squares
		String[] files = {"Test.txt", "Luna.txt", "Mercury.txt"};
		
		for (String file : files)
		{
			// Create a magic square
			MagicSquare ms = new MagicSquare(file);
			// Print out the matrix
			System.out.print(ms.toString());
			// Tell the user if is a magic square or not
			System.out.println(ms.isMagic());
			System.out.println("");
		}		
	}
}
