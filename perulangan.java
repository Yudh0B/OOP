class perulangan {
     public static void main(String[] args){
	 /*Looping
	 for (indeksbawah; indeksatas; kenaikan){
	     //pernyataan
     }
	 
	 while..
	 */
	 
	 //contoh 
	 for (int i=0; i<10; i++){
	   System.out.println("Teknik Elektro - cetak ke-"+i);
	 }
	 
	 //untuk tipe larik data={10,20,30,40,50}
	 int[] data={10,20,30,40,50};
	 for (int i=0; i<5; i++){
	   System.out.println("data ke-"+i+" = "+data[i]);
	 }
	 
	 //mencetak tulisan pakai while
	 int j = 0;
	 while (j<10){
		 System.out.println("Universitas Diponegoro");
		 j++;
	 }
	 
	 int k=0;
	 do {
		 System.out.println("Semarang ke-" +k);
		 k++;
	 }
	 while(k<10);
	 }
	 
	 //menampilkan data[] dengan while
	 int i=0;
	 while (i<5) {
		 System.out.println("data ke-"+i+" = "+data[i]);
		 i++;
	 }
}//akhir fungsi main
}//akhir class
	 