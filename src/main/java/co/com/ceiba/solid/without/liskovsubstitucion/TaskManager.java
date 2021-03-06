package co.com.ceiba.solid.without.liskovsubstitucion;

import java.util.ArrayList;
import java.util.List;

import co.com.ceiba.solid.without.liskovsubstitucion.util.ProjectTask;
import co.com.ceiba.solid.without.liskovsubstitucion.util.Task;

public class TaskManager {
	public static final void main (String[] args) {
		List<Task> tasks = new ArrayList<Task>();
		tasks.add(new Task("TAREA_NORMAL"));
		tasks.add(new ProjectTask("TAREA_TIPO_PROYECTO"));
		
		initTasks(tasks);
		
		closeTasks(tasks);
	}

	private static void closeTasks(List<Task> tasks) {
		System.out.println("***Cerrando las tareas");
		for (Task task: tasks) {
			if (task instanceof ProjectTask) {
				if (!task.getStatus().equals("Started")) {
					task.close();
				}
			} else {
				task.close();
			}
		}
	}

	private static void initTasks(List<Task> tasks) {
		for (Task task: tasks) {
			task.start();
		}		
	}
	
/*http://programmers.stackexchange.com/questions/170138/is-this-a-violation-of-the-liskov-substitution-principle*/
	
	
}
