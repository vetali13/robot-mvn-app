package robo;

public class AlphaRobot extends AbstractRobot{
	
	protected String name;
	protected String model;
	protected int x;
	protected int y;

	protected AlphaRobot(String name, String model) {
		this.name = name;
		this.model = model;
		this.x = 0;
		this.y = 0;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		} else {
			System.out.println("Name cannot be null!");
		}
		
	}

	public String getName() {
		return this.name;
	}

	public void setModel(String model) {
		if (model != null) {
			this.model = model;
		} else {
			System.out.println("Model cannot be null!");
		}
	}

	public String getModel() {
		return this.model;
	}

	public void setX(int x) {
		if ( (x >= 0)&&(x <= 100) ) {
			this.x = x;
		} else {
			System.out.println("Not a valid coordinate x!");
		}
		
	}

	public int getX() {
		return this.x;
	}

	public void setY(int y) {
		if ( (y >= 0)&&(y <= 100) ) {
			this.y = y;
		} else {
			System.out.println("Not a valid coordinate y!");
		}
	}

	public int getY() {
		return this.y;
	}

	public boolean moveRight() {
		if (this.getX() < 100) {
			this.setX(this.getX() + 1);
			return true;
		} else {
		return false;
		}
	}

	public boolean moveLeft() {
		if (this.getX() > 0) {
			this.setX(this.getX() - 1);;
			return true;
		} else {
		return false;
		}
	}

	public boolean moveDown() {
		if (this.getY() < 100) {
			this.setY(this.getY() + 1);
			return true;
		} else {
		return false;
		}
	}

	public boolean moveUp() {
		if (this.getY() > 0) {
			this.setY(this.getY() - 1);;
			return true;
		} else {
		return false;
		}
	}

	@Override
	public String toString() {
		return "AlphaRobot [name=" + name + ", model=" + model + ", x=" + x + ", y=" + y + "]";
	}
	
	

}
