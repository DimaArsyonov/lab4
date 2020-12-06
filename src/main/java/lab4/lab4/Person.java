package lab4.lab4;

public class Person extends Division {
	
	private long id;
	private String name;
	private String sex;
	private String sal;
	private String birth;
	
	public Person(long idDiv, String title) {
		setIdDiv(idDiv);
		setTitle(title);
	}
	
	public Person() {
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public long getId() {
        return id;
    }
	
	public void setName(String name) {
        this.name = name;
    }
	
	public String getName() {
        return name;
    }
	
	public void setSex(String sex) {
        this.sex = sex;
    }
	
	public String getSex() {
        return sex;
    }
	
	public void setSalary(String sal) {
        this.sal = sal;
    }
	
	public String getSalary() {
        return sal;
    }
	
	public void setBirth(String birth) {
        this.birth = birth;
    }
	
	public String getBirth() {
        return birth;
    }
	//переопределение метода toString для удобства вывода на печать
	@Override
    public String toString(){
		return "\nID=" + getId() + "::name=" + getName() + "::gender=" + getSex() + "::BirthData=" + getBirth() + "::Division=" + getTitle() + "::Salary=" + getSalary();
    }
}
