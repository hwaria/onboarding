import java.util.HashMap;
import java.util.Map;

public class Main2 {

	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("사람1", new Person("고경환", 45));
		map.put("사람2", new Person("문승진", 33));
		map.put("사람3", new Person("변자룡", 32));
		map.put("사람4", new Person("이창준", 31));
		map.put("사람5", new Person("김수용", 55));
		
		
		
		System.out.println(map);
		
	}
}


https://ithub.tistory.com/34
