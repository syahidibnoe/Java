package objectBased;

public class Makan 
{
	private String makanan;
	private String lauk;
	private String minuman;
	private String warung;

	public Makan() 
	{
		
	}
	public Makan(String makanan, String lauk, String minuman, String warung) 
	{
		this.makanan = makanan;
		this.lauk = lauk;
		this.minuman = minuman;
		this.warung = warung;
	}
	public String getMakanan() 
	{
		return makanan;
	}
	public void setMakanan(String makanan) 
	{
		this.makanan = makanan;
	}
	public String getLauk() 
	{
		return lauk;
	}
	public void setLauk(String lauk) 
	{
		this.lauk = lauk;
	}
	public String getMinuman() 
	{
		return minuman;
	}
	public void setMinuman(String minuman) 
	{
		this.minuman = minuman;
	}
	public String getWarung() 
	{
		return warung;
	}
	public void setWarung(String warung) 
	{
		this.warung = warung;
	}

}
