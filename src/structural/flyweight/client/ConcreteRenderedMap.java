package structural.flyweight.client;

import java.util.HashMap;
import java.util.Map;

import structural.flyweight.context.Object;

public class ConcreteRenderedMap {

	private static int id = 0;

	private Map<Integer, Object> objects = new HashMap<>();

	public void render(Object object) {
		object.setId(id++);
		objects.put(object.getId(), object);
	}

	public void unrender(int id) {
		objects.remove(id);
	}

	public void printRendered() {
		this.objects.keySet().forEach(e -> System.out.println(this.objects.get(e)));
	}

}
