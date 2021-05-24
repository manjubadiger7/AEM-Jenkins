// page props assignment




//package com.adobe.secondProject.core.service;
//
//import java.util.HashMap;
//
//import java.util.Map;
//
//import org.apache.sling.api.resource.LoginException;
//import org.apache.sling.api.resource.ResourceResolver;
//import org.apache.sling.api.resource.ResourceResolverFactory;
//import org.osgi.service.component.annotations.Activate;
//import org.osgi.service.component.annotations.Component;
//import org.osgi.service.component.annotations.Modified;
//import org.osgi.service.component.annotations.Reference;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import com.day.cq.wcm.api.Page;
//
//@Component(service = ResolverIDEMO.class, immediate = true)
//public class ResolverIDEMO {
//
//	private final Logger LOG = LoggerFactory.getLogger(getClass());
//
//	public static final String SERVICE_USER = "newVariable";
//
//	@Reference
//	ResourceResolverFactory resolverFactory;
//
//	String pageName;
//	String lastModifiedBy;
//	String pageTitle;
//	String path;
//	String title;
//	String vanityURL;
//	int depth;
//	Page parentPage;
//	String parentPageName;
//
//	@Activate
//	@Modified
//	public void activate() throws LoginException {
//		Map<String, Object> paramMap = new HashMap<String, Object>();
//
//		paramMap.put(ResourceResolverFactory.SUBSERVICE, SERVICE_USER);
//
//		try {
//			ResourceResolver resolver = resolverFactory.getServiceResourceResolver(paramMap);
//
//			org.apache.sling.api.resource.Resource resource = resolver
//					.getResource("/content/demoTraining/en/home-page");
//
//			Page page = resource.adaptTo(Page.class);
//
//			pageName = page.getName();
//			lastModifiedBy = page.getLastModifiedBy();
//			pageTitle = page.getPageTitle();
//			path = page.getPath();
//			title = page.getTitle();
//			vanityURL = page.getVanityUrl();
//			depth = page.getDepth();
//			parentPage = page.getParent();
//
//			parentPageName = parentPage.getName();
//
//			LOG.info("this is page Name:------------" + pageName);
//			LOG.info("this is page lastModifiedBy:------------" + lastModifiedBy);
//			LOG.info("this is page pageTitle:------------" + pageTitle);
//			LOG.info("this is page path:------------" + path);
//			LOG.info("this is page title:------------" + title);
//			LOG.info("this is page vanityURL:------------" + vanityURL);
//			LOG.info("this is page depth:------------" + depth);
//			LOG.info("this is page parentPageName:------------" + parentPageName);
//
//		} catch (Exception e) {
//			LOG.info("Exception" + e);
//		}
//
//	}
//
//	public String getPageName() {
//		return pageName;
//	}
//
//	public String getLastModifiedBy() {
//		return pageName;
//	}
//
//	public String getPageTitle() {
//		return pageName;
//	}
//
//	public String getPath() {
//		return pageName;
//	}
//
//	public String getTitle() {
//		return pageName;
//	}
//
//	public String getVanityURL() {
//		return pageName;
//	}
//
//	public String getDepth() {
//		return pageName;
//	}
//
//	public String getParentPageName() {
//		return pageName;
//	}
//
//}