public static void main(String[] args) {
		
		Scanner giris=new Scanner(System.in);
		System.out.println("matris sayısını giriniz:");
		int matris=giris.nextInt();
				
		for(int i=1;i<matris;i++) {
						
			for(int j=1;j<matris;j++) {
			
				if(i==j) {
					System.out.print(" 1 ");}
					
					else { System.out.print( " 0 ");					
				}
		}System.out.println("");
	
		}
