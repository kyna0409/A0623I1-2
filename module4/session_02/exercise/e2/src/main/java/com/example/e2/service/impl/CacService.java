package com.example.e2.service.impl;

import com.example.e2.service.IService;
import org.springframework.stereotype.Service;

@Service
public class CacService implements IService {
    @Override
    public String  caculate(Integer numberOne, Integer numberTwo, String operator) {
        String result="";
        if(operator.equals("/"))
        {
            if(numberTwo!=0){
                result = String.valueOf(numberOne/numberTwo);
            }else {
                result ="invalid";
            }
        }else if(operator.equals("-"))
        {
            result = String.valueOf(numberOne-numberTwo);
        }else  if(operator.equals("+"))
        {
            result = String.valueOf(numberOne+numberTwo);
        }else if(operator.equals("*")){
            result = String.valueOf(numberOne*numberTwo);
        }
        return result;
    }
}
