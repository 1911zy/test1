package com.cy.pojo;

import java.io.Serializable;

public class Trace {
		private String AcceptStation;
		private String AcceptTime;
		@Override
		public String toString() {
			return "Trace [AcceptStation=" + AcceptStation + ", AcceptTime=" + AcceptTime + "]";
		}
		public String getAcceptStation() {
			return AcceptStation;
		}
		public void setAcceptStation(String acceptStation) {
			AcceptStation = acceptStation;
		}
		public String getAcceptTime() {
			return AcceptTime;
		}
		public void setAcceptTime(String acceptTime) {
			AcceptTime = acceptTime;
		}
	    

}
