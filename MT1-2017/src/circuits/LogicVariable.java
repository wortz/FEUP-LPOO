package circuits;

public class LogicVariable {
	private String name;
	private boolean value;
	private LogicGate calculatedBy;
	
	public LogicVariable(String string, boolean b) {
		this.name=string;
		this.value=b;
	}

	public LogicVariable(String string) {
		this.name=string;
	}

	public String getName() {
		return name;
	}

	public Object getValue() {
		return value;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogicVariable other = (LogicVariable) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	
	public LogicGate getCalculatedBy() {
		return calculatedBy;
	}

	public void setCalculatedBy(LogicGate asd) {
		this.calculatedBy = asd;
	}

	public void setValue(boolean b) {
		this.value=b;
		
	}

	public String getFormula() {
		
	}

}
