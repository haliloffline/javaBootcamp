package abstractClasses;

public abstract class GameCalculator {
	
	public abstract void hesapla();
	//oluþturulan methodu her class kendi þartlarýna göre abs ettirsin her þartýný kendine göre belirlesin amacýyla kullanýlýr normal bir class gibi "new"lenemez
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
	
}
