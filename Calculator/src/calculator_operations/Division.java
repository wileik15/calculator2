package calculator_operations;

public class Division extends Operation {

	@Override
	public String getName() {
		return "division";
	}

	@Override
	public String getOperator() {
		return "/";
	}

	@Override
	public double calc() {
		return a/b;
	}

}
