public class Main {
	public static void main(String[] args) {
		//Kodlama.io sitesindeki 2 özellik nesnesi
		//1-Eðitmen Bilgileri
		//2-Kurs Bilgileri
		
		EgitmenBilgileri egitmen1=new EgitmenBilgileri("Engin","Demiroð",1,3);
		EgitmenBilgileri egitmen2=new EgitmenBilgileri("Murat","Yücedað",2,3);
		
		KursBilgileri kurs1=new KursBilgileri("JAVA + REACT",1);
		KursBilgileri kurs2=new KursBilgileri("C# + ANGULAR",1);

		EgitmenBilgileri [] egitmenler = new EgitmenBilgileri[] {egitmen1,egitmen2};
		KursBilgileri [] kurslar =new KursBilgileri[] {kurs1,kurs2};
		for(EgitmenBilgileri egitmen : egitmenler) {
			System.out.println("Eðitmen Adý: "+egitmen.getFirstName());
			System.out.println("Eðitmen Soyadý: "+egitmen.getLastName());
			System.out.println("Eðitmen Numarasý: "+egitmen.getInstructorNumber());
			System.out.println("Eðitmenin Toplam Kurs Sayýsý: "+egitmen.getNumberOfLessons());
		}
		
		for(KursBilgileri kurs:kurslar) {
			System.out.println("Kurs Adý: "+kurs.getCourseName());
			System.out.println("Kursu Veren Eðitmenin Numarasý: "+kurs.getInstructorNumber());
		}
	}
}
