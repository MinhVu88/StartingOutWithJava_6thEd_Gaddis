package code_listings.ch_11_exceptions_and_advanced_fileio;

/*
- An object�s fields can be retrieved & saved to a file as fields in a record 

- If an object contains other types of objects as fields, however, the process of saving its contents can become complicated 

- Fortunately, Java allows you to serialize objects, which is a simpler way of saving objects to a file

- When an object is serialized, it is converted into a series of bytes that contain the object�s data 

- If the object is set up properly, even the other objects that it might contain as fields are automatically serialized 

- The resulting set of bytes can be saved to a file for later retrieval
*/

/*
- In order for an object to be serialized, its class must implement the Serializable interface

- The Serializable interface, which is in the java.io package, has no methods or fields 

- It is used only to let the Java compiler know that objects of the class might be serialized 

- In addition, if a class contains objects of other classes as fields, those classes must also implement the Serializable interface, in order to be serialized

- Here are the lines of code from BankAcc.java: 

			import java.io.Serializable;
			
			public class BankAcc implements Serializable

- This new code tells the compiler that we want to be able to serialize objects of the BankAcc class 

- To write a serialized object to a file, you use an ObjectOutputStream object 

- The ObjectOutputStream class is designed to perform the serialization process (converting an object to a series of bytes) 

- To write the bytes to a file, you must also use an output stream object, such as FileOutputStream 

- Here is an example:

			FileOutputStream outStream = new FileOutputStream("Objects.dat");
			
			ObjectOutputStream objectOutputFile = new ObjectOutputStream(outStream);

- To serialize an object & write it to the file, use the ObjectOutputStream class�s writeObject method:

			BankAcc account = new BankAcc(5000.0);
			
			objectOutputFile.writeObject(account);

- The writeObject method throws an IOException if an error occurs

- The process of reading a serialized object�s bytes & constructing an object from them is known as deserialization 

- To deserialize an object you use an ObjectInputStream object, along with a FileInputStream object 

- Here is an example of how to set up the objects:

			FileInputStream inStream = new FileInputStream("Objects.dat");

			ObjectInputStream objectInputFile = new ObjectInputStream(inStream);

- To read a serialized object from the file, use the ObjectInputStream class�s readObject method 

- Here is an example:		BankAcc account = (BankAcc) objectInputFile.readObject();

- The readObject method returns the deserialized object 

- Notice that you must cast the return value to the desired class type (The readObject method throws a number of different exceptions
	if an error occurs. See the API documentation for more info)

- SerializeObjects.java serializes 3 BankAcc objects & DeserializeObjects.java deserializes them
*/

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializeObjects {

	public static void main(String[] args) throws IOException, NegativeStartingBalance {
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\nenter the file name: ");
		
		String fileName = kbi.nextLine();
		
		File file = new File(fileName);
		
		if(file.exists()) {
			System.out.println("\n\t" + fileName + " has been created");
		}else {
			System.out.println("\n\t" + fileName + " hasn't been created");
		}
		
		final int ACC_QUANTITY = 3;
		
		BankAcc[] accounts = new BankAcc[ACC_QUANTITY]; // a BankAcc array to store BankAcc instances
		
		// populate the array with the BankAcc instances
		for(int index = 0; index < accounts.length; index++) {
			System.out.print("\naccount #" + (index + 1) + ": ");
			
			accounts[index] = new BankAcc(kbi.nextDouble());
		}
		
		// Create the stream objects
		ObjectOutputStream objOutputFile = new ObjectOutputStream(new FileOutputStream(file));
		
		// write the serialized objects to the file
		for(int index = 0; index < accounts.length; index++) {
			objOutputFile.writeObject(accounts[index]);
		}
		
		objOutputFile.close();
		kbi.close();
		
		System.out.println("\n\tthe serialized objects were written to " + fileName);
	}

}
