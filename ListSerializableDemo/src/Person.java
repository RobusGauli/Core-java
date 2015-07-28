import java.io.Serializable;


public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -224763762180195969L;
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
