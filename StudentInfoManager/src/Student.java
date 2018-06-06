
public class Student {
	private int no;
	private String name;
	private int age;
	private int java;
	private int c;
	private int sql;
	private int html;
	private int sum;
	private double avg;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getSql() {
		return sql;
	}

	public void setSql(int sql) {
		this.sql = sql;
	}

	public int getHtml() {
		return html;
	}

	public void setHtml(int html) {
		this.html = html;
	}

	
	public int getSum() {
		return sum;
	}

	public void setSum() {
		this.sum = this.java + this.c + this.sql + this.html;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg() {
		this.avg = this.sum / 4;
	}

	@Override
	public String toString() {
		return "\t" + this.no + "\t" + this.name + "\t" + this.age + "\t" + this.java + "\t" + this.c + "\t" + this.sql
				+ "\t" + this.html + "\t" + this.sum + "\t" + this.avg;
	}

}
