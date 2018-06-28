/*package com.thinkxfactor.zomatoplus.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.Items;
import com.thinkxfactor.zomatoplus.models.Restaurant;
import com.thinkxfactor.zomatoplus.models.User;
import com.thinkxfactor.zomatoplus.repo.RestaurantRepository;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
	
	@PostMapping("/create")
	public Restaurant create(@RequestBody Restaurant user) {
		System.out.println(user.toString());
		
		return user;
	}
	
	
	/*@GetMapping("/getall")
	public List<Restaurant> userLogin() {
		Restaurant user1=new Restaurant("1","Arsalan","2654");
		Restaurant user2=new Restaurant("2","McDonalds","8952");
		Restaurant user3=new Restaurant("3","Dominos","12365");
		List userList=new ArrayList<>();
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		return userList;
	}
	@PostMapping("/createItems")
	public Items createItems(@RequestBody Items User) {
		System.out.println(User.toString());
		return User;
	}
	
	@PostMapping("/add")
	public User addUser(@RequestBody Restaurant res) {
		Restaurant persistedRes=restaurantRepository.save(res);
		return persistedRes;
	}
	
}*/
package com.thinkxfactor.zomatoplus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.Restaurant;
import com.thinkxfactor.zomatoplus.repo.RestaurantRepository;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
	
	@Autowired
	private RestaurantRepository restaurantRepository;
	
	@PostMapping("/add")
	public Restaurant addrestaurant(@RequestBody Restaurant restaurant)
	{
		Restaurant persistedRestaurant=restaurantRepository.save(restaurant);
		return persistedRestaurant;
	}

	
}
	

