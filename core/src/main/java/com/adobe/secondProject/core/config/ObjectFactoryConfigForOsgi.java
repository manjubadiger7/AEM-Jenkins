package com.adobe.secondProject.core.config;

import org.apache.poi.util.SystemOutLogger;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.osgi.service.metatype.annotations.Option;

@ObjectClassDefinition(name = "First OSGI Config", description = "OSGI Configration")
public @interface ObjectFactoryConfigForOsgi {

	@AttributeDefinition(name = "Length", description = "Length of the box", type = AttributeType.INTEGER)
	int Length();

	@AttributeDefinition(name = "Bredth", description = "Bredth of the box", type = AttributeType.INTEGER)
	int Bredth();

	@AttributeDefinition(name = "First Name", description = "Bredth of the box", type = AttributeType.STRING)
	String FirstName();

	@AttributeDefinition(name = "Last Name", description = "Bredth of the box", type = AttributeType.STRING)
	String LastName();

	@AttributeDefinition(name = "Graduate", description = "He/She is Graduated", type = AttributeType.BOOLEAN)
	boolean isGraduated();

	@AttributeDefinition(name = "Companies", description = "Add componies worked", type = AttributeType.STRING)
	String[] Companies();

	@AttributeDefinition(name = "Contries", description = "Select Country.", options = {
			@Option(label = "India", value = "india"), @Option(label = "USA", value = "america"),
			@Option(label = "Canada", value = "canada") }, type = AttributeType.STRING)
	String Contries();

}
