package loops;

public class PatternINEURON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 7;
		for(int i = 0 ;i<n;i++) {
			
			//TO PRINT I
			for(int j= 0 ;j<n;j++) {
				
				if((i==0&&j<=(3*n)/4)||(i==(n-1)&&j<=(3*n)/4)||(j==(n)/2)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			//TO PRINT N
				for(int j= 0 ;j<n;j++) {
				
				if(j==0||i==j||j==n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
				
			//TO PRINT E
				for(int j= 0 ;j<n;j++) {
					
					if(j==n/4||(i==0&&j>=n/4)||(i==(n-1)/2&&j>=n/4)||(i==(n-1)&&j>=n/4)) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				
				//TO PRINT U
					for(int j=0;j<n;j++) {
					
					if((j==n/4&&i<(n-1))||(j==(3*n)/4&&i<(n-1))||
							(i==(n-1)&&j>n/4&&j<(3*n)/4)) {
						
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
					
				// TO PRINT R
					for(int j= 0 ;j<n;j++) {
						
						if(j==0||(i==0&&j<(n-1)/2)||(j==(n-1)/2&&i<=(n-1)/2)||
								(i==(n-1)/2&&j<(n-1)/2)||(i-j==(n-1)/2)) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						}
					}
					
				//TO PRINT O
					for(int j=0;j<n;j++) {
						
				
						if((i==0&&j>0&j<(3*n)/4)||(j==0&&i>0&&i<(n-1))||(j==(3*n)/4&&i>0&&i<(n-1))||
								(i==(n-1)&&j>0&&j<(3*n)/4)) {
							
							System.out.print("*");
						}else {
							
							System.out.print(" ");
						}
					}
					
					// TO PRINT N
					
					for(int j= 0 ;j<n;j++) {
						
						if(j==0||i==j||j==n-1) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						}
					}
				System.out.println();
		}
	}

}
