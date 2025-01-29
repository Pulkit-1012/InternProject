package in.ongrid.b2cportal.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pan_doc") //name may change
public class PANDoc extends Document{

    @Id
    private long id; //foreign key


    public PANDoc() {};


    @Override
    public String toString() {
        return "PANDoc{" +
                "id=" + id +
                '}';
    }
}
