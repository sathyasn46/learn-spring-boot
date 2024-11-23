package learn.springboot.learnspringboot.objects;

public class Course {
	
	private int id;
	private String name;
	private String patent;
	
	public Course(int id, String name, String patent) {
		super();
		this.id = id;
		this.name = name;
		this.patent = patent;
	}
	

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", patent=" + patent + "]";
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

	public String getPatent() {
		return patent;
	}

	public void setPatent(String patent) {
		this.patent = patent;
	}

	

}
