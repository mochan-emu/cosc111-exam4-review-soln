
import java.io.*;

public class MagicSquare 
{
	// Matrix where we will store the magic squares
	Matrix M;
	
	// Fill up the magic square from the data in the file
	public MagicSquare(String filename) throws IOException
	{
		// Open the file
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        
        // Read a row of text
        String line;
        int i = 0;
        while ((line = reader.readLine()) != null) 
        {
        	// Split the text by tab
            String[] parts = line.split("\t");
            
            // Create the matrix if we haven't from the number of parts
            if (M == null)
            {
            	M = new Matrix(parts.length, parts.length);
            }
            
            // Set the matrix from the line
            for (int j=0; j<parts.length; j++)
            {
            	double value = Double.parseDouble(parts[j]);
                M.setMatrixValue(i, j, value);
            }
            
            // Increment the line number
            i++;
        }
        
        reader.close();
	}
	
	// Get the sum of the j-th column
	public double sumColumn(int j)
	{
		// This is where we will store the sum
		double sum = 0;
		
		// Get the size of the matrix
		int[] matrix_size = M.getSize();
		int m = matrix_size[0];
		int n = matrix_size[1];
		
		// Iterate over the column of the matrix
		for (int i=0; i<m; i++)
		{
			sum += M.getMatrixValue(i, j);
		}
		return sum;
	}
	
	// Get the sum of the i-th row
	public double sumRow(int i)
	{
		// This is where we will store the sum
		double sum = 0;
		
		// Get the size of the matrix
		int[] matrix_size = M.getSize();
		int m = matrix_size[0];
		int n = matrix_size[1];
		
		// Iterate over the column of the matrix
		for (int j=0; j<n; j++)
		{
			sum += M.getMatrixValue(i, j);
		}
		return sum;
	}
	
	// Check if this is a magic square or not
	public boolean isMagic()
	{
		// Get the size of the matrix
		int[] matrix_size = M.getSize();
		int m = matrix_size[0];
		int n = matrix_size[1];
		
		// We will use row 0 as the reference to make sure all rows and columns
		// have the same value
		double sum = sumRow(0);
		
		// Check all the rows
		for (int i=0; i<m; i++)
		{
			if (sumRow(i) != sum)
				return false;
		}
		
		// Check all the columns
		for (int j=0; j<n; j++)
		{
			if (sumColumn(j) != sum)
				return false;
		}
		
		// All the sum of rows and columns are equal
		return true;
	}
	
	// String representation which is just the matrix representation
	public String toString()
	{
		return M.toString();
	}
}
