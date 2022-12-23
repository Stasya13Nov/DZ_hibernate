package org.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "School")
@Getter
@Setter
@NoArgsConstructor
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  int id;
    @Column
    private String schoolName;
    @Column
    private String city;
    @OneToMany(mappedBy = "school") //название переменной из класса pupil
    private List<Pupil> pupilList;

    public School(String schoolName, String city) {
        this.schoolName = schoolName;
        this.city = city;
    }
}
