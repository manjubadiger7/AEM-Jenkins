package com.adobe.secondProject.core.models;

import java.util.List;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;

import com.adobe.secondProject.core.service.CsvFileReaderService;

@Model(adaptables = SlingHttpServletRequest.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CsvFilereaderImpl {

	@OSGiService
	CsvFileReaderService csvFileReaderService;

	public List<String> getList() {
		return csvFileReaderService.getPage();
	}
}
