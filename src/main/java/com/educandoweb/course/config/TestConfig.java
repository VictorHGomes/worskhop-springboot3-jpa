package com.educandoweb.course.config;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria", "maria@gmail.com", "999999", "12345");
        User u2 = new User(null, "Naruto", "naruto@gmail.com", "888888", "67890");
        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
