package ru.itis.shop.app;

import ru.itis.shop.user.api.UserConsoleOperations;
import ru.itis.shop.user.application.UserService;
import ru.itis.shop.user.infrastructure.persistence.UserFileRepository;
import ru.itis.shop.user.infrastructure.persistence.UserMapper;

public class Main {
    public static void main(String[] args) {
        UserMapper userMapper = new UserMapper();
        UserFileRepository userFileRepository = new UserFileRepository("Task2/users.txt", userMapper);
        UserService userService = new UserService(userFileRepository);

        UserConsoleOperations operations = new UserConsoleOperations(userService);

        while(true) {
            operations.showMenu();
        }
    }
}
