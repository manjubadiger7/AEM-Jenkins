package com.adobe.secondProject.core.models;

import java.util.ArrayList;


import java.util.Collections;
import java.util.List;

import javax.annotation.PostConstruct;
import org.apache.sling.api.resource.Resource;
import javax.inject.Inject;

import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Via;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CodeChallenge {

	@Inject
	String firstName;

	@Inject
	String lastName;

	@Inject
	boolean graduate;

	@Inject
	long phone;

	@Inject
	String gender;

	@Inject
	String country;

	@Inject
	private List<String> books;

	@Inject
	String fileReference;

	@Inject
	String pathBrowser;

	public String getFirstName() {

		return firstName;
	}

	public String getLastName() {

		return lastName;
	}

	public boolean getGraduate() {
		return graduate;
	}

	public long getPhone() {
		return phone;
	}

	public String getGender() {
		return gender;
	}

	public String getCountry() {
		return country;
	}

	public List<String> getBooks() {
		if (books != null) {
			return new ArrayList<String>(books);
		} else {
			return Collections.emptyList();
		}
	}

	@PostConstruct
	public String getFileReference() {
		return fileReference;
	}

	public String getPathBrowser() {
		return pathBrowser;
	}

}
