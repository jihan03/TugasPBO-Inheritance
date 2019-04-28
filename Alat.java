 
public class Alat { 
	 String Nama;
	 String Jenis;
	 
	   public void setNama (String NamaAlat) { 
				   this.Nama = NamaAlat;
				   System.out.println (" Nama Alat : " +Nama);
		} 
		
		 public void Jenis (String JenisAlat) { 
					 this.Jenis = JenisAlat;
					 System.out.println (" Jenis Alat : " +Jenis);
		} 
		
		public String getNama() { 
		return Nama;
		} 
		
		public String getJenis() { 
		return Jenis;
		} 
}
