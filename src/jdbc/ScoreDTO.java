package jdbc;

public class ScoreDTO {
	private String student_no;
	private String name;
	private int kor;
	private int eng;
	private int tot;
	private double avg;

//	우클릭 > Source > Generate getters & setters
	public String getStudent_no() {
		return student_no;
	}

	public void setStudent_no(String student_no) {
		this.student_no = student_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

//	우클릭 > Source > Generate toString()
	@Override
	public String toString() {
		return "ScoreDTO [student_no=" + student_no + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", tot="
				+ tot + ", avg=" + avg + "]";
	}

//	ctrl + space > Constructor (기본생성자)
	public ScoreDTO() {	} 

//	Generate Constructor using Fields
	public ScoreDTO(String student_no, String name, int kor, int eng, int tot, double avg) {
		this.student_no = student_no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.tot = tot;
		this.avg = avg;
	}
}