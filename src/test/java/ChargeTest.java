import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import robo.BetaRobot;
import robo.RobotFactory;

public class ChargeTest {
	public static BetaRobot robot;
	
	@BeforeAll
	public static void initRobot() {
		robot = (BetaRobot) RobotFactory.getRobot("beta", "Robik");
	}
	
	@BeforeEach
	public void resetRobot() {
		robot.setX(0);
		robot.setY(0);
		robot.setCharge(0);
	}
	
	@Test
	@Order(1)
	public void testChargeNegative() {
		robot.setCharge(-100);
		assertNotEquals(-100, robot.getCharge(), "Charge test failed\nREASON: Values less than 0 not allowed!");
	}
	
	@Test
	@Order(2)
	public void testChargeTooHigh() {
		robot.setCharge(1000);
		assertNotEquals(1000, robot.getCharge(), "Charge test failed\nREASON: Values higher than 100 not allowed!");
	}
	
	@Test
	@Order(3)
	public void testMoveUntilDischarged() {
		robot.setCharge(50);
		while (robot.canMoveRight()) {
			robot.moveRight();
		}
		assertEquals(5, robot.getCharge(), "Move until discharged test failed\nREASON: Robot should start moving when charge is 5!");
	}
}
