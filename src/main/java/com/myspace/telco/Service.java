package com.myspace.telco;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Service implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Name")
	private java.lang.String name;
	@org.kie.api.definition.type.Label("HLR")
	private boolean hlr;
	@org.kie.api.definition.type.Label("LTE_HSS")
	private boolean lte_hss;
	@org.kie.api.definition.type.Label("SMSC")
	private boolean smsc;

	public Service() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Service [name=" + name + ", lte_hss=" + lte_hss + ", hlr="
				+ hlr + ", smsc=" + smsc + "]";
	}

	public boolean isHlr() {
		return this.hlr;
	}

	public void setHlr(boolean hlr) {
		this.hlr = hlr;
	}

	public boolean isLte_hss() {
		return this.lte_hss;
	}

	public void setLte_hss(boolean lte_hss) {
		this.lte_hss = lte_hss;
	}

	public boolean isSmsc() {
		return this.smsc;
	}

	public void setSmsc(boolean smsc) {
		this.smsc = smsc;
	}

	public Service(java.lang.String name, boolean hlr, boolean lte_hss,
			boolean smsc) {
		this.name = name;
		this.hlr = hlr;
		this.lte_hss = lte_hss;
		this.smsc = smsc;
	}

}