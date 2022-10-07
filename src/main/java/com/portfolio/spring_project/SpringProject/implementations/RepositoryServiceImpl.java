package com.portfolio.spring_project.SpringProject.implementations;

import com.portfolio.spring_project.SpringProject.models.RepositoryService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class RepositoryServiceImpl  implements RepositoryService {


    @Override
    public Object findRepository(String nameRepos, String nameOwner) {
        RestTemplate restTemplate = new RestTemplate();

        Object repository = restTemplate.getForObject("https://api.github.com/repos/"+nameOwner+"/"+nameRepos, Object.class);

        return repository;
    }

    @Override
    public List<Object> getRepos(String nameOwner) {
        RestTemplate restTemplate = new RestTemplate();

        Object[] repos = restTemplate.getForObject("https://api.github.com/users/"+nameOwner+"/repos", Object[].class);

        return Arrays.asList(repos);
    }
}
