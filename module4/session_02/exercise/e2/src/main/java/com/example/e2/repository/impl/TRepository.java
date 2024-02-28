package com.example.e2.repository.impl;

import com.example.e2.repository.IRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class TRepository implements IRepository {
     private  static Map<String,String> map = new HashMap<>();
    static {
        map.put("hello","xin chao");
        map.put("monkey","con khi");
        map.put("orange","qua cam");
    }

    @Override
    public String check_tr(String s) {
        String result ="";
        if(map.containsKey(s))
        {
            result =map.get(s);
        }else {
            result = "not translate this word !!!";
        }
        return result;
    }
}
