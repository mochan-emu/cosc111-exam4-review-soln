import static org.junit.Assert.*;

import org.junit.Test;

public class MatrixTest 
{
	/*
	 * Check that the matrix sets and gets the values correctly
	 */
	@Test
	public void MatrixSetAndGet() 
	{
		Matrix m = new Matrix(10,10);
		final double val = 123.456;
		m.setMatrixValue(5, 5, val);
		assertEquals(val, m.getMatrixValue(5, 5), 0);
	}

}
