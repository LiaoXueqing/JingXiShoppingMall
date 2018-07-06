package com.example.JingXiShoppingMall.controlle;

import com.example.JingXiShoppingMall.entity.Product;
import com.example.JingXiShoppingMall.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    /**
     * 创建新商品
     * @return
     */
    @PostMapping()
    public ResponseEntity addProduct(@RequestBody Product product) throws Exception {
        productRepository.save(product);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    /**
     * 修改商品信息
     */
    @PutMapping("/{id}")
    public ResponseEntity updateProduct(@PathVariable Long id,@RequestBody Product newProduct){
        //name,description,price
        Product p = productRepository.getOne(id);
        p.setName(newProduct.getName());
        p.setDescription(newProduct.getDescription());
        p.setPrice(newProduct.getPrice());
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    /**
     * 根据商品id查找商品
     */
    @GetMapping("/{id}")
    public ResponseEntity getProductById(@PathVariable Long id) throws Exception {
        Product p = productRepository.getOne(id);
        return new ResponseEntity(p, HttpStatus.OK);
    }
    /**
     * 查找所有商品
     */
    @GetMapping("")
    public ResponseEntity getProducts(){
        return new ResponseEntity(productRepository.findAll(), HttpStatus.OK);
    }
    /**
     * 按照name查找商品
     * "http://{{IP}}:{{port}}/products?name=方便面"
     */
    @GetMapping("?name={name}")
    public String getProductByName(){
        return null;
    }
    /**
     * 根据name和描述模糊查询
     * "http://{{IP}}:{{port}}/products?name=方便面&description=师"
     */
    @GetMapping("?name={name}&description={d}")
    public String getProductByNameAndDescription(){
        return null;
    }
}
