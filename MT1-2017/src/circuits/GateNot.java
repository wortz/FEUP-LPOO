package circuits;

public class GateNot extends LogicGate {
	private LogicVariable input;
	private LogicVariable output;
	
	public GateNot(LogicVariable y1, LogicVariable w2) throws ColisionException {
		if(y1.getCalculatedBy()!=null)
			throw new ColisionException();
		y1.setCalculatedBy(this);
		this.output=y1;
		this.input=w2;
	}

	@Override
	public LogicVariable getOutput() {
		return this.output;
	}

	@Override
	public LogicVariable[] getInputs() {
		return (new LogicVariable[] {this.input});
	}
	
	public String getSymbol() {
		return "NOT";
	}

}
