import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		List<String> listA = new ArrayList<>();
		listA.add("c");
		listA.add("java");
		listA.add("delphi");
		listA.add("python");
		listA.add("C#");
		
		List <String>listB = new ArrayList <> ();
		listB.add("Html");
		listB.add("java");
		listB.add("python");
		listB.add("css");
		listB.add("C#");
		System.out.println(listA);
		System.out.println(listB);
		System.out.println(findDuplicates(listA, listB));
		
		

	}
	public static List<String> findDuplicates(List<String> listA , List<String> listB){
		List<String> res = new ArrayList<>();
		HashSet<String> set = new HashSet<>(listA);
		for(String s : listB) {
			if(set.contains(s)) {
				res.add(s);
			}
		}
			return res;
		
	}
}