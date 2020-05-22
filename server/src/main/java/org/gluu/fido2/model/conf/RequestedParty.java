package org.gluu.fido2.model.conf;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Supported RP
 *
 * @author Yuriy Movchan Date: 05/22/2020
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestedParty {

    private String name;

    private List<String> domains = new ArrayList<String>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getDomains() {
		return domains;
	}

	public void setDomains(List<String> domains) {
		this.domains = domains;
	}

}
