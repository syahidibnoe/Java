
public class Dosen extends Mahasiswa 
{
	private String nip;
	
	Dosen() 
	{
		this.nip = "Belum ada.";
		// TODO Auto-generated constructor stub
	}
	Dosen(String nip, String namaDepan)
	{
		this.setNamaDepan(namaDepan);
		this.nip = nip;
	}
	public String getNip()
	{
		return this.nip;
	}
	public void setNip(String nip)
	{
		this.nip = nip;
	}
	public Dosen getDosen()
	{
		return this;
	}
}
