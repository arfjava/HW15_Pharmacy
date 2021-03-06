package ir.maktab.homeworks.hw15.arf.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Prescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer code;
    private String creationDate;
    private String registrationDate;

    @ManyToOne
    @ToString.Exclude
    private Patient patient;

    @ManyToMany
    private List<Medicine> medicines;
}
