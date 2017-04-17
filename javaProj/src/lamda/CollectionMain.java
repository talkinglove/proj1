package lamda;

import java.util.Arrays;
import java.util.Comparator;

public class CollectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] stu = {"30", "60", "100", "25", "70"}; 
		
		System.out.println("학생별========");
		
		System.out.println(Arrays.toString(stu));
		
		/*Arrays.sort(stu,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		});*/
		
		Arrays.sort(stu,(o1,o2) -> ((String)o2).compareTo(((String)o1)));
		
		System.out.println("등수별=====");
		System.out.println(Arrays.toString(stu));
		}
		
	}


