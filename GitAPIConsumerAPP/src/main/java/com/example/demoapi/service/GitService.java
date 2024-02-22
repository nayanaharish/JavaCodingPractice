package com.example.demoapi.service;

import com.example.demoapi.dto.GitUser;
import com.example.demoapi.repo.GitRepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GitService {

    @Autowired
    private GitRepo gitRepo;

    public Optional<GitUser> findByName(String name)
    {

        Optional<GitUser> byName = gitRepo.findByLogin(name);

        return byName;
    }

    public void addGitUser(GitUser user)
    {

        gitRepo.save(user);
    }
}
