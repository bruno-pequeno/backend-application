package com.unlockway.backendapplication.api.controllers;

import com.unlockway.backendapplication.api.dto.CreateFoodDTO;
import com.unlockway.backendapplication.api.dto.CreateUserDTO;
import com.unlockway.backendapplication.api.dto.FoodDTO;
import com.unlockway.backendapplication.api.dto.UserDTO;
import com.unlockway.backendapplication.api.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/food")
public class FoodController {

    @Autowired
    FoodService foodService;

    @GetMapping(value = "/data")
    public List<FoodDTO> findAll(){
        List<FoodDTO> result = foodService.findAll();

        return result;
    }
    @GetMapping(value = "/{id}")
    public List<FoodDTO> findById(@PathVariable int id){
        List<FoodDTO> result = foodService.findById(id);

        return result;
    }
    @PostMapping(value = "/new")
    public FoodDTO createFood(@RequestBody CreateFoodDTO createFoodDTO) {
        FoodDTO createdFood = foodService.createFood(createFoodDTO);
        return createdFood;
    }
}