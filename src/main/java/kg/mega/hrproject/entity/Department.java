package kg.mega.hrproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String email;
    @ManyToOne
    @JoinColumn(name="head_user_id")
    private User headUser;

    @ManyToOne
    @JoinColumn(name="head_department_id")
    private Department headDepartment;
}
