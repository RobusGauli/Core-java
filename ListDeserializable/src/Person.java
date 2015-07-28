import java.io.Serializable;


public class Person implements Serializable{

	/**
	 * 
	 */
/*	private static final long serialVersionUID = 1254516875324760817L;*/
	private String name;
	private int id;
	public Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public Person(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
