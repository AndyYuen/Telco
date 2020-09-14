package com.myspace.telco;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ProvisionRequest implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Subscription Id")
	private java.lang.String subscriptionId;
	@org.kie.api.definition.type.Label(value = "User Name")
	private java.lang.String userName;
	@org.kie.api.definition.type.Label(value = "User Password")
	private java.lang.String userPassword;
	@org.kie.api.definition.type.Label(value = "Service Name")
	private java.lang.String serviceName;

	public ProvisionRequest() {
	}

	public java.lang.String getSubscriptionId() {
		return this.subscriptionId;
	}

	public void setSubscriptionId(java.lang.String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public java.lang.String getUserName() {
		return this.userName;
	}

	public void setUserName(java.lang.String userName) {
		this.userName = userName;
	}

	public java.lang.String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(java.lang.String userPassword) {
		this.userPassword = userPassword;
	}

	public java.lang.String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(java.lang.String serviceName) {
		this.serviceName = serviceName;
	}

	public ProvisionRequest(java.lang.String subscriptionId,
			java.lang.String userName, java.lang.String userPassword,
			java.lang.String serviceName) {
		this.subscriptionId = subscriptionId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.serviceName = serviceName;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("serviceName: "); builder.append(serviceName); builder.append('\n');
		builder.append("userName: "); builder.append(userName); builder.append('\n');
		builder.append("userPassword: "); builder.append(userPassword); builder.append('\n');
		builder.append("serviceName: "); builder.append(serviceName); builder.append('\n');

		return builder.toString();
	}

}