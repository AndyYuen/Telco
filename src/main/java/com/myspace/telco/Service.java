package com.myspace.telco;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Service implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Name")
	private java.lang.String name;
	@org.kie.api.definition.type.Label(value = "HLR")
	private com.myspace.telco.NetElement hlr;
	@org.kie.api.definition.type.Label(value = "LTE_HSS")
	private com.myspace.telco.NetElement lte_hss;
	@org.kie.api.definition.type.Label(value = "SMSC")
	private com.myspace.telco.NetElement smsc;

	public Service() {
	    hlr = new NetElement("HLR");
        lte_hss = new NetElement("LTE HSS");
        smsc = new NetElement("SMSC");
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public com.myspace.telco.NetElement getHlr() {
		return this.hlr;
	}

	public void setHlr(com.myspace.telco.NetElement hlr) {
		this.hlr = hlr;
	}

	public com.myspace.telco.NetElement getLte_hss() {
		return this.lte_hss;
	}

	public void setLte_hss(com.myspace.telco.NetElement lte_hss) {
		this.lte_hss = lte_hss;
	}

	public com.myspace.telco.NetElement getSmsc() {
		return this.smsc;
	}

	public void setSmsc(com.myspace.telco.NetElement smsc) {
		this.smsc = smsc;
	}
/*
	public Service(java.lang.String name, com.myspace.telco.NetElement hlr,
			com.myspace.telco.NetElement lte_hss,
			com.myspace.telco.NetElement smsc) {
		this.name = name;
		this.hlr = hlr;
		this.lte_hss = lte_hss;
		this.smsc = smsc;
	}
*/	

    @Override
    public String toString() {
        return "Service [name=" + name + ", lte_hss=" + lte_hss + ", hlr=" + hlr + ", smsc=" + smsc + "]";
    }

}