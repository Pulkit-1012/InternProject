package in.ongrid.b2cportal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pan_verification")
public class PANVerification extends BaseVerification{

    @Id
    private long id; //foreign key



    public PANVerification() {};




    @Override
    public String toString() {
        return "PanVerification{" +
                "id=" + id +
                '}';
    }
}
