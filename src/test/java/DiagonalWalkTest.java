import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import robo.CharlieRobot;
import robo.RobotFactory;
public class DiagonalWalkTest {
	public static CharlieRobot robot;
	
	
	@BeforeAll
	public static void initRobot() {
		robot = (CharlieRobot) RobotFactory.getRobot("charlie", "Robik");
	}
	
	@BeforeEach
	public void resetRobot() {
		robot.setX(0);
		robot.setY(0);
		robot.setCharge(0);
	}
	
	@Test
	@Order(1)
	public void testMoveDownRightX() {
		robot.setX(100);
		assertNotEquals(true, robot.moveDownRight(), "Move down-right test failed\nREASON: Cannot move right if X is 100!");
	}
	
	@Test
	@Order(2)
	public void testMoveDownRightY() {
		robot.setY(100);
		assertNotEquals(true, robot.moveDownRight(), "Move down-right test failed\nREASON: Cannot move down if Y is 100!");
	}
	
	@Test
	@Order(3)
	public void testMoveUpLeftX() {
		robot.setY(100);
		assertNotEquals(true, robot.moveUpLeft(), "Move up-left test failed\nREASON: Cannot move left if X is 0!");
	}
	
	@Test
	@Order(4)
	public void testMoveUpLeftY() {
		robot.setX(100);
		assertNotEquals(true, robot.moveUpLeft(), "Move up-left test failed\nREASON: Cannot move up if Y is 0!");
	}
	
	
}
