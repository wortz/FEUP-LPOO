package circuits;

public class GateOr extends LogicGate {
	private LogicVariable output;
	private LogicVariable input;
	private LogicVariable input1;
	public GateOr(LogicVariable w2, LogicVariable w1, LogicVariable x3) throws ColisionException {
		if(w2.getCalculatedBy()!=null)
			throw new ColisionException();
		w2.setCalculatedBy(this);
		this.output=w2;
		this.input=w1;
		this.input1=x3;
	}

	@Override
	public LogicVariable getOutput() {
		return this.output;
	}

	@Override
	public LogicVariable[] getInputs() {
		return (new LogicVariable[] {input,input1});
	}
	
	public String getSymbol() {
		return "OR";
	}

}
