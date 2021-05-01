package topic.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC690_员工的重要性 {
	class Employee {
		public int id;
		public int importance;
		public List<Integer> subordinates;
	};

	Map<Integer, Employee> cache = new HashMap<>();

	// 哈希-递归 O(n)，O(n)
	public int getImportance1(List<Employee> employees, int id) {
		for (Employee e : employees) {
			cache.put(e.id, e);
		}
		Employee e = cache.get(id);
		return getImportance(e);
	}

	int getImportance(Employee e) {
		if (e == null)
			return 0;
		int imp = e.importance;
		for (Integer eid : e.subordinates) {
			Employee ee = cache.get(eid);
			imp += getImportance(ee);
		}
		return imp;
	}
}
