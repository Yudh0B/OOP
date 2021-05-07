class array{
   public static void main(String[] args){
   /* membuat larik : tipe data berkelompok sejenis
   - 1 dimensi
   - 2 dimensi
   - multi dimensi
   */
   
   //mendeklarasikan larik 1 dimensi
   int[] larik={0,1,2,3,4,5,6,7,8,9};
   
   //mendeklarasikan larik 2 dimensi
   int[][] larik2={{10,20,30,40,50},{60,70,80,90,100}};
   
   //mengakses langsung dengan indeks
   System.out.println("larik2 baris pertama kolom pertama ="+larik2[0][0]);
   System.out.println("larik2 baris kedua kolom kelima ="+larik2[1][4]);
   
   for (int baris=0; baris<2; baris++){
	   for (int kolom=0; kolom<5; kolom++) {
		   System.out.println(" "+larik2[baris][kolom]);
	   }
	   System.out.println(); //ganti baris
   }
   
   //menjumlahkan matriks
   int[][] larik2b={{11,21,31,41,51},{61,71,81,91,101}};
   int[][] larik2c={{0,0,0,0,0},{0,0,0,0,0}};
   for (int baris=0; baris<2; baris++){
	   for (int kolom=0; kolom<5; kolom++) {
   larik2c[baris][kolom] = larik2b[baris][kolom] + larik2[baris][kolom];
   System.out.print(larik2c[baris][kolom] + "\t");
      }
      System.out.println();
   }
   
   }
}