package question2;

public interface IStandartOzellikler extends IOptional{
	
	public default int  tekerlekSayisi () {
		return 4;
	}
	public default boolean absFrenSistemi () {
		return true;
	}

	public default boolean koltukDoseme (){
		return true;
	}
	public default int bagajHacmi () {
		return 50;}
	
	public default boolean iklimlendirme (){
		return 	true;}

}
