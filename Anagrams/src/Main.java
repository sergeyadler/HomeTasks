import java.util.*;



public class Main {
	public static void main(String[] args) {
		System.out.println(sortStrings("ivan"));
		populateMap();
		System.out.println(anagrams("ivan"));
		System.out.println(anagrams("pert"));
		System.out.println(anagrams("anna"));
		System.out.println(anagrams("navi"));
		System.out.println(anagrams("viktoria"));
	
		
	}

	
		public static String[] voc = {"ivan", "petr","rept","vani","navi","anna","naan","viktoria","ikvtoria"};
		public static Map<String,List<String>> map = new HashMap<>();
		
		
		public static String sortStrings(String s) {
			char[] chars = s.toCharArray();
			Arrays.sort(chars);
			return new String(chars);
						
	}
		public static void populateMap() {
			for(String s : voc) {
			String sorted= sortStrings(s);
			System.out.println(s + " " +sorted);
			if(!map.containsKey(sorted)) {
				List<String>list= new ArrayList<>();
				list.add(s);
				map.put(sorted, list);
			}else {
				List<String>list = map.get(sorted);
				list.add(s);
				
			}
			
			}
				System.out.println(map);
		}
		public static List<String> anagrams(String s){
		String sorted = sortStrings(s);
		
		List<String>list = map.get(sorted);
		
		return list; 
		
		}
		

}
