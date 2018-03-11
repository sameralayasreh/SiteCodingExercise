package com.test.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.test.dto.offersvcExpedia;

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/")
	public ModelAndView index(@RequestParam(name = "regionID", required = false) String regionID,
			@RequestParam(name = "destinationCity", required = false) String destinationCity,
			@RequestParam(name = "minTripStartDate", required = false) String minTripStartDate,
			@RequestParam(name = "lengthOfStay", required = false) String lengthOfStay,
			@RequestParam(name = "maxStarRating", required = false) String maxStarRating) {
		ModelAndView mv = new ModelAndView("home");
		Map<String, String> map = new HashMap<String, String>();
		map.put("regionID", regionID);
		map.put("destinationCity", destinationCity);
		map.put("minTripStartDate", minTripStartDate);
		map.put("lengthOfStay", lengthOfStay);
		map.put("maxStarRating", maxStarRating);

		RestTemplate restTemplate = new RestTemplate();
		MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
		mappingJackson2HttpMessageConverter
				.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON, MediaType.APPLICATION_OCTET_STREAM));
		restTemplate.getMessageConverters().add(mappingJackson2HttpMessageConverter);

		String initUrl = "https://offersvc.expedia.com/offers/v2/getOffers?"
				+ "scenario=deal-finder&page=foo&uid=foo&productType=Hotel";

		for (Map.Entry<String, String> entry : map.entrySet()) {
			if(entry.getValue() != null && !entry.getValue().isEmpty()) {
				initUrl = initUrl+ "&" + entry.getKey() + "=" + entry.getValue();
			}
		}
		System.out.println("initUrl: " + initUrl);
		offersvcExpedia offersExp = restTemplate.getForObject(initUrl, offersvcExpedia.class);
		mv.addObject("title", "Expidia Exc");
		mv.addObject("offerInfo", offersExp.offerInfo);
		mv.addObject("offersExp", offersExp.userInfo);
		mv.addObject("hotels", offersExp.offers.hotel);

		return mv;
	}
}
