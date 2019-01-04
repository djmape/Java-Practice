class InheritThis {
	public void justPrint() {
		System.out.println("Just print this");
	}
}

public class InheritancePractice extends InheritThis {
	
	public static void main(String args[]) {
		InheritThis inseo = new InheritThis();
		inseo.justPrint();
	}
}