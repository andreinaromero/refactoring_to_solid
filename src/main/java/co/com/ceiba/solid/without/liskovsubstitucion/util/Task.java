package co.com.ceiba.solid.without.liskovsubstitucion.util;

public class Task {
	protected static final String CLOSED = "Closed";
	protected static final String STARTED = "Started";
	
	private String status;
	private String name;
	
	public Task(String name) {
		this.name = name;
	}

	public void close()
    {
        status = CLOSED;
    }

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void start() {
		status = STARTED;
		System.out.println("La tarea: **" + name + "** ha sido iniciada");
	}
    
    
}
