package tp3;

public class FactoryPizzaStrasbourg extends FactoryPizzas {
	
	private static FactoryPizzas instance = new FactoryPizzaStrasbourg();
		
		private FactoryPizzaStrasbourg() {
			
		}
		
		public static FactoryPizzas getInstance() {
			return instance;
		}
		
		public Pizza creerPizza(String type) {
			if (type.equals("fromage")) {
				return new PizzaFromageStyleStrasbourg();
			} else if (type.equals("grecque")) {
				return new PizzaGrecqueStyleStrasbourg();
			} else {
				return new PizzaPoivronsStyleStrasbourg();
			}
		}
		
	}
