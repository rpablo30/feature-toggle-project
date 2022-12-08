package io.github.rpablo30.featuretoggle.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;



@Entity
@Setter
@Getter
@Table(name = "tb_feature")
public class Feature{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "f_name", nullable = false)
    private String name;
    @Column(name = "f_active",nullable = false)
    private Boolean active;

    @ManyToOne
    @JoinColumn(name = "tb_user")
    private User user;


    @Column(name = "Date_Created", nullable = false)
    private LocalDateTime dateCreated;
    @Column(name = "Date_Update")
    private Date dateUpdate;



    public Feature(){

    }

    public Feature(Long id, String name, Boolean active) {
        this.id = id;
        this.name = name;
        this.active = active;
    }
}
