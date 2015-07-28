import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class Demo {

	public static void main(String[] args) {
			
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("robus",1));
		list.add(new Person("hello",2));
		
	
		
		try {
			FileOutputStream fout = new FileOutputStream("list.ser");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(list);
			
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		
		
		ArrayList<Person> newList = new ArrayList<>();
		try {
			FileInputStream in = new FileInputStream("list.ser");
			ObjectInputStream oin = new ObjectInputStream(in);
			newList = (ArrayList) oin.readObject();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	System.out.println(newList);
	System.out.println(list);
	// now get the deserialize object 
	
Person person  = newList.get(1);
System.out.println(person.getName()+person.getId());

		
	}

}
