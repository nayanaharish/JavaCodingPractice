package com.example.hotelapp.service;

import com.example.hotelapp.entity.GuestEntity;
import com.example.hotelapp.entity.Hotel;
import com.example.hotelapp.repos.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HotelAppService {

    @Autowired
    private GuestEntityRepo guestEntityRepo;
    @Autowired
    private AddressRepo addressRepo;
    @Autowired
    private OrdersRepo ordersRepo;
    @Autowired
    private ReviewRepo reviewRepo;
    @Autowired
    private HotelRepo hotelRepo;



    public void registerGuest(GuestEntity guest)
    {
        addressRepo.save(guest.getAddress());
        reviewRepo.saveAll(guest.getReviews());
        ordersRepo.saveAll(guest.getOrdersList());

        guestEntityRepo.save(guest);

    }

    public List<GuestEntity> displayAllGuest()
    {
      return   guestEntityRepo.findAll();
    }


}
