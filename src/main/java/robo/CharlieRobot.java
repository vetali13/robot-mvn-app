package robo;

public class CharlieRobot extends BetaRobot{
	
	private static int moveCounter = 0;
	
	protected CharlieRobot(String name, String model) {
		super(name, model);
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
	@Override
	public boolean moveRight() {
		if ( this.canMoveRight()) {
			this.setX(this.getX() + 1);
			moveCounter++;
			if(moveCounter%2 == 0) {
				this.setCharge((int)(this.getCharge()-1));
			}
			return true;
		} else {
		return false;
		}
	}
	@Override
	public boolean moveLeft() {
		if ( this.canMoveLeft()) {
			this.setX(this.getX() - 1);
			moveCounter++;
			if(moveCounter%2 == 0) {
				this.setCharge((int)(this.getCharge()-1));
			}
			return true;
		} else {
		return false;
		}
	}
	@Override
	public boolean moveDown() {
		if ( this.canMoveDown()) {
			this.setY(this.getY() + 1);
			moveCounter++;
			if(moveCounter%2 == 0) {
				this.setCharge((int)(this.getCharge()-1));
			}
			return true;
		} else {
		return false;
		}
	}
	@Override
	public boolean moveUp() {
		if ( this.canMoveUp()) {
			this.setX(this.getY() - 1);
			moveCounter++;
			if(moveCounter%2 == 0) {
				this.setCharge((int)(this.getCharge()-1));
			}
			return true;
		} else {
		return false;
		}
	}
	
	public boolean moveDownRight() {
		if ( this.canMoveDown()&&this.canMoveRight() ) {
			this.setX(this.getX() + 1);
			this.setY(this.getY() + 1);
			moveCounter++;
			if(moveCounter%2 == 0) {
				this.setCharge((int)(this.getCharge()-1));
			}
			return true;
		}
		
		return false;
	}
	
	public boolean moveUpLeft() {
		if ( this.canMoveUp()&&this.canMoveLeft() ) {
			this.setX(this.getX() - 1);
			this.setY(this.getY() - 1);
			moveCounter++;
			if(moveCounter%2 == 0) {
				this.setCharge((int)(this.getCharge()-1));
			}
			return true;
		}

		return false;
	}
	
	
	public boolean moveDownLeft() {
		if ( this.canMoveDown()&&this.canMoveLeft() ) {
			this.setX(this.getX() - 1);
			this.setY(this.getY() + 1);
			moveCounter++;
			if(moveCounter%2 == 0) {
				this.setCharge((int)(this.getCharge()-1));
			}
			return true;
		}
		return false;
	}
	
	public boolean moveUpRight() {
		if ( this.canMoveUp()&&this.canMoveRight() ) {
			this.setX(this.getX() + 1);
			this.setY(this.getY() - 1);
			moveCounter++;
			if(moveCounter%2 == 0) {
				this.setCharge((int)(this.getCharge()-1));
			}
			return true;
		}
		return false;
	}
	
	public void setCharge(int charge) {
		if ( (charge > 0)&&(charge <=100) ) {
			this.charge = (byte) charge;
		} else {
			System.out.println("Charging error!");
		}
	}

	public byte getCharge() {
		return charge;
	}

	@Override
	public String toString() {
		return "CharlieRobot [name=" + name + ", model=" + model + ", x=" + x + ", y=" + y + ", charge=" + charge + "]";
	}
	
	public boolean canMoveRight() {
		boolean hasCharge = this.getCharge()>5;
		boolean hasStepX = (this.getX()>=0)&&(this.getX()<100);
		return hasCharge&&hasStepX;
	}
	
	public boolean canMoveLeft() {
		boolean hasCharge = this.getCharge()>5;
		boolean hasStepX = (this.getX()>0)&&(this.getX()<=100);
		return hasCharge&&hasStepX;
	}
	
	public boolean canMoveDown() {
		boolean hasCharge = this.getCharge()>5;
		boolean hasStepY = (this.getY()>=0)&&(this.getY()<100);
		return hasCharge&&hasStepY;
	}
	
	public boolean canMoveUp() {
		boolean hasCharge = this.getCharge()>5;
		boolean hasStepY = (this.getY()>0)&&(this.getY()<=100);
		return hasCharge&&hasStepY;
	}
}
