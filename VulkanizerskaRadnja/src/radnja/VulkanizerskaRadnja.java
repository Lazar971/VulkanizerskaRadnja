package radnja;

import java.util.LinkedList;
import guma.AutoGuma;
/**
 * Radnja za automobilske gume
 * @author Lazar Milosavljeviæ
 *
 */
public class VulkanizerskaRadnja {
	/**
	 * Lista guma koja se nalaze u radnji
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();
	/**
	 * Dodaje gumu na pocetak liste
	 * @param a guma koja se dodaje
	 * @throws NullPointerException 
	 * @throws RuntimeException
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}
	/**
	 * Pronalazi sve gume koje su odredjene marke i vraca ih u vidu liste
	 * @param markaModel Marka i model gume koje se traze
	 * @return lista guma date marke i modela
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).equals(markaModel))
				novaLista.add(gume.get(i));
		return novaLista;
	}
}
