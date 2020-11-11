public class ControlPanel {  
	
	Command [] slots;
	Command last;
	
	ControlPanel(Command slots []){
		this.slots = slots;
	}
  
	// do command at slot i
	void buttonWasPressed(int i){
		slots[i].execute();
		last = slots[i];
	}
	
	void undo() {
		last.undo();
	}

}
