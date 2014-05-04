package com.simplestore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.simplestore.service.CategoryService;
import com.simplestore.domain.Category;

@Controller
@RequestMapping("/category")
public class CategoryController {
	private CategoryService categoryService;

	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("categories",
				this.categoryService.getAllCategories());
		return "category/list";
	}

	@RequestMapping(value = "details/{categoryId}", method = RequestMethod.GET)
	public String details(@PathVariable int categoryId, Model model) {
		model.addAttribute("category",
				this.categoryService.getCategoryByCategoryId(categoryId));
		return "category/details";
	}

	@RequestMapping(value = "create", method = RequestMethod.GET)
	public String create(Model model) {
		model.addAttribute("category", new Category());
		return "category/create";
	}

	@RequestMapping(value = "create", method = RequestMethod.POST)
	public String create(@ModelAttribute("category") Category category,
			BindingResult result) {
		this.categoryService.save(category);
		return "redirect:create";
	}

	@RequestMapping(value = "edit/{categoryId}", method = RequestMethod.GET)
	public String edit(@PathVariable int categoryId, Model model) {
		model.addAttribute("category",
				this.categoryService.getCategoryByCategoryId(categoryId));
		return "category/edit";
	}

	@RequestMapping(value = "edit/{categoryId}", method = RequestMethod.POST)
	public String edit(@ModelAttribute("category") Category category,
			BindingResult result) {
		this.categoryService.update(category);
		return "redirect:../../category";
	}

	@RequestMapping(value = "delete/{categoryId}", method = RequestMethod.GET)
	public String delete(@PathVariable int categoryId, Model model) {
		model.addAttribute("category",
				this.categoryService.getCategoryByCategoryId(categoryId));
		return "category/delete";
	}

	@RequestMapping(value = "confirmDelete/{categoryId}", method = RequestMethod.GET)
	public String confirmDelete(@PathVariable int categoryId) {
		this.categoryService.delete(this.categoryService
				.getCategoryByCategoryId(categoryId));
		return "redirect:../../category";
	}
}
