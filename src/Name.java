import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;


public class Name {
	String firstName;
	String middleName;
	String lastName;
	String gender;
	ArrayList<String> allFirstNames;
	ArrayList<String> allSurnames;
	/**
	 * 
	 * @param args
	 * @throws IOException 
	 */
	public Name(String inGender) throws IOException{
		gender = inGender;
		allFirstNames = new ArrayList<String>();
		allSurnames = new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new FileReader("src/first_names.txt"));
		if(gender=="M"){
			reader = new BufferedReader(new FileReader("src/first_names.txt"));
		}
		if(gender=="F"){
			reader = new BufferedReader(new FileReader("src/first_names_female.txt"));
		}
			String line = null;
			while ((line = reader.readLine()) != null) {
				String[] splitLine = line.split("\\s+");
				String first = splitLine[0];
				allFirstNames.add(first);
				
			}
		BufferedReader surnameReader = new BufferedReader(new FileReader("src/surnames"));
		line = null;
		while ((line = surnameReader.readLine()) != null) {
			String[] splitLine = line.split("\\s+");
			String last = splitLine[0];
			allSurnames.add(last);
		}
		
		Random rand = new Random();
		int randFirst = Math.abs(rand.nextInt()%allFirstNames.size());
		int randLast = Math.abs(rand.nextInt()%allSurnames.size());
		firstName = allFirstNames.get(randFirst);
		lastName = allSurnames.get(randLast);
		
		

	}
	
	public String toString(){
		String ret = firstName + " " + lastName;
		return ret;
	}
	public static void main(String[] args) throws IOException {
		String gender = "F";
		Name allNames = new Name(gender);
		System.out.println(allNames.toString());
		

	}

}
