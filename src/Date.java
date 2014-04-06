import java.util.Random;


public class Date {
	/*
	 * NOT WORKING YET, STILL SOME TODO ON GETTING A RANDOM DATE WITHIN A RANGE
	 * Takes in max and min dates as strings, parses them, and returns a new date as string
	 */

	public Date(String before, String after){
		
	}
	public String constructDate(String before, String after){
		Integer max[] = parseDate(before);
		Integer min[] = parseDate(after);
		Integer date[] = new Integer[3];
		return "this";
	}
	public Integer[] parseDate(String date){
		String[] split = date.split("/");
		Integer parts[] = new Integer[3];
		for(int i = 0;i<split.length;i++){
			parts[i] = Integer.parseInt(split[i]);
		}
		return parts;
		
	}
	public Integer IntInRange(Integer min, Integer max){
		Random rand = new Random();
		Integer randNum = Math.abs(rand.nextInt());
		randNum = randNum * min;
		randNum = randNum % max;
		return randNum;
	}
	public static void main(String[] args) {
		Date test = new Date("3/4/5" , "3/4/6");
		System.out.println(test.IntInRange(100, 200));
		

	}

}
