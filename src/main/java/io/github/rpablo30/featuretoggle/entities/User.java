package io.github.rpablo30.featuretoggle.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "tb_User")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "user_name", nullable = false)
    private String name;
    @Column(name = "user_password",nullable = false)
    private String password;
    @Column(name = "today_Date", nullable = false)
    private LocalDateTime dateCreated;
    @Column(name = "update_Date")
    private Date dateUpdate;

    public User() {

    }
    public User(Long id, String name, String password, LocalDateTime dateCreated, Date dateUpdate) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.dateCreated = dateCreated;
        this.dateUpdate = dateUpdate;
    }
}
