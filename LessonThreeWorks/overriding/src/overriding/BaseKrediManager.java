package overriding;

public class BaseKrediManager {
	
	public /*final*/ double hesapla(double tutar) { 
		//eðer bu kodun override edildiði yer varsa final kodu ile engelleyebiliyoruz.
		
		return tutar*1.18;
	}
	
}
