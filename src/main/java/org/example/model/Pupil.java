package org.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "Pupil")
@Getter
@Setter
@ToString
@NoArgsConstructor

public class Pupil {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "fio")
    private String fio;
    @Column(name = "birthDate")
    private String birthDate;
    @Column(name = "phoneNumber")
    private String phoneNumber;
    @ManyToOne
    @JoinColumn(name = "schoolId", referencedColumnName = "id")
    private School school;

    public Pupil(String fio, String birthDate, String phoneNumber, School school) {
        this.fio = fio;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.school = school;
    }
}

