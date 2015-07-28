import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Person> newList = new ArrayList<>();
		try {
			FileInputStream in = new FileInputStream("list.ser");
			ObjectInputStream oin = new ObjectInputStream(in);
			newList = (ArrayList) oin.readObject();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	
	// now get the deserialize object 
	
Person person  = newList.get(1);
System.out.println(person.getName());
System.out.println(person.getId());

		
		
		
		
	}

}
