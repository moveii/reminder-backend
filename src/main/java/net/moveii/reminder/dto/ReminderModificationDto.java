package net.moveii.reminder.dto;

import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
public class ReminderModificationDto extends ReminderDto {

    @NotNull
    private String id;
}