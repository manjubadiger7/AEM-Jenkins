package com.adobe.secondProject.core.service;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.metatype.annotations.Designate;

import com.adobe.secondProject.core.config.ObjectFactoryConfigForOsgi;

@Component(service = NewObjectConfig.class, immediate = true)
@Designate(ocd = ObjectFactoryConfigForOsgi.class)
public class NewObjectConfigImpl implements NewObjectConfig {

	int length;
	int bredth;
	String firstName;
	String lastName;
	boolean isGraduate;
	String[] company;
	String contry;

	@Activate
	@Modified
	protected final void activate(ObjectFactoryConfigForOsgi objectFactoryConfigForOsgi) {
		length = objectFactoryConfigForOsgi.Length();
		bredth = objectFactoryConfigForOsgi.Bredth();
		firstName = objectFactoryConfigForOsgi.FirstName();
		lastName = objectFactoryConfigForOsgi.LastName();
		isGraduate = objectFactoryConfigForOsgi.isGraduated();
		company = objectFactoryConfigForOsgi.Companies();
		contry = objectFactoryConfigForOsgi.Contries();

	}

	@Override
	public int getLength() {
		return length;
	}

	@Override
	public int getBredth() {
		return bredth;
	}

	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return lastName;
	}

	@Override
	public boolean getGraduate() {
		// TODO Auto-generated method stub
		return isGraduate;
	}

	@Override
	public String[] getCompanies() {
		// TODO Auto-generated method stub
		return company;
	}

	@Override
	public String getContries() {
		// TODO Auto-generated method stub
		return contry;
	}

}
