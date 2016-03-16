package co.com.ceiba.solid.without.interfacesegregation;

public class Manager {
	IWorker worker;

	public void setWorker(IWorker w) {
		worker=w;
	}

	public void manage() {
		worker.work();
	}
}

/*http://www.oodesign.com/interface-segregation-principle.html*/
