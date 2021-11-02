package techno.java.corejava.abstraction.FactoryProj;


public class FactoryClass {
	JavaBatch type =null;
	public JavaBatch getType(String name)  {
		if(name.equalsIgnoreCase("Dancer")) {
			type =new DancerOfClass();
		}
		else if(name.equalsIgnoreCase("Sleepy")) {
			type =new SleepyStudent();
		}
		else if(name.equalsIgnoreCase("Comedy")) {
			type =new ComedyStudent();
		}
		else {
			type =new ProjectManeger();
			
		}
		return type;
		
	}
}
