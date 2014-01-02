package au.uq.dke.comon.core.ui.experiment.interfaceexperiment2;

public class Child extends Parent implements IChild {


	@Override
	public String childMethod() {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String args[]) {
		IChild ichild = new Child();
		ichild.childMethod();
	}
}
