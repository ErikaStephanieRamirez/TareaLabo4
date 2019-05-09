package com.uca.capas.controller;

import java.text.SimpleDateFormat;
import java.util.*;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Producto;

@Controller
public class MainController {
	@RequestMapping("/")
	public ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
		Producto producto=new Producto();
		
		mav.addObject("message", "Ingrese un producto");
		mav.addObject("producto",producto);
		mav.setViewName("main");
		return mav;
	}
	
	@RequestMapping("/formData")
	public ModelAndView form(@Valid @ModelAttribute Producto producto,BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if(result.hasErrors()) {
			mav.setViewName("main");
		}else {
			mav.addObject("message","El producto a sido agregado");
			mav.addObject("producto",producto);
			mav.setViewName("form");
		}
		return mav;
	}
}
