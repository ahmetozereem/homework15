package question2;

public interface IElektrikMotor extends IOptional {
	
	public double elektrikMotor (double m);
	public static void regulator () {
		System.out.println("regulator mevcut");
	}
	public boolean aku ();

}
