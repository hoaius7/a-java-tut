package chapter05.forkjoin01;

import java.util.ArrayList;
import java.util.List;

/**
 * This class generates a product list of a determined size.
 */
public class ProductListGenerator {

  public List<Product> generate(int size) {
    List<Product> ret = new ArrayList<>();

    for (int i = 0; i < size; i++) {
      Product product = new Product();
      product.setName("Product " + i);
      product.setPrice(10);
      ret.add(product);
    }

    return ret;
  }
}
