package hr.biljeznica.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="biljeznica")
public class Biljeznica implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="naziv")
	private String naziv;
	
	@Column(name="opis")
	private String opisSadrzaja;
	
	public Biljeznica()
	{
		
	}
	
	public Biljeznica(String naziv, String opisSadrzaja)
	{
		this.opisSadrzaja = opisSadrzaja;
		this.naziv = naziv;
	}
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getOpisSadrzaja() {
		return opisSadrzaja;
	}
	public void setOpisSadrzaja(String opisSadrzaja) {
		this.opisSadrzaja = opisSadrzaja;
	}
	
	public String toString()
	{
		return this.getNaziv();
	}
}
