package tp3;

public class FactoryPizzaBrest extends FactoryPizzas {
	private static FactoryPizzas instance = new FactoryPizzaBrest();
	
	private FactoryPizzaBrest() {
		
	}
	
	public static FactoryPizzas getInstance() {
		return instance;
	}
	
	public Pizza creerPizza(String type) {
		if (type.equals("fromage")) {
			return new PizzaFromageStyleBrest();
		} else if (type.equals("grecque")) {
			return new PizzaGrecqueStyleBrest();
		} else {
			return new PizzaPoivronsStyleBrest();
		}
	}
	
}
