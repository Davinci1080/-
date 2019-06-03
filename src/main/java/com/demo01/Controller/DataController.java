package com.demo01.Controller;

import com.demo01.pojo.data;
import com.demo01.service.dataService;
import com.demo01.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataController {
    @Autowired
    private dataService dataservice;

    @RequestMapping("insertdata")
    public ResultVo add(data da){
        return dataservice.insertdata(da);
    }
    @RequestMapping("updatedata")
    public ResultVo update(data da){
        return dataservice.updatedata(da);
    }

    @RequestMapping("datasomedata")
    public ResultVo dete(int[] ids){
        for (int i = 0; i<ids.length;i++) {
            return dataservice.deletesome(i);
        }
        return null;
    }

}
