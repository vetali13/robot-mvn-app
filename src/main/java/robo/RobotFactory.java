package robo;

public class RobotFactory {
	
	public static AbstractRobot getRobot(String model, String name) {
		if (model.equalsIgnoreCase("alpha")) {
			return new AlphaRobot(name, "Alpha");
		} 
		else if (model.equalsIgnoreCase("beta")) {
			return new BetaRobot(name, "Beta");
		}
		else if (model.equalsIgnoreCase("charlie")) {
			return new CharlieRobot(name, "Charlie");
		}
		return null;
	}
}
