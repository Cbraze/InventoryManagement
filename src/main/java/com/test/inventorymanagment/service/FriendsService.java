package com.test.inventorymanagment.service;

import com.test.inventorymanagment.entity.Friend;
import com.test.inventorymanagment.repository.FriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FriendsService {


    @Autowired
    FriendRepository repo;

    public Friend getFriend(Long id) {
        return repo.findById(id).get();
    }

        public Iterable<Friend> getFriends() {
            return repo.findAll();
        }

        public void deleteFriend(Long id) {
            repo.deleteById(id); //if null handle exception void for now
        }

        public Friend updateFriend(Long id, Friend friend) {
        Friend foundFriend = repo.findById(id).get(); //GEEEEEEEEEEEEEEEEEEEEEEEEEEET
        if (foundFriend != null) {
            foundFriend.setFirstName(friend.getFirstName());
            foundFriend.setLastName(friend.getLastName());
            foundFriend.setPhoneNumber(friend.getPhoneNumber());
            return repo.save(foundFriend);
        }
        return foundFriend;
        }

        public Friend createFriend(Friend friend) {
            return repo.save(friend);
        }

}
