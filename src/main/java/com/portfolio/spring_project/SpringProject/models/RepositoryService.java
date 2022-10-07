package com.portfolio.spring_project.SpringProject.models;

import java.util.List;

public interface RepositoryService {

    Object findRepository(final String nameRepos, final String nameOwner);

    List<Object> getRepos(final String nameOwner);

}
