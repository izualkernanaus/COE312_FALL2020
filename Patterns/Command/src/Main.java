
public class Main {

	public static void main(String[] args) {

		// create object to be acted upon
	Light l1 = new Light();

	// create the commands
	LightOnCommand con = new LightOnCommand(l1);
	LightOffCommand coff = new LightOffCommand(l1);

	// create the panel
	Command[] cmds = { con, coff };
	ControlPanel p = new ControlPanel(cmds);

	// operate the light and stereo
	p.buttonWasPressed(0);
	p.undo();

}

}
