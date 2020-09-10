package com.example.SpringTest.dao;

import com.example.SpringTest.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;


public interface UserDao  {
    List<User> getAll() throws SQLException;



    //getone

    List<User> getone(int id) throws SQLException;



    //CREATE

    void create(User user) throws SQLException;



    //UPDATE

    void update(User user, String id) throws SQLException;



    //DELETE

    public int delete(int id) throws SQLException;


}
