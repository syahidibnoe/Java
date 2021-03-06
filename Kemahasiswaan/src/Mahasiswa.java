public class Mahasiswa 
{
	/*
	 * TODO nim masih berupa String, perlu diubbah menjadi integer. 
	 * Berupa XX.YYYY dimana X = angkatan dan Y = nomor mahasiswa
	 */
	private String namaMahasiswa;
	private String nim;
	private enumJenisKelamin jenisKelamin;
	
	public Mahasiswa(String namaMahasiswa, String nim, enumJenisKelamin jenisKelamin)
	{
		this.namaMahasiswa = namaMahasiswa;
		this.nim = nim;
		this.jenisKelamin = jenisKelamin;
	}
	public Mahasiswa()
	{
		this.namaMahasiswa = "Undefined.";
		this.nim = "Undefined.";
		this.jenisKelamin = enumJenisKelamin.LAKILAKI;
	}
	
	public static Mahasiswa newMahasiswa(String namaMahasiswa, String nim, enumJenisKelamin jenisKelamin)
	{
		return new Mahasiswa(namaMahasiswa, nim, jenisKelamin);
	}
	
	public String getMahasiswa()
	{
		return this.namaMahasiswa + this.nim + this.jenisKelamin.toString();
	}
	
	public void setMahasiswa(String namaMahasiswa, String nim, enumJenisKelamin jenisKelamin)
	{
		this.namaMahasiswa = namaMahasiswa;
		this.nim = nim;
		this.jenisKelamin = jenisKelamin;
	}
	
	public String getNamaMahasiswa()
	{
		return namaMahasiswa;
	}

	public void setNamaMahasiswa(String namaMahasiswa)
	{
		this.namaMahasiswa = namaMahasiswa;
	}

	public String getNim()
	{
		return nim;
	}

	public void setNim(String nim)
	{
		this.nim = nim;
	}

	public enumJenisKelamin getJenisKelamin()
	{
		return jenisKelamin;
	}

	public void setJenisKelamin(enumJenisKelamin jenisKelamin)
	{
		this.jenisKelamin = jenisKelamin;
	}
}
