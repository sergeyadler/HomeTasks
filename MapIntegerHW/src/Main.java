import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		System.out.println(getWordCount("Ivan"));
		System.out.println(getWordCount2("Anna"));

	}

	public static String[] voc = { "Ivan", "Anna", "Ivan", "Ivan", "Anna", "Petr", "lena", "lena", "lena", "lena" };
	public static Map<String, Integer> map = new HashMap<>();
	 static List<String> voc2 = Arrays.asList("Ivan","Anna","Ivan");
	public static Map<String, Integer> getWordCount(String strings) {
		for (String s : voc) {
			if (!map.containsKey(s)) {
				map.put(s, 1);

			} else {
				int count = map.get(s);
				map.put(s, count + 1);
			}
		}
		return map;
	}
	public static Map<String, Integer> getWordCount2(String strings) {
		for (String s : voc) {
			int count=!map.containsKey(s)? 1:map.get(s)+1;			
		}
		return map;

		//voc.forEach(s->map.put(s,((!map.containsKey(s))? 1:map.get(s)+1)));
	
	}
	
}
