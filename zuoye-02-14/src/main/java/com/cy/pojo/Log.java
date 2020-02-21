package com.cy.pojo;

import java.io.Serializable;
import java.util.List;

public class Log implements Serializable {
	String LogisticCode;
	String ShipperCode;
	List <Trace> Traces;
	public String getLogisticCode() {
		return LogisticCode;
	}
	public final String getShipperCode() {
		return ShipperCode;
	}
	public final void setShipperCode(String shipperCode) {
		ShipperCode = shipperCode;
	}
	public void setLogisticCode(String logisticCode) {
		LogisticCode = logisticCode;
	}
	public List<Trace> getTraces() {
		return Traces;
	}
	public void setTraces(List<Trace> traces) {
		Traces = traces;
	}
	@Override
	public String toString() {
		return "Log [LogisticCode=" + LogisticCode + ", ShipperCode=" + ShipperCode + ", Traces=" + Traces + "]";
	}

	
}
