package abstractClasses;

public abstract class GameCalculator {
	
	public abstract void hesapla();
	//olu�turulan methodu her class kendi �artlar�na g�re abs ettirsin her �art�n� kendine g�re belirlesin amac�yla kullan�l�r normal bir class gibi "new"lenemez
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
	
}
