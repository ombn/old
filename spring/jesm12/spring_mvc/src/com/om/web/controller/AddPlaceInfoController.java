package com.om.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.om.web.dto.AddPlaceInfoDTO;

@Component
public class AddPlaceInfoController {

	public AddPlaceInfoController() {
		System.out.println(this.getClass().getSimpleName() + "Created...");
	}

	@RequestMapping(value = "/add.do", method = RequestMethod.POST)
	public ModelAndView onAdd(AddPlaceInfoDTO addPlaceInfoDTO, HttpServletRequest request) {
		System.out.println("calling onAdd from " + this.getClass().getSimpleName());
		System.out.println("addPlaceInfoDTO : \t" + addPlaceInfoDTO);

		ModelAndView modelAndView = new ModelAndView("/AddPlaceInfo.jsp");
		// modelAndView.addObject("place", addPlaceInfoDTO.getName());

		modelAndView.addObject("message", "Place was added successfully , " + addPlaceInfoDTO.getName());
		
		modelAndView.addObject("dto",addPlaceInfoDTO);
		return modelAndView;
	}

}
