package com.fifityshadesofvim.tasktopia.domain.dto;

import com.fifityshadesofvim.tasktopia.domain.entities.TaskPriority;
import com.fifityshadesofvim.tasktopia.domain.entities.TaskStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDateTime dueDate,
        TaskPriority priority,
        TaskStatus status
) {
}
