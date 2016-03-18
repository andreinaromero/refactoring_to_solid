package co.com.ceiba.solid.without.liskovsubstitucion.util;

public class ProjectTask extends Task {


	public ProjectTask(String name) {
		super(name);
	}

	@Override
	public void close() {
		if (getStatus() == STARTED) 
            throw new IllegalStateException("Cannot close a started Project Task with name: " + getName());

		super.close();
	}

	
}
