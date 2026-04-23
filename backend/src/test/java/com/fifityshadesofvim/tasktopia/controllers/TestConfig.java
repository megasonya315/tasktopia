package com.fifityshadesofvim.tasktopia.controllers;

import com.fifityshadesofvim.tasktopia.mappers.TaskListMapper;
import com.fifityshadesofvim.tasktopia.mappers.TaskMapper;
import com.fifityshadesofvim.tasktopia.services.TaskListService;
import com.fifityshadesofvim.tasktopia.services.TaskService;
import org.mockito.Mockito;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class TestConfig {

    @Bean
    public TaskListService taskListService() {
        return Mockito.mock(TaskListService.class);
    }

    @Bean
    public TaskListMapper taskListMapper() {
        return Mockito.mock(TaskListMapper.class);
    }

    @Bean
    public TaskService taskService() {
        return Mockito.mock(TaskService.class);
    }

    @Bean
    public TaskMapper taskMapper() {
        return Mockito.mock(TaskMapper.class);
    }
}