package ur.veli.admin.entyty;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employees")
public class Admin {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account_id;
    @OneToMany
    @JoinColumn(name= "account_id")
    private User user;



}
