package by.pvt.ilya.abiturient;
/**
 * this class serves for input of information about entrants 
 * @author Ilya
 *
 */ 

public class Abiturient {
	private int id = 0;
	private String name = null;
	private String suname = null;
	private int score = 0;
	private int phone_number = 0;

	public Abiturient(int id, String name, String suname, int score,
			int phone_number) {
		setId(id);
		setName(name);
		setSuname(suname);
		setScore(score);
		setNumber_fone(phone_number);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuname() {
		return suname;
	}

	public void setSuname(String suname) {
		this.suname = suname;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getNumber_fone() {
		return phone_number;
	}

	public void setNumber_fone(int phone_number) {
		this.phone_number = phone_number;
	}

	public void show() {
		System.out.printf("%-10d", getId());
		System.out.printf("%-10s", getName());
		System.out.printf("%-10s", getSuname());
		System.out.printf("%-10d", getScore());
		System.out.printf("%-10d%n", getNumber_fone());
	}

}
