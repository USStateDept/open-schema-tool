import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;


public class City {
	String parentCountry;
	String parentCountryCode;
	String city;

	public City (Country c){
		parentCountry = c.countryName;
		parentCountryCode = c.countryCode;
		city = selectCity(c);
		
	}
	public String selectCity(Country c){
		Integer newRand = getRandInRange(c.cities.size());
		return c.cities.get(newRand);
		
		
	}
	public Integer getRandInRange(Integer size){
		Random rand = new Random();
		Integer randomNum = Math.abs(rand.nextInt());
		randomNum = randomNum % size;
		return randomNum;
		
	}
	public static void main(String[] args) throws IOException {
		Country newCountry = new Country();
		City newCity = new City(newCountry);
		System.out.println(newCity.city);
		System.out.println(newCity.parentCountry);

	}

}
