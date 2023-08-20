package practice;

public class Sub {
	private int usn;
	private char sec;
	private String name;
	private int age;
	private String Adress;
	public int getUsn() {
		return usn;
	}
	public void setUsn(int usn) {
		System.out.println("Student USN:      "+usn);
		this.usn = usn;
	}
	public char getSec() {

		return sec;
	}
	public void setSec(char sec) {
		System.out.println("Student section:  "+sec);
		this.sec = sec;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Student name:     "+name);
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("Student age:      "+age);
		this.age = age;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		System.out.println("Student Adress:   "+adress);
		this.Adress = adress;
	}

}
