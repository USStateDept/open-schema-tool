import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;




public class Country {
	String countryName;
	String countryCode;
	HashMap<String, ArrayList<String>> countryCities;
	/**
	 * @param args
	 */
	public Country(){
		Random rand = new Random();
		Integer randomNum = Math.abs(rand.nextInt());
		Locale[] allCountries = Locale.getAvailableLocales();
		randomNum = randomNum % allCountries.length;
		String randomCountry = allCountries[randomNum].getDisplayCountry();
		countryCode = allCountries[randomNum].getCountry();
		countryName = randomCountry;
	}
	public HashMap<String, ArrayList<String>> getCities(String code) throws IOException{
		countryCities = new HashMap<String, ArrayList<String>>();
		BufferedReader reader = new BufferedReader(new FileReader("src/cities15000.txt"));
		String line = null;
		String cityName;
		String countCode;
		while ((line = reader.readLine()) != null) {
			int lineCounter = 0;
			cityName = "none";
			countCode = "none";
		    String[] iterLine= line.split("\t");
		    for(String s : iterLine){
		    	
		    	if(lineCounter == 2){
		    		cityName = s;
		    		//System.out.print(s + " ");
		    	}
		    	if(lineCounter == 8){
		    		countCode = s;
		    		//System.out.println(s);
		    	}
		    	lineCounter++;
		    }
		    if(!countryCities.containsKey(countCode)){
		    	countryCities.put(countCode, new ArrayList<String>());
		    }
		    countryCities.get(countCode).add(cityName);
		    
		    lineCounter = 0;
		}
		return countryCities;
	}
	 
		
		
	
	
	public static void main(String[] args) throws IOException {
		Country tester = new Country();
		tester.getCities(tester.countryCode);
		System.out.println(tester.countryName + "\n" + tester.countryCode);
		System.out.print(tester.countryCities.get(tester.countryCode));
		

	}

}