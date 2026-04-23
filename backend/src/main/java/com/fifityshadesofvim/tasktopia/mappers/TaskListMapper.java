package com.fifityshadesofvim.tasktopia.mappers;

import com.fifityshadesofvim.tasktopia.domain.dto.TaskListDto;
import com.fifityshadesofvim.tasktopia.domain.entities.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList);
}
