package hr.biljeznica.model;

public class NovaBiljeskaForm {
	
	private Korisnik korisnik;
	private Biljeznica biljeznica;
	private String naslovBiljeske;
	private String text;
	
	public NovaBiljeskaForm()
	{
		
	}
	
	
	public Korisnik getKorisnik() {
		return korisnik;
	}

	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}

	public Biljeznica getBiljeznica() {
		return biljeznica;
	}

	public void setBiljeznica(Biljeznica biljeznica) {
		this.biljeznica = biljeznica;
	}

	public String getNaslovBiljeske() {
		return naslovBiljeske;
	}
	
	public void setNaslovBiljeske(String naslovBiljeske) {
		this.naslovBiljeske = naslovBiljeske;
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
}
