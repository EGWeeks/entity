public abstract class Entity {

	private String size;
	private boolean isDead = false;
	private boolean isSleeping = false;
	private int weight; 

	public Entity(String size, int weight){
		this.size = size;
		this.weight = weight;
	}


	public boolean eat(Entity organism) {
		this.weight += organism.weight / 10;
		organism.die();
		return true;
	}

	public boolean sleep() {
		isSleeping = true;
		return isSleeping;
	}

	public boolean poop() {
		weight -= this.weight / 10;
		if (weight <= 0) {
			isDead = true;
		} else {
			isDead = false;
		}
		return isDead;
	}

	public void act() {
		if(!isDead) {
			
		} else if (isSleeping) {
			int rand = ((int) Math.random() * 2) + 1;
			if(rand == 1) {
				isSleeping = false;
			}
		} else {
			int rand = ((int) Math.random() * 3) + 1;
			if(rand == 1) {
				//eat() needs argument of entity type
				// this.eat();
				System.out.println("I am eating.");
			} else if (rand == 2) {
				this.sleep();
			} else {
				this.poop();
			}
		}
	}

	public void die() {
		this.isDead = true;
	}

	public static void main(String [] args) {

	}
}