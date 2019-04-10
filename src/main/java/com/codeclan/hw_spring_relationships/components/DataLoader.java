package com.codeclan.hw_spring_relationships.components;

import com.codeclan.hw_spring_relationships.models.File;
import com.codeclan.hw_spring_relationships.models.Folder;
import com.codeclan.hw_spring_relationships.models.User;
import com.codeclan.hw_spring_relationships.repository.FileRepository;
import com.codeclan.hw_spring_relationships.repository.FolderRepository;
import com.codeclan.hw_spring_relationships.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {


    @Autowired
    UserRepository userRepo;

    @Autowired
    FolderRepository folderRepo;

    @Autowired
    FileRepository fileRepo;

    public void run(ApplicationArguments args){

    User user1 = new User("Aaron");
    User user2 = new User("Brenda");
    User user3 = new User("Coleen");
        userRepo.save(user1);
        userRepo.save(user2);
        userRepo.save(user3);

    Folder folder1 = new Folder("IT", user3);
    Folder folder2 = new Folder("HR", user2);
    Folder folder3 = new Folder("Finance", user1);
        folderRepo.save(folder1);
        folderRepo.save(folder2);
        folderRepo.save(folder3);

    File file1 = new File("Secret Password File", ".pwd", 250, folder1);
    File file2 = new File("Disciplinary Report", ".docx", 300, folder2);
    File file3 = new File("Staff Salary Report", ".xlsx", 435, folder3);
        fileRepo.save(file1);
        fileRepo.save(file2);
        fileRepo.save(file3);
    }

}
