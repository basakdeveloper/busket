package com.basak.busket.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.basak.busket.model.Item;
import com.basak.busket.service.ItemService;

@Controller
public class BusketController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/")
	public ModelAndView index() {
		Item item = new Item();
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("item", item);
		modelAndView.addObject("items", itemService.getItems());
		
		modelAndView.setViewName("home");
		return modelAndView;
	}
	
	@RequestMapping(value = "/addItem", method = RequestMethod.POST)
	public ModelAndView addItem(@Valid Item item, BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView();
		
//		if (userExists != null) {
//			bindingResult
//					.rejectValue("email", "error.user",
//							"There is already a user registered with the email provided");
//		}
		if (bindingResult.hasErrors()) {
			// TODO
		} else {
			itemService.saveItem(item);
			modelAndView.addObject("successMessage", "New Item has been added successfully");
			modelAndView.setViewName("redirect:/");
		}		
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/deleteItem/{id}", method = RequestMethod.POST)
	public ModelAndView deleteItem(@PathVariable int id) {
		ModelAndView modelAndView = new ModelAndView();

		itemService.deleteItem(id);
		modelAndView.addObject("successMessage", "Item deleted successfully");
		modelAndView.setViewName("redirect:/");	
		
		return modelAndView;
	}
}
