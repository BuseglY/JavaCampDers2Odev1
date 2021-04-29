public class KursBilgileri {

	private String courseName;//özellikler
	private int instructorNumber;
	public KursBilgileri(String courseName, int instructorNumber) {
		this.courseName = courseName;
		this.instructorNumber = instructorNumber;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getInstructorNumber() {
		return instructorNumber;
	}
	public void setInstructorNumber(int instructorNumber) {
		this.instructorNumber = instructorNumber;
	}
}
