public class Main
{
	public static void main(String[] args) {
		StartegyContextClass scc = new StartegyContextClass();
		
		scc.setStrategy(new Concrete2Strategy());
		scc.doSomething();
		
		scc.setStrategy(new Concrete1Strategy());
		scc.doSomething();
	}
}