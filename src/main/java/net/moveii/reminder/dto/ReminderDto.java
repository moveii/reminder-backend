package net.moveii.reminder.dto;

import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
abstract class ReminderDto {

    private String reminderText;

    private LocalDateTime reminderDateTime;

    private boolean remindByMailWhenOffline;

}
