package ru.gb.oop.service;

import ru.gb.oop.model.User;

import java.util.List;

public interface DataService {
        User create(User user);
        List<User> read();

}
