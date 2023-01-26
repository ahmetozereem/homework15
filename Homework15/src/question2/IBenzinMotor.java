package question2;

public interface IBenzinMotor extends IOptional{
	
	public double motor(double m);
	
	public static void enjeksiyon () {
		System.out.println("Enjeksiyon mevcut");
	};
	
	public  int yakitDeposu();

}
