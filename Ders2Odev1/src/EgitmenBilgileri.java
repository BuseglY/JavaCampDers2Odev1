public class EgitmenBilgileri {
	private String firstName;//�zellikler
	private String lastName;
	private int instructorNumber;//e�itmen numaras�
	private int numberOfLessons;//ders say�s�
	//cunstroctor
	public EgitmenBilgileri(String firstName, String lastName, int instructorNumber, int numberOfLessons) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.instructorNumber = instructorNumber;
		this.numberOfLessons = numberOfLessons;
	}
	public String getFirstName() {//getters & setters
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getInstructorNumber() {
		return instructorNumber;
	}
	public void setInstructorNumber(int instructorNumber) {
		this.instructorNumber = instructorNumber;
	}
	public int getNumberOfLessons() {
		return numberOfLessons;
	}
	public void setCourseNumber(int numberOfLessons) {
		this.numberOfLessons = numberOfLessons;
	}
}
