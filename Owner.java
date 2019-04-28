package AlatMusik;

public class Owner extends Alat { 

	String Pemilik;
	
	public void Pemilik (String PemilikAlat) { 
			this.Pemilik = PemilikAlat;
			System.out.println (" Nama Pemilik : " +Pemilik);
		} 
	public String getPemilik() { 
	return Pemilik;
	}
	
	}
		