package com.portfolio.spring_project.SpringProject.controller;

import com.portfolio.spring_project.SpringProject.models.RepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/repos/")
public class ReposController {

    @Autowired
    private RepositoryService repositoryService;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/findRepos/{nameOwner}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Object> getRepos(@PathVariable(value = "nameOwner") String nameOwner) {
        return  repositoryService.getRepos(nameOwner);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/{nameOwner}/{nameRepo}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Object findRepository(@PathVariable(value = "nameOwner") String nameOwner, @PathVariable(value = "nameRepo") String nameRepos) {
        return repositoryService.findRepository(nameRepos, nameOwner);
    }

}
