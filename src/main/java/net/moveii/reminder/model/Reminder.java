package net.moveii.reminder.model;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@ToString
public class Reminder {

    @Id
    private String id;

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    @Column(nullable = false)
    private String reminderText;

    @Column(nullable = false)
    private LocalDateTime reminderDateTime;

    @Column(nullable = false)
    private boolean remindByMailWhenOffline;

}