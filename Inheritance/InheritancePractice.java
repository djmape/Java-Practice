class InheritThis {

	String aString = "Superclass ";

	InheritThis() {
	}

	public void justPrint() {
		System.out.println("Just print this");
	}
}

public class InheritancePractice extends InheritThis {
	
	String aString = "Subclass ";

	public void displayThis() {
		System.out.println( super.aString + "accessed!");
	}

	public static void main(String args[]) {
		InheritancePractice inh = new InheritancePractice();
		inh.displayThis();
	}
}