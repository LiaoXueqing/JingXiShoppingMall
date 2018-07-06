package com.example.JingXiShoppingMall.controlle;

import com.example.JingXiShoppingMall.entity.User;
import com.example.JingXiShoppingMall.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    /**
     * 创建新用户
     * @return
     */
    @PostMapping()
    public ResponseEntity addUser(@RequestBody User user) throws Exception {
        userRepository.save(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    /**
     * 修改用户信息
     */
    @PutMapping("/{id}")
    public ResponseEntity updateUser(@PathVariable Long id,@RequestBody User newUser){
        User u = userRepository.getOne(id);
        u.setName(newUser.getName());
        u.setAddress(newUser.getAddress());
        u.setPhone(newUser.getPhone());
        u.setRole(newUser.getRole());
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    /**
     * 根据id查找用户
     */
    @GetMapping("/{id}")
    public ResponseEntity getUserById(@PathVariable Long id) throws Exception {
        User u = userRepository.getOne(id);
        return new ResponseEntity(u, HttpStatus.OK);
    }
    /**
     * 查找所有用户
     */
    @GetMapping("")
    public ResponseEntity getUsers(){
        return new ResponseEntity(userRepository.findAll(), HttpStatus.OK);
    }
}
