public class Tampilan { 
public static void main(String []args) { 

	Alat ala = new Alat();
	Owner own = new Owner();
	
	ala.Nama = " Gitar ";
	ala.Jenis = " Dipetik ";
	own.Pemilik = " Sharon ";
	
	System.out.println("Nama Alat : " +ala.Nama);
	System.out.println("Jenis Alat : " +ala.Jenis);
	System.out.println("Pemilik : " +ala.Pemilik);
	
	} 
}
	
	
	