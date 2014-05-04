package com.simplestore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.simplestore.service.CategoryService;
import com.simplestore.service.ProductService;
import com.simplestore.domain.Product;

@Controller
@RequestMapping("product")
public class ProductController {
	private CategoryService categoryService;
	private ProductService productService;

	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("products", this.productService.getAllProducts());
		return "product/list";
	}

	@RequestMapping(value = "details/{productId}", method = RequestMethod.GET)
	public String details(@PathVariable int productId, Model model) {
		model.addAttribute("product",
				this.productService.getProductByProductId(productId));
		return "product/details";
	}

	@RequestMapping(value = "create", method = RequestMethod.GET)
	public String create(Model model) {
		model.addAttribute("product", new Product());
		model.addAttribute("categories",
				this.categoryService.getAllCategories());
		return "product/create";
	}

	@RequestMapping(value = "create", method = RequestMethod.POST)
	public String create(@ModelAttribute("product") Product product,
			BindingResult result) {
		product.setCategory(this.categoryService
				.getCategoryByCategoryId(product.getCategory().getCategoryId()));
		this.productService.save(product);
		return "redirect:create";
	}

	@RequestMapping(value = "edit/{productId}", method = RequestMethod.GET)
	public String edit(@PathVariable int productId, Model model) {
		model.addAttribute("product",
				this.productService.getProductByProductId(productId));
		model.addAttribute("categories",
				this.categoryService.getAllCategories());
		return "product/edit";
	}

	@RequestMapping(value = "edit/{productId}", method = RequestMethod.POST)
	public String edit(@ModelAttribute("product") Product product,
			BindingResult result) {
		product.setCategory(this.categoryService
				.getCategoryByCategoryId(product.getCategory().getCategoryId()));
		this.productService.update(product);
		return "redirect:../../product";
	}

	@RequestMapping(value = "delete/{productId}", method = RequestMethod.GET)
	public String delete(@PathVariable int productId, Model model) {
		model.addAttribute("product",
				this.productService.getProductByProductId(productId));
		return "product/delete";
	}

	@RequestMapping(value = "confirmDelete/{productId}", method = RequestMethod.GET)
	public String confirmDelete(@PathVariable int productId) {
		this.productService.delete(this.productService
				.getProductByProductId(productId));
		return "redirect:../../product";
	}
}
