package question2;

import java.util.Scanner;

public class OtomobilOlustur implements IStandartOzellikler, IBenzinMotor, IElektrikMotor, IOtomatik, IDuz {
	
	public boolean benzin;
	public double benzinMotor;
	public int benzinYakitDeposu;
	public boolean elektrik;
	public double otoelektrikMotor;
	public boolean elektrikAku;
	public boolean otomatik;
	public boolean otoVites;
	public boolean duzVites;
	public boolean otoSunroof;
	public boolean  otoMetalikRenk;
	public boolean otoBodyKit;
	public boolean otoCelikJant;
	public boolean otoMultimedia;
	public int  otoTekerlekSayisi;
	public boolean otoAbsFrenSistemi;
	public boolean otoKoltukDoseme;
	public int otoBagajHacmi;
	public boolean otoIklimlendirme;
	
	
	
	
	
	public OtomobilOlustur(boolean benzin, double benzinMotor, int benzinYakitDeposu, boolean elektrik,
			double otoelektrikMotor, boolean elektrikAku, boolean otomatik, boolean otoVites, boolean duzVites,
			boolean otoSunroof, boolean otoMetalikRenk, boolean otoBodyKit, boolean otoCelikJant, boolean otoMultimedia,
			int otoTekerlekSayisi, boolean otoAbsFrenSistemi, boolean otoKoltukDoseme, int otoBagajHacmi,
			boolean otoIklimlendirme) {
		super();
		this.benzin = benzin;
		this.benzinMotor = benzinMotor;
		this.benzinYakitDeposu = benzinYakitDeposu;
		this.elektrik = elektrik;
		this.otoelektrikMotor = otoelektrikMotor;
		this.elektrikAku = elektrikAku;
		this.otomatik = otomatik;
		this.otoVites = otoVites;
		this.duzVites = duzVites;
		this.otoSunroof = otoSunroof;
		this.otoMetalikRenk = otoMetalikRenk;
		this.otoBodyKit = otoBodyKit;
		this.otoCelikJant = otoCelikJant;
		this.otoMultimedia = otoMultimedia;
		this.otoTekerlekSayisi = otoTekerlekSayisi;
		this.otoAbsFrenSistemi = otoAbsFrenSistemi;
		this.otoKoltukDoseme = otoKoltukDoseme;
		this.otoBagajHacmi = otoBagajHacmi;
		this.otoIklimlendirme = otoIklimlendirme;
	}


	public OtomobilOlustur() {
		super();
	}


	public boolean sunroof (String s) {
		
		if (s.toLowerCase().equals("evet")) {
			return true;
		}
		
		else {
			return false;
		}
	}
	public boolean  metalikRenk (String s) {
		
		if (s.toLowerCase().equals("evet")) {
			return true;
		}
		
		else {
			return false;
		}
	}
	public boolean bodyKit (String s) {
		
		if (s.toLowerCase().equals("evet")) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public boolean celikJant (String s){
		
		if (s.toLowerCase().equals("evet")) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public boolean multimedia (String s){
		
		if (s.toLowerCase().equals("evet")) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public boolean sedanArac (String s) {
		if (s.toLowerCase().equals("evet")) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public boolean sporArac (String s) {
		if (s.toLowerCase().equals("evet")) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	
	

	public static void main(String[] args) {
		
		OtomobilOlustur oto1 = new OtomobilOlustur ();
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Otomobiliniz elektrik motorlu mu yoksa benzin motorlu mu olsun?");
		System.out.println("Elektrikli otomobil için : elektrikli, Benzinli otomobil için: benzinli yazınız !!! ");
		
		String elkveyaBnz=scan.nextLine();
		
		if (elkveyaBnz.toLowerCase().equals("benzinli") ) {
			
			oto1.benzin = true;
			oto1.elektrik=false;
			oto1.benzinMotor=oto1.motor(2.0);
			oto1.benzinYakitDeposu=oto1.yakitDeposu();
			
			
			
		}
		
		else if (elkveyaBnz.toLowerCase().equals("elektrikli") ) {
			
			oto1.elektrik = true;
			oto1.benzin = false;
			oto1.otoelektrikMotor=oto1.elektrikMotor(2.0);
			oto1.elektrikAku=oto1.aku();
			
			
		}
		
		else {
			
			System.out.println("!!!!hatalı veri girişi !!!!!");
		}
		
		//System.out.println(oto1.benzin);
		
		System.out.println("Otomobiliniz Otomatik vitesli mi yoksa duz vitesli mi olsun?");
		System.out.println("otomatik vites için : otomatik, Düz vites için: duz yazınız !!! ");
		
		String otoveyaDuz=scan.nextLine();
		
		if (otoveyaDuz.toLowerCase().equals("otomatik") ) {
			
			oto1.otomatik=oto1.otoSanziman();
			oto1.duzVites=false;
			
						
		}
		
		else if (otoveyaDuz.toLowerCase().equals("duz") ) {
			
			oto1.otomatik=false;
			oto1.duzVites=oto1.duzSanziman();
			
			
		}
		
		else {
			
			System.out.println("!!!!hatalı veri girişi !!!!!");
		}
		
		System.out.println("otomatik sunroof isterseniz evet, istemezseniz hayir yazınız !!! ");
		
		String sunRoof = scan.nextLine();
		
		oto1.otoSunroof=oto1.sunroof(sunRoof );
		
		System.out.println("otomobili metalik renkte isterseniz evet, istemezseniz hayir yazınız !!! ");
		
		String renk = scan.nextLine();
		
		oto1.otoMetalikRenk=oto1.metalikRenk (renk);
		
		System.out.println("otomobilde bodykit isterseniz evet, istemezseniz hayir yazınız !!! ");
		
		String kit = scan.nextLine();
		
		oto1.otoBodyKit=oto1.bodyKit(kit);
		
		System.out.println("otomobilde çelik jant isterseniz evet, istemezseniz hayir yazınız !!! ");
		
		String jant = scan.nextLine();
		
		oto1.otoCelikJant=oto1.celikJant(jant);
		
		System.out.println("otomobilde multimedia isterseniz evet, istemezseniz hayir yazınız !!! ");
		
		String multi = scan.nextLine();
		
		oto1.otoMultimedia=oto1.multimedia(multi);
		
		oto1.otoTekerlekSayisi=oto1.tekerlekSayisi();
		oto1.otoAbsFrenSistemi=oto1.absFrenSistemi();
		oto1.otoKoltukDoseme= oto1.koltukDoseme();
		oto1.otoBagajHacmi= oto1.bagajHacmi();
		oto1.otoIklimlendirme= oto1.iklimlendirme();
		
		
		System.out.println("Benzin: "+ oto1.benzin+" elektrik: " + oto1.elektrik+" otomatik:  "+oto1.otomatik+" sunroof: "+  oto1.otoSunroof+" metalik renk: "+oto1.otoMetalikRenk+
				
				" Bodykit: "+oto1.otoBodyKit+ " celik jant: " +oto1.otoCelikJant);
		

	}


	@Override
	public boolean duzSanziman() {
		
		return true;
	}


	@Override
	public boolean otoSanziman() {
		
		return true;
	}


	@Override
	public double elektrikMotor(double m) {
		
		return m;
	}


	@Override
	public boolean aku() {
		
		return true;
	}


	@Override
	public double motor(double m) {
		
		return 2;
	}


	@Override
	public int yakitDeposu() {
		
		return 50;
	}

}
