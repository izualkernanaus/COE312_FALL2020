public class LightOnCommand implements Command {

	Light light; // Acts on something?

	LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on(); // ACTS ON THE SOMETHING

	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		light.off();
	}

}
