package com.example.login.login3.database;


import com.example.login.login3.model.User;
import com.example.login.login3.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
@Configuration
public class Database {
    private static final Logger logger =LoggerFactory.getLogger(Database.class);
//    @Bean
//    CommandLineRunner initDatabase(UserRepository userRepository){
//        return new CommandLineRunner() {
//            @Override
//            public void run(String... args) throws Exception {
//                User user1=new User("Trinh loc",12345);
//                User user2=new User("Trinh linh",34567);
//                logger.info("insert data: "+userRepository.save(user1));
//                logger.info("insert data: "+userRepository.save(user2));
//            }
//        };
//    }
}
