package overriding;

public class BaseKrediManager {
	
	public /*final*/ double hesapla(double tutar) { 
		//e�er bu kodun override edildi�i yer varsa final kodu ile engelleyebiliyoruz.
		
		return tutar*1.18;
	}
	
}
