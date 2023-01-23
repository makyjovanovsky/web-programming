package mk.ukim.finki.wp.kol2022.g1.model;


import javax.persistence.*;

@Entity
@Table(name = "skill")
public class Skill {

    public Skill() {
    }

    public Skill(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
