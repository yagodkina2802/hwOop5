package ru.gb.oop.service;



import ru.gb.oop.model.Student;
import ru.gb.oop.model.Teacher;
import ru.gb.oop.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService {
    List<User> listUser;

    public UserService() {
        this.listUser = new ArrayList<>();
    }

    @Override
    public User create(User user) {
        if (user instanceof Student) {
            int id = maxStudentId();
            listUser.add(new Student(user.getAge(), user.getName(), id));
        } else {
            int id = maxTeacherId();
            listUser.add(new Teacher(user.getAge(), user.getName(), id));
        }

        return listUser.get(listUser.size()-1);
    }

    private int maxStudentId() {
        for (int i = listUser.size() - 1; i > -1; i--) {
            if (listUser.get(i) instanceof Student) {
                return i+1;
            }
        }
        return 0;
    }

    private int maxTeacherId() {
        for (int i = listUser.size() -1; i > -1; i--) {
            if (listUser.get(i) instanceof Teacher) {
                return i+1;
            }
        }
        return 0;
    }

    @Override
    public List<User> read() {
        return listUser;
    }
}
