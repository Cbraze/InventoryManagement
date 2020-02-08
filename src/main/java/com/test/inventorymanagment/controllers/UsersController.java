package com.test.inventorymanagment.controllers;

import com.test.inventorymanagment.entity.Friend;
import com.test.inventorymanagment.service.FriendsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

    @RestController
    public class UsersController {

        @Autowired
        FriendsService service;

        @RequestMapping(value="/friends", method= RequestMethod.POST)
        public Friend addFriend(@RequestBody Friend friend) {
            return service.createFriend(friend);
        }
        @RequestMapping("/friends")
        public Iterable<Friend> getFriends() {
            return service.getFriends();
        }
        @RequestMapping("/friends/{id}")
        public Friend getFriend(@PathVariable Long id) {
            return service.getFriend(id);
        }

        @RequestMapping(value="/friends/{id}", method=RequestMethod.PUT)
        public Friend updateFriend(@PathVariable Long id, @RequestBody Friend friend) {
            return service.updateFriend(id, friend);
        }
        @RequestMapping(value="/friends/{id}", method=RequestMethod.DELETE)
        public void deleteFriend(@PathVariable Long id) {
            service.deleteFriend(id);
        }
}
