import java.lang.Math;
public class SpecialMatrix {
	int dim;
	int[][] matrix; 
	SpecialMatrix(int dim)
	{
		this.dim = dim;
		matrix = new int[dim][dim];
	}
	
	void createSpecialMatrix()
	{
		int preocnt = dim;
		for(int i = 0; i<dim; i++)
		{
			int ocnt = (int)(Math.random() * (preocnt+1));
			int zcnt = dim - ocnt;
			for(int j = 0; j<ocnt; j++)
					matrix[i][j] = 1;
			preocnt = ocnt;
		}		
	}
	
	int countOnes()
	{
		int cnt = 0;
		for(int i=0; i<Math.pow(dim, 2); i++)
		{
			if(matrix[i/dim][i%dim] == 1)
				cnt++;
		}		
		return cnt;
	}
		
	public static void main(String[] args) {
		SpecialMatrix obj = new SpecialMatrix(10);
		obj.createSpecialMatrix();
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<10; j++)
				System.out.print(obj.matrix[i][j] + " ");
			System.out.println();
		}
		System.out.println("Count of ones: " + obj.countOnes());
	}
}
