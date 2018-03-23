package guma;
/**
 * Klasa AutoGuma predstavlja jednu gumu na automobila
 * @author Lazar Milosavljeviæ
 * @version 1.0
 */
public class AutoGuma {
	/**
	 * marka i model automobila za koji je guma
	 */
	private String markaModel = null;
	/**
	 * precnik gume
	 */
	private int precnik = 0;
	/**
	 * sirina gume
	 */
	private int sirina = 0;
	/**
	 * visina gume
	 */
	private int visina = 0;
	/**
	 * getter za marku i model 
	 * @return 	markaModel
	 */
	public String getMarkaModel() {
	return markaModel;
	}
	/**
	 * postavlja vrednost atributa markaModel na vrednost parametra.
	 * @param markaModel marka i model koji se postavljaju za AutoGumu
	 * @throws RuntimeException ako je markaModel null ili je njegova duzina manja od 3
	 */
	public void setMarkaModel(String markaModel) {
	if (markaModel==null || markaModel.length()<3)
	throw new RuntimeException("Morate uneti marku i model");
	this.markaModel = markaModel;
	}
	
	/**
	 * getter za precnik gume
	 * @return precnik AutoGume
	 */
	public int getPrecnik() {
	return precnik;
	}
	/**
	 * postavlja vrednost atributa precnik na vrednost parametra.  
	 * 
	 * @param precnik koji se postavlja za gumu
	 * @throws RuntimeException ako je precnik manji od 13 ili veci od 22
	 */
	public void setPrecnik(int precnik) {
	if (precnik < 13 || precnik > 22)
	throw new RuntimeException("Precnik van opsega");
	this.precnik = precnik;
	}
	

	/**
	 * getter za sirinu gume
	 * @return sirina AutoGume
	 */
	public int getSirina() {
	return sirina;
	}
	/**
	 * postavlja vrednost atributa sirina na vrednost parametra.
	 * 
	 * @param sirina koja se postavlja za gumu
	 *  @throws RuntimeException ako je sirina manja od 135 ili veca od 355
	 */
	public void setSirina(int sirina) {
	if (sirina < 135 || sirina > 355)
	throw new RuntimeException("Sirina van opsega");
	this.sirina = sirina;
	}
	
	/**
	 * getter za visinu gume
	 * @return visina AutoGume
	 */
	public int getVisina() {
	return visina;
	}
	

	/**
	 * postavlja vrednost atributa visina na vrednost parametra. 
	 * @param visina koja se postavlja za gumu
	 *  @throws RuntimeException ako je visina manja od 25 ili veca od 95
	 */
	public void setVisina(int visina) {
	if (visina < 25 || visina > 95)
	throw new RuntimeException("Visina van opsega");
	this.visina = visina;
	}
	@Override
	

	/**
	 * redefinisana metoda toString iz klase Object
	 * 
	 * @return spoj imena klase i svih njenih atributa
	 */
	public String toString() {
	return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik +
	", sirina=" + sirina + ", visina=" + visina + "]";
	}
	
	/**
	 * Redefinisana metoda equals iz klase Object. Uporedjuje dva objekta iz klase AutoGuma po svim parametrima.
	 * @return <i>true</i> ako su svi atributi identicni,  <i>false</i> u suprotnom.
	 */
	@Override
	public boolean equals(Object obj) {
	if (this == obj)
	return true;
	if (obj == null)
	return false;
	if (getClass() != obj.getClass())
	return false;
	AutoGuma other = (AutoGuma) obj;
	if (markaModel == null) {
	if (other.markaModel != null)
	return false;
	} else if (!markaModel.equals(other.markaModel))
	return false;
	if (precnik != other.precnik)
	return false;
	if (sirina != other.sirina)
	return false;
	if (visina != other.visina)
	return false;
	return true;
	}

}
