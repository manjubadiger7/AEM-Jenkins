package com.adobe.secondProject.core.models;

import org.apache.sling.api.resource.Resource;


import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;

import com.adobe.secondProject.core.service.NewObjectConfig;

@Model(adaptables = Resource.class, adapters = OsgiConfig.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class OsgiConfigImple implements OsgiConfig {

	@OSGiService
	NewObjectConfig newObjectConfig;

	@Override
	public int getLength() {
		return newObjectConfig.getLength();
	}

	@Override
	public int getBredth() {
		return newObjectConfig.getBredth();
	}

	@Override
	public String getFirstName() {
		return newObjectConfig.getFirstName();
	}

	@Override
	public String getLastName() {
		return newObjectConfig.getLastName();
	}

	@Override
	public boolean getGraduate() {

		return newObjectConfig.getGraduate();
	}

	@Override
	public String[] getCompanies() {

		return newObjectConfig.getCompanies();
	}

	@Override
	public String getContries() {

		return newObjectConfig.getContries();
	}

}
