import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		int n = 4, m = 1,  idiff= -1, nextDiff = 1;
		for(int i = 1; i <= n; i++)
		{
			
			idiff = idiff^nextDiff;
			nextDiff = idiff^nextDiff;
			idiff = idiff^nextDiff;
			for(int j = 0; j < n -i; j++)
			{
				System.out.print("  ");
			}
			
						
			for(int j = 0; j<n; j++)
			{
				
				System.out.print(m + " ");
				m = m + idiff;
				
			}
			m = m + n - idiff;
			
			System.out.println();
		}
		

	}

}
