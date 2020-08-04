import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;

import robo.AbstractRobot;
import robo.RobotFactory;
import org.junit.jupiter.api.Test;

public class SimpleTest {
	
	public static AbstractRobot robot;
	
	@BeforeAll
	public static void initRobot() {
		robot = RobotFactory.getRobot("alpha", "Robik");
	}
	
	@BeforeEach
	public void resetRobot() {
		robot.setModel("Alpha");
		robot.setName("Robik");
		robot.setX(0);
		robot.setY(0);
	}
	
	@Test
	@Order(1)
	public void testName() {
		robot.setName(null);
		assertNotEquals(null, robot.getName(), "Name test failed\nREASON: null name not allowed!");
	}
	
	@Test
	@Order(2)
	public void testModel() {
		robot.setModel(null);
		assertNotEquals(null, robot.getModel(), "Model test failed\nREASON: null model not allowed!");
	}
	
	@Test
	@Order(3)
	public void testXnegative() {
		robot.setX(-100);
		assertNotEquals(-100, robot.getX(), "X coord test failed\nREASON: Values less than 0 not allowed!");
	}
	
	@Test
	@Order(4)
	public void testXtooHigh() {
		robot.setX(1000);
		assertNotEquals(1000, robot.getX(), "X coord test failed\nREASON: Values more than 100 not allowed!");
	}
	
	@Test
	@Order(5)
	public void testYnegative() {
		robot.setY(-100);
		assertNotEquals(-100, robot.getY(), "Y coord test failed\nREASON: Values less than 0 not allowed!");
	}
	
	@Test
	@Order(6)
	public void testYtooHigh() {
		robot.setY(1000);
		assertNotEquals(1000, robot.getY(), "X coord test failed\nREASON: Values more than 100 not allowed!");
	}
	
	@Test
	@Order(7)
	public void testMoveUpBoundary() {
		robot.setY(0);
		assertNotEquals(true, robot.moveUp(), "Move test failed\nREASON: moveUp() out of bounds!");
	}
	
	@Test
	@Order(8)
	public void testMoveDownBoundary() {
		robot.setY(100);
		assertNotEquals(true, robot.moveDown(), "Move test failed\nREASON: moveDown() out of bounds!");
	}
	
	@Test
	@Order(9)
	public void testMoveLeftBoundary() {
		robot.setX(0);
		assertNotEquals(true, robot.moveLeft(), "Move test failed\nREASON: moveLeft() out of bounds!");
	}
	
	@Test
	@Order(10)
	public void testMoveRightBoundary() {
		robot.setX(100);
		assertNotEquals(true, robot.moveRight(), "Move test failed\nREASON: moveRight() out of bounds!");
	}
	
}