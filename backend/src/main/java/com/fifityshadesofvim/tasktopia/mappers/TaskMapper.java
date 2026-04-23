package com.fifityshadesofvim.tasktopia.mappers;

import com.fifityshadesofvim.tasktopia.domain.dto.TaskDto;
import com.fifityshadesofvim.tasktopia.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);

}
