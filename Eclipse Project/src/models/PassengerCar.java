package models;

public class PassengerCar extends BaseCar {

	private static final long serialVersionUID = 8962335670763104350L;

	public PassengerCar(){
		super();
		
		// For test purposes we want to take a travel from Den Haag to Groningen
		getNavigation().plotRoute(
				getNavigation().getRoadnetwork().getVertex("Den Haag"), 
				getNavigation().getRoadnetwork().getVertex("Groningen"));
		
		// The route is saved in the navigation and we can print it
		getNavigation().printCurrentRoute();
	}
	
	public void setup(){
		Object[] args = getArguments();
		
		// Add a behavior which is responsible for the car movement (driving)
		addBehaviour(new DriveBehavior(this) {
		      protected void handleElapsedTimeout() {
		    	  // nop
		      }});
	}
}
