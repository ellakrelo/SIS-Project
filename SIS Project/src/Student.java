
public class Student 
{
	private String firstName;
	private String lastName;
	private double gpa;
	private String firstClass;
	private String firstGrade;
	private String secondClass;
	private String secondGrade;
	private String thirdClass;
	private String thirdGrade;
	
		public Student(String fN, String lN, double g, String fC, String fG, String sC, String sG, String tC, String tG)
		{
			firstName = fN;
			lastName = lN;
			gpa = g;
			firstClass = fC;
			firstGrade = fG;
			secondClass = sC;
			secondGrade = sG;
			thirdClass = tC;
			thirdGrade = tG;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String fN) {
			this.firstName = fN;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lN) {
			this.lastName = lN;
		}

		public double getGpa() {
			return gpa;
		}

		public void setGpa(double g) {
			this.gpa = g;
		}

		public String getFirstClass() {
			return firstClass;
		}

		public void setFirstClass(String fC) {
			this.firstClass = fC;
		}

		public String getFirstGrade() {
			return firstGrade;
		}

		public void setFirstGrade(String fG) {
			this.firstGrade = fG;
		}

		public String getSecondClass() {
			return secondClass;
		}

		public void setSecondClass(String sC) {
			this.secondClass = sC;
		}

		public String getSecondGrade() {
			return secondGrade;
		}

		public void setSecondGrade(String sG) {
			this.secondGrade = sG;
		}

		public String getThirdClass() {
			return thirdClass;
		}

		public void setThirdClass(String tC) {
			this.thirdClass = tC;
		}

		public String getThirdGrade() {
			return thirdGrade;
		}

		public void setThirdGrade(String tG) {
			this.thirdGrade = tG;
		}
		
}
