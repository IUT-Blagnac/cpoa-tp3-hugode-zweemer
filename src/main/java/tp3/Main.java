package tp3;

public class Main {

	public static void main (String[] argv) {
		
		Pizzeria pizzeria = new PizzeriaStrasbourg();
		
		Pizza jaifaim = pizzeria.commanderPizza("fromage");
		
	    Pizzeria boutiqueBrest = new PizzeriaBrest();
	    Pizzeria boutiqueStrasbourg = new PizzeriaStrasbourg();

	    Pizza pizza = boutiqueBrest.commanderPizza("fromage");
	    System.out.println("JMB a commandé une " + pizza.getNom() + "\n");

	    pizza = boutiqueStrasbourg.commanderPizza("fromage");
	    System.out.println("JMI a commandé une " + pizza.getNom() + "\n");
		
	}
	
}
