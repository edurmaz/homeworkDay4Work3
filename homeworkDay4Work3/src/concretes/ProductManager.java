package concretes;

import abstracts.ProductService;
import entities.Product;

public class ProductManager implements ProductService {
	@Override
	public void add(Product product) {
		System.out.println("Oyun eklendi: " + product.getProductName());
	}

	@Override
	public void update(Product product) {
		System.out.println("Oyun g�ncellendi: " + product.getProductName());
	}

	@Override
	public void delete(Product product) {
		System.out.println("Oyun silindi: " + product.getProductName());
	}

	@Override
	public void getAll() {
		System.out.println("T�m oyunlar getirildi");
	}
}