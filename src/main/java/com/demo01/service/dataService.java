package com.demo01.service;

import com.demo01.pojo.data;
import com.demo01.vo.ResultVo;

import java.util.List;

public interface dataService {
    ResultVo insertdata(data da);

    ResultVo updatedata(data da);

    ResultVo deletesome(int id);
}
