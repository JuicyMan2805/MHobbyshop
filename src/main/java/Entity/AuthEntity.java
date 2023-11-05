package Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "Author")
public class AuthEntity extends SuperEntity{
    @Column(name = "Author_name")
    private String authorName;

    @Column(name = "Date_born")
    private LocalDate AuthorBirthDay;
}
