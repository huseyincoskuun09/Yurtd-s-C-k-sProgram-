import java.util.Scanner;

public class Yolcu implements YurtdısıKuralları {

	private int harc_kontrol ;
	private boolean sıyası_yasak_kontrol ;
	private boolean vıze_durumu_kontrol;
	
	public Yolcu() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Yatırdığınız Harç Bedeli : " );
		this.harc_kontrol= scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Herhangi bir Siyasi Yasağınız Bulunuyor mu ? :");
		
		String cevap = scanner.nextLine();
		 
		if(cevap.equals("evet")) {
			this.sıyası_yasak_kontrol = true ;
		}
		else if(cevap.equals("hayır")) {
			
			this.sıyası_yasak_kontrol=false ;
			
			
		}
		else {
			System.out.println("Yanlış cevap Verdiniz... ");
		}
		System.out.println("Vizeniz Bulunuyor mU ? ");
		String cevap2 = scanner.nextLine();
		
		if(cevap2.equals("evet")) {
			this.vıze_durumu_kontrol = true ;
		}
		else {
			this.vıze_durumu_kontrol = false ;
		}
		
	}
	
	
	@Override
	public boolean yurtdısı_harcı() {
		if(this.harc_kontrol<15) {
			System.out.println("Lütfen yurtdışı çıkış harcını tam yatırın...");
			return false ;
			
		}
		else {
			System.out.println("Yurtdışı harç işlemi tamam . ");
			return true ;
			
		}
		
		
	}
	@Override
	public boolean sıyası_yasak() {
		
		if(this.sıyası_yasak_kontrol == true) {
			System.out.println("Siyasi Yasağınız Bulunuyor...");
			return false ;
		}
		else {
			System.out.println("Herhangi bir yurtdışı için siyasi engeliniz yok ..");
			return true ;
		}
		
	}
	@Override
	public boolean vıze_durumu() {
		if(this.vıze_durumu_kontrol == true) {
			System.out.println("Vizeniz bulunduğu için ülkeye giriş yapabilirsiniz..");
			return true ;
			
		}
		else {
			System.out.println("Vizeniz yok .Bu yüzden ülkeye giriş yapamassınız..");
			return false ;
			
		}
		
			
		
		
	}
	
	
	
	
}
