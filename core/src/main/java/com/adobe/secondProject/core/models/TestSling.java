package com.adobe.secondProject.core.models;

import javax.inject.Inject;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class TestSling {

	@Inject
	String firstName;

	@Inject
	String lastName;

	@Inject
	boolean graduate;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public boolean getGraduate() {
		return graduate;
	}
}
