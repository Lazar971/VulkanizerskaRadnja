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
	 * postavlja vrednost atributa markaModel na vrednost parametra. Baca izuzetak ako se prosledi null ili String duzine manje od 3
	 * @param markaModel 
	 * @throws RuntimeException
	 */
	public void setMarkaModel(String markaModel) {
	if (markaModel==null || markaModel.length()<3)
	throw new RuntimeException("Morate uneti marku i model");
	this.markaModel = markaModel;
	}
	
	/**
	 * getter za precnik gume
	 * @return precnik
	 */
	public int getPrecnik() {
	return precnik;
	}
	/**
	 * postavlja vrednost atributa precnik na vrednost parametra. Baca izuzetak ako je parametar izvan opsega 
	 * 
	 * @param precnik
	 *  @throws RuntimeException
	 */
	public void setPrecnik(int precnik) {
	if (precnik < 13 || precnik > 22)
	throw new RuntimeException("Precnik van opsega");
	this.precnik = precnik;
	}
	

	/**
	 * getter za sirinu gume
	 * @return sirina
	 */
	public int getSirina() {
	return sirina;
	}
	/**
	 * postavlja vrednost atributa sirina na vrednost parametra. Baca izuzetak ako je parametar izvan opsega
	 * 
	 * @param sirina
	 *  @throws RuntimeException
	 */
	public void setSirina(int sirina) {
	if (sirina < 135 || sirina > 355)
	throw new RuntimeException("Sirina van opsega");
	this.sirina = sirina;
	}
	
	/**
	 * getter za visinu gume
	 * @return visina 
	 */
	public int getVisina() {
	return visina;
	}
	

	/**
	 * postavlja vrednost atributa visina na vrednost parametra. Baca izuzetak ako je parametar izvan opsega
	 * @param visina
	 *  @throws RuntimeException
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
	 * @return <i>true</i> ako su svi atributi identicni, a <i>false</i> u suprotnom.
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
