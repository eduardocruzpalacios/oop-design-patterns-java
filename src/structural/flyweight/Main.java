package structural.flyweight;

import structural.flyweight.client.ConcreteRenderedMap;
import structural.flyweight.context.Object;
import structural.flyweight.dao.ObjectTypeDao;
import structural.flyweight.flyweight.ObjectFactory;
import structural.flyweight.model.ObjectStatus;

public class Main {

	public static void main(String[] args) {

		// provide Flyweight Factory with Flyweight instances
		ObjectFactory.setObjectTypes(ObjectTypeDao.getObjects());

		// initialize client
		ConcreteRenderedMap concreteRenderedMap = new ConcreteRenderedMap();

		// initialize Context instances by setting ObjectStatus and Flyweight

		Object object1 = new Object();
		object1.setObjectStatus(ObjectStatus.NEW);
		object1.setObjectType(ObjectFactory.getObjectType("Cheap chair"));

		Object object2 = new Object();
		object2.setObjectStatus(ObjectStatus.NEW);
		object2.setObjectType(ObjectFactory.getObjectType("Regular shower"));

		// Use them from client

		concreteRenderedMap.render(object1);
		concreteRenderedMap.render(object2);

		concreteRenderedMap.printRendered();

		concreteRenderedMap.unrender(object1.getId());

		concreteRenderedMap.printRendered();

		/*
		 * note for improvement:
		 * 
		 * - it could be use Mediator pattern to make the client actually execute render
		 * and unrender methods
		 */

		/*
		 * in case the repetitive or unique states need to be modified, the maintainer
		 * only have to modify flyweight or context classes respectively
		 */

	}

}
