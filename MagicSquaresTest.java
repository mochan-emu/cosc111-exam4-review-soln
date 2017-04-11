import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.Test;

public class MagicSquaresTest {

	/*
	 * Test that the first column sums up to 15
	 */
	@Test
	public void TestColSum1() throws IOException 
	{
		MagicSquare m = new MagicSquare("Test.txt");
		assertEquals(m.sumColumn(0), 15, 0);
	}

	/*
	 * Test that the second column sums up to 15
	 */
	@Test
	public void TestColSum2() throws IOException 
	{
		MagicSquare m = new MagicSquare("Test.txt");
		assertEquals(m.sumColumn(1), 15, 0);
	}
	
	/*
	 * Test that the first row sums up to 15
	 */
	@Test
	public void TestRowSum1() throws IOException 
	{
		MagicSquare m = new MagicSquare("Test.txt");
		assertEquals(m.sumRow(0), 15, 0);
	}
	
	/*
	 * Test that the second row sums up to 15
	 */
	@Test
	public void TestRowSum2() throws IOException 
	{
		MagicSquare m = new MagicSquare("Test.txt");
		assertEquals(m.sumRow(1), 15, 0);
	}
	
	/*
	 * Check if it is a magic square or not
	 */
	@Test
	public void CheckMagicSquare() throws IOException 
	{
		MagicSquare m = new MagicSquare("Test.txt");
		assertEquals(m.isMagic(), true);
	}
}
