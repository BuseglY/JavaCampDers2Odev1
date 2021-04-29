public class Main {
	public static void main(String[] args) {
		//Kodlama.io sitesindeki 2 �zellik nesnesi
		//1-E�itmen Bilgileri
		//2-Kurs Bilgileri
		
		EgitmenBilgileri egitmen1=new EgitmenBilgileri("Engin","Demiro�",1,3);
		EgitmenBilgileri egitmen2=new EgitmenBilgileri("Murat","Y�ceda�",2,3);
		
		KursBilgileri kurs1=new KursBilgileri("JAVA + REACT",1);
		KursBilgileri kurs2=new KursBilgileri("C# + ANGULAR",1);

		EgitmenBilgileri [] egitmenler = new EgitmenBilgileri[] {egitmen1,egitmen2};
		KursBilgileri [] kurslar =new KursBilgileri[] {kurs1,kurs2};
		for(EgitmenBilgileri egitmen : egitmenler) {
			System.out.println("E�itmen Ad�: "+egitmen.getFirstName());
			System.out.println("E�itmen Soyad�: "+egitmen.getLastName());
			System.out.println("E�itmen Numaras�: "+egitmen.getInstructorNumber());
			System.out.println("E�itmenin Toplam Kurs Say�s�: "+egitmen.getNumberOfLessons());
		}
		
		for(KursBilgileri kurs:kurslar) {
			System.out.println("Kurs Ad�: "+kurs.getCourseName());
			System.out.println("Kursu Veren E�itmenin Numaras�: "+kurs.getInstructorNumber());
		}
	}
}
