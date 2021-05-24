package com.adobe.secondProject.core.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.sling.api.resource.LoginException;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.day.cq.dam.api.Asset;
import com.day.cq.dam.api.Rendition;

public class CsvFileReaderService {

	@Reference
	ResourceResolverFactory resourceResolverFactory;

	private final Logger LOG = LoggerFactory.getLogger(getClass());

	public static final String SERVICE_NAME = "variableName";

	ResourceResolver resourceResolver = null;

	@Activate
	@Modified
	public void activate() {
		LOG.info("The control is coming inside the ResourceResolver and the bundle is activated!");
		Map<String, Object> map = new HashMap<>();
		map.put(ResourceResolverFactory.SUBSERVICE, SERVICE_NAME);
		try {
			resourceResolver = resourceResolverFactory.getServiceResourceResolver(map);
			
			LOG.info("Resource Resolver registered");
		} catch (LoginException e) {
			LOG.error("Error:" + e.getMessage());
		}
		
	}

	public List<String> getPage() {
		LOG.info("getPage methos activated");
		List<String> lines = new ArrayList<String>();

		try {
			// String path = "/content/dam/demoTraining/CSV/Sample-Spreadsheet-10-rows.csv";

			Resource resource = resourceResolver
					.getResource("/content/dam/demoTraining/CSV/Sample-Spreadsheet-10-rows.csv");

			Asset asset = resource.adaptTo(Asset.class);
			Rendition rendition = asset.getOriginal();
			InputStream inputStream = rendition.adaptTo(InputStream.class);

			try (BufferedReader bufferReader = new BufferedReader(new InputStreamReader(inputStream))) {
				String line = "";
				while ((line = bufferReader.readLine()) != null) {
					LOG.info(line);
					lines.add(line);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			LOG.info(e.getMessage());
		}
		return lines;

	}

}
