package com.hanymichaels.backend;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/products")
public class ProductController {

	private ProductRepository productRepository;

	public ProductController(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	@GetMapping
	public List<Product> getAll(){
		List<Product> products = this.productRepository.findAll();
		return products;
	}
	
	@PutMapping
	public String insert(@RequestBody Product product) {
		this.productRepository.insert(product);
		return "Done!";
	}
	
	@PostMapping
	public String update(@RequestBody Product product) {
		this.productRepository.save(product);
		return "Done!";
	}
	
	@GetMapping("/{id}")
	public Optional<Product> getById(@PathVariable("id") String id) {
//		Optional<Product> product = this.productRepository.findById(id);
//		return product;
		return this.productRepository.findById(id);
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable("id") String id) {
		this.productRepository.deleteById(id);
		return "Deleted entry with the ID: " + id;
	}
	
}
