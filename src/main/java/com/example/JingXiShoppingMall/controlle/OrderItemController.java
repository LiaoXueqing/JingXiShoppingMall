package com.example.JingXiShoppingMall.controlle;

import com.example.JingXiShoppingMall.entity.OrderItem;
import com.example.JingXiShoppingMall.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("orders")
public class OrderItemController {
    @Autowired
    private OrderItemRepository orderRepository;
    /**
     * 新增：创建订单
     */
    @PostMapping("")
    public ResponseEntity addOrder(@RequestBody OrderItem order) throws Exception {
        orderRepository.save(order);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    /**
     * 修改：支付订单、撤销订单
     */
    @PutMapping("/{id}/orderStatus={status}")
    public ResponseEntity updateOrder(@PathVariable Long id,@PathVariable String status) throws Exception {
        //支付status = paid
        //撤销status = withdrawn
        OrderItem order = orderRepository.getOne(id);
        order.setOrderStatus(status);
        orderRepository.save(order);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @GetMapping("")
    public ResponseEntity getOrders(){
        return new ResponseEntity(orderRepository.findAll(), HttpStatus.OK);
    }
    /**
     * 查询：查看订单信息
     */
    @GetMapping("/{id}")
    public ResponseEntity getOrderById(@PathVariable Long id) throws Exception {
        return new ResponseEntity(orderRepository.getOne(id), HttpStatus.OK);
    }
    /**
     * 查询：根据用户Id查看订单
     */
    @GetMapping("/userId={userId}")
    public ResponseEntity getOrderByUserId(@PathVariable Long userId) throws Exception {
        System.out.println("userId="+userId);
        List<OrderItem> list = orderRepository.findByUserId(userId);
        System.out.println("getOrderByUserId"+list.toString());
        return new ResponseEntity(orderRepository.findByUserId(userId), HttpStatus.OK);
    }

}
