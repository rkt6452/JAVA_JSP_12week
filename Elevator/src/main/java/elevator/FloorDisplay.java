package elevator;

public class FloorDisplay implements Observer {

	private ElevatorController controller;
	
	public FloorDisplay(ElevatorController controller) {
		this.controller = controller;
	}
	
	public void update() {
		// TODO Auto-generated method stub
		int curFloor = controller.getCurFloor();
		System.out.println("Floor Display: " + curFloor);

	}

}
