//
//package com.adobe.secondProject.core.models;
//
//import org.apache.sling.api.SlingHttpServletRequest;
//import org.apache.sling.models.annotations.DefaultInjectionStrategy;
//import org.apache.sling.models.annotations.Model;
//import org.apache.sling.models.annotations.injectorspecific.OSGiService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import com.adobe.secondProject.core.service.ResolverIDEMO;
//
//@Model(adaptables = SlingHttpServletRequest.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
//public class ResolverModel {
//
//	private final Logger LOG = LoggerFactory.getLogger(getClass());
//
//	@OSGiService
//	ResolverIDEMO resolverIDEMO;
//
//	public String getPageName() {
//		LOG.info("This is from Model" + resolverIDEMO.getPageName());
//		return resolverIDEMO.getPageName();
//	}
//
//	public String getLastModifiedBy() {
//		return resolverIDEMO.getLastModifiedBy();
//	}
//
//	public String getPageTitle() {
//		return resolverIDEMO.getPageTitle();
//	}
//
//	public String getPath() {
//		return resolverIDEMO.getPath();
//	}
//
//	public String getTitle() {
//		return resolverIDEMO.getTitle();
//	}
//
//	public String getVanityURL() {
//		return resolverIDEMO.getVanityURL();
//	}
//
//	public String getDepth() {
//		return resolverIDEMO.getDepth();
//	}
//
//	public String getParentPageName() {
//		return resolverIDEMO.getParentPageName();
//	}
//
//}
