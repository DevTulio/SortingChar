public class sorting{
	public static void main(String[] args){
		char[][] arrayChar={{'E','D','G','A','R'},{'J','A','Y','M','A','R','K'},{'M','A','R','L','A'},{'R','H','A','Y','N','E','L'}
	};

		sort(arrayChar);

		for(int i=0;i<arrayChar.length;i++){
				for (int j=0;j<arrayChar[i].length ;j++ ) {
					System.out.print(arrayChar[i][j]);
				}
				System.out.println();
		}
		
		showCoder();
	}

	static char[][] sort(char[][] array){
		char[] temp;
			for(int i=0;i<array.length;i++){
					for(int j=i;j>=1;j--){
						if(array[j][0]>array[j-1][0]){
							temp=array[j];
							array[j]=array[j-1];
							array[j-1]=temp;
						}
					}
			}
			return array;
	}

	static void showCoder(){
		char a=1;
		System.out.println("\n\n\n\n");
		for(int i=0;i<8;i++){
			for(int j=0;j<15;j++){
				if(i==7||i==0 || j==0 || j==14){
					System.out.print("- ");
				}
				else if(i==2 && j==2)
				{
					System.out.print("Coded by: DevTulio "+a+"  ");
				}



				else{
					System.out.print("  ");
				}

				if(i==2 && j>3){
					System.out.print("\b\b");
				}
				
			}
			System.out.println();
		}

	}
}