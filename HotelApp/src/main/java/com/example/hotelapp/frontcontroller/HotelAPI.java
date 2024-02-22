package com.example.hotelapp.frontcontroller;

import com.example.hotelapp.entity.GuestEntity;
import com.example.hotelapp.service.HotelAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelAPI {

    @Autowired
    private HotelAppService hotelAppService;

    @PostMapping("/register/guest")
    public String  registerGuest(@RequestBody  GuestEntity guest )
    {
        hotelAppService.registerGuest(guest);
        return "Added guest successfully";
    }

    @GetMapping("/view/all/guest")
    public List<GuestEntity> DisplayAllGuest()
    {
       return hotelAppService.displayAllGuest();
    }
}

