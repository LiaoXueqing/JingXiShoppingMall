package com.example.JingXiShoppingMall.controlle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HelloWorldController {
    @GetMapping("index")
    public String helloWorld() {
        System.out.println("HelloWorldController");
        return "/index";
    }
    @GetMapping("welcome")
    public String welcome() {
        System.out.println("welcome");
        return "/welcome";
    }
    /*
    product API

    创建新商品
    "url": "http://{{IP}}:{{port}}/products",
	"method": "POST",
	"raw":"{\n\t\"name\": \"test1\",\n\t\"description\": \"test\",\n\t\"price\": 20\n}"

    修改商品信息
    "url": "http://{{IP}}:{{port}}/products/1",
	"method": "PUT",
	"raw": "{\n\t\"name\": \"test666\",\n\t\"description\": \"test\",\n\t\"price\": 1000\n}"

	根据商品id查找商品
	"url": "http://{{IP}}:{{port}}/products/1",
	"method": "GET",

	查找所有商品
	"url": "http://{{IP}}:{{port}}/products",
	"method": "GET",

	按照name查找商品
	"url": {"raw": "http://{{IP}}:{{port}}/products?name=方便面",...},
	"method": "GET",

	根据name和描述模糊查询
	"url":{"raw":"http://{{IP}}:{{port}}/products?name=方便面&description=师",...},
	"method": "GET",

	---------------------------------------------------------------------------------
	---------------------------------------------------------------------------------

	order API

	创建订单
	"url": "http://{{IP}}:{{port}}/orders",
	"method": "POST",
	"raw": "[\n\t{\n\t   \"productId\":1,\n\t   \"purchaseCount\":3\n\t},\t\n\t{\n\t   \"productId\":2,\n\t   \"purchaseCount\":1\n\t},\n\t{\n\t   \"productId\":3,\n\t   \"purchaseCount\":5\n\t}\n]"

    支付订单
    "url": {"raw": "http://{{IP}}:{{port}}/orders/1?orderStatus=paid",...}
    "method": "PUT",

    撤销订单
    "url": {"raw": "http://{{IP}}:{{port}}/orders/5?orderStatus=withdrawn",...}
    "method": "PUT",

    查看订单信息
    "url": "http://{{IP}}:{{port}}/orders/1",
	"method": "GET",

	根据用户Id查看订单
	"url": {"raw": "http://{{IP}}:{{port}}/orders?userId=1",...}
	"method": "GET",

	---------------------------------------------------------------------------------
	---------------------------------------------------------------------------------

	LogisticsRecord API

	查看物流详情
	"url": "http://{{IP}}:{{port}}/logisticsRecords/1",
	"method": "GET",

	发货
	"url": {"raw": "http://{{IP}}:{{port}}/logisticsRecords/1/orders/1?logisticsStatus=shipping",...}
	"method": "PUT",

	签收货物
	"url": {"raw": "http://{{IP}}:{{port}}/logisticsRecords/1/orders/1?logisticsStatus=signed",...}
	"method": "PUT",

	---------------------------------------------------------------------------------
	---------------------------------------------------------------------------------

	inventory API

	修改库存数量
	"url": "http://{{IP}}:{{port}}/inventories/1",
	"method": "PUT",











    */
}
