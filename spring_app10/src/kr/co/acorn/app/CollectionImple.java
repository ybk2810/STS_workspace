package kr.co.acorn.app;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionImple implements CollectionInter {
	private List<String> list;
	private Map<String, String> map;
	
	public CollectionImple( ) {}
	public CollectionImple(List<String> list, Map<String, String> map) {
		super();
		this.list = list;
		this.map = map;
	}

	@Override
	public void printList() {
		for(String x: list) {
			System.out.println(x);
		}
	}

	@Override
	public void printMap() {
		// map
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str + map.get(str));
		}
		// key : value 형태로 출력
		
		
	}
}
