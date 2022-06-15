
public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Sabiha Gökçen Havalimanına Hoşgeldiniz...");
		
		String sartlar = "YurtDışı Çıkış Kuralları\n"
				       + "Herhangi bir siyasi yasağınız Bulunmaması Gerekiyor...\n"
				       + "15 tl harç bedelinizi tam olarak yatırmanız gerekiyor..\n"
				       + "Gideceğiniz Ülkeye Vizenizin Bulunması Gerekiyor..\n" ;
		String mesaj = "Yurdışı Şartlarından Hepsini Sağlamanız Gerekiyor";
		
		 while(true) {
			 
			 System.out.println("*****************************************");
			
			 System.out.println("*****************************************");
			 System.out.println(sartlar);
			 
			 Yolcu yolcu = new Yolcu();
			 System.out.println("Harç Bedeli Kontrol Ediliyor...");
			 Thread.sleep(3000);
			
			 if(yolcu.yurtdısı_harcı() == true) {
				 System.out.println(mesaj);
				 continue ;
				 
			 }
			 System.out.println("Siyasi yasak Kontrol ediliyor...");
			 Thread.sleep(3000);
			 if(yolcu.sıyası_yasak() == false) {
				 System.out.println(mesaj);
				 continue ;
			 }
			 System.out.println("Vize Durumu Kontrol Ediliyor...");
			 Thread.sleep(3000);
			 if(yolcu.vıze_durumu() == false) {
				 	System.out.println(mesaj);
				 	continue ;
				 	
			 }
			 System.out.println("İşlemleriniz tamam yurtdışına Çıkabilirsiz..");
			 break ;
			 
		 }
				       
		
		
		
	}
}
