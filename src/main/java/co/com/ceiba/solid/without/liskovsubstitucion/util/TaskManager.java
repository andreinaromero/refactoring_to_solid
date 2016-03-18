package co.com.ceiba.solid.without.liskovsubstitucion.util;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
	public static final void main (String[] args) {
		List<Task> tasks = new ArrayList<Task>();
		tasks.add(new Task("TAREA_NORMAL"));
		tasks.add(new ProjectTask("TAREA_TIPO_PROYECTO"));
		
		initTasks(tasks);
		
		closeTasks(tasks);
	}

	private static void closeTasks(List<Task> tasks) {
		for (Task task: tasks) {
			task.close();
		}
	}

	private static void initTasks(List<Task> tasks) {
		for (Task task: tasks) {
			task.start();
		}		
	}
	
/*http://programmers.stackexchange.com/questions/170138/is-this-a-violation-of-the-liskov-substitution-principle*/
	
	
}
