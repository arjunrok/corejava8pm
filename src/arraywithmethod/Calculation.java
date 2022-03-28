package arraywithmethod;

public class Calculation {
	
	public static void main(String[] args) {
		
		int mat1[][] = {{10,30,70},{90,40,77},{44,55,66}};
		int mat2[][] = {{2,5,7},{7,9,8},{4,5,9}};
		
		int mat3[][] = new int[3][3];
		
		//addition
		for(int i=0; i<3;i++) {
			
			for(int j=0; j<3; j++) {
				
				mat3[i][j] = mat1[i][j] + mat2[i][j];
				System.out.print(mat3[i][j]+" ");
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}

}
