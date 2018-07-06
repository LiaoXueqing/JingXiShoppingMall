package com.example.JingXiShoppingMall.controlle;

import com.example.JingXiShoppingMall.repository.LogisticsRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("logisticsRecords")
public class LogisticsRecordController {
    @Autowired
    private LogisticsRecordRepository logisticsRecordRepository;
    /**
     * 查看物流信息
     */
    @GetMapping("/{id}")
    public ResponseEntity getLogisticsRecordById(@PathVariable Long id) throws Exception{
        return new ResponseEntity(logisticsRecordRepository.getOne(id), HttpStatus.OK);
    }
    /**
     * 修改快递单：发货，签收
     */
    @PutMapping("/{id}/orders/{oid}?logisticsStatus={status}")
    public String shippingLogisticsRecord(@PathVariable Long id,@PathVariable Long oid,@PathVariable String status) throws Exception{
        //发货shipping
        //签收signed
        return null;
    }


}
