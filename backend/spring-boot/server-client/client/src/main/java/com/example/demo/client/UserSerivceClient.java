package com.example.demo.client;


import com.example.demo.dto.UserDto;
import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class UserSerivceClient {


    @Autowired
    RestTemplate restTemplate;

    public List<UserDto> getAllUsers() throws JSONException {

        String object = restTemplate.getForObject("http://localhost:8080/users", String.class);
        JSONArray jsonArray = new JSONArray(object);


        List<UserDto> userDtos = new ArrayList<>();
        Gson gson = new Gson();
        for (int i = 0; i < jsonArray.length(); i++) {
            UserDto userDto = gson.fromJson(String.valueOf(jsonArray.get(i)), UserDto.class);
            userDtos.add(userDto);
        }

        return userDtos;


    }

    public UserDto findUser(String nationalCode){
        Map<String,String> map = new HashMap<>();
        map.put("nationalCode",nationalCode);
        UserDto user = restTemplate
                .getForObject("http://localhost:8080/users/{nationalCode}", UserDto.class,map);
        return user;
    }


}
