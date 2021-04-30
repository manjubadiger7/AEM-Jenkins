package com.adobe.secondProject.core.models;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Via;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.RequestAttribute;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.LoggerFactory;

import com.day.cq.search.QueryBuilder;
import com.day.cq.wcm.api.Page;

@Model(adaptables = SlingHttpServletRequest.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class SLingTwo {
	
	private static final org.slf4j.Logger LOG  = LoggerFactory.getLogger(SLingTwo.class); 
	
	@ScriptVariable
	Page currentPage;
	
	@Inject
	@Via("resource")
	String firstName;
	
	@ValueMapValue
	String lastName;
	
	@Inject
	@Via("resource")
	boolean graduate;
	
	@Inject
	@Via("resource")
	String country;
	
	@Inject
	@Via("resource")
	
	long phone;
	
	//making available to model
	@OSGiService
	QueryBuilder queryBuilder;
	
	//property aliasing
	@Inject
	@Named("jcr:primaryType")
	@Via("resource")
	String description;
	
	
	
	
	@RequestAttribute(name = "reqAttribute")
	private String requestAttribute;
	
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
	
	public String getPageTitle() {
		return currentPage.getTitle();
	}
	
	public String getRequestAttribute() {
		return requestAttribute;
	}
	
	public String getDescription() {
		return description;
	}
	
//it works like finally block in exceptions
	@PostConstruct
	protected void init() {
		
	}

}
