package circuits;

public class GateAnd extends LogicGate{
	private LogicVariable output;
	private LogicVariable input;
	private LogicVariable input1;
	public GateAnd(LogicVariable w1, LogicVariable x1, LogicVariable x2) throws ColisionException {
		if(w1.getCalculatedBy()!=null)
			throw new ColisionException();
		w1.setCalculatedBy(this);
		this.output=w1;
		this.input=x1;
		this.input1=x2;
		
	}
	
	public LogicVariable[] getInputs() {
		return (new LogicVariable[]{input,input1});
	}
	
	public LogicVariable getOutput() {
		return output;
	}

	@Override
	public String getSymbol() {
		return "AND";
	}
}
