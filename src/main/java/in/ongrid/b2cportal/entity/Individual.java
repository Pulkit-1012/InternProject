package in.ongrid.b2cportal.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "Individual")
public class Individual {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "individual_id")
    private long id;

    @Column(name = "individual_name")
    private String individualName;

    @Column(name = "phone_number")
    private long phoneNumber;

    @Column(name = "father_name")
    private String fatherName;

    @Column(name = "mother_name")
    private String motherName;

    @Column(name = "address")
    private String address;

    @Column(name = "dob")
    private Date dob;

    @Column(name = "gender")
    private String gender;

    @ManyToOne
    @JoinColumn(name = "id")
    private User user;


    //no attribute constructor
    public Individual() {};

    public Individual( String individualName, long phoneNumber, String fatherName, String motherName, String address, Date dob, String gender) {
        this.individualName = individualName;
        this.phoneNumber = phoneNumber;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.address = address;
        this.dob = dob;
        this.gender = gender;
    }


    //getters and s


    //toString method

    @Override
    public String toString() {
        return "Individual{" +
                "id=" + id +
                ", individualName='" + individualName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", address='" + address + '\'' +
                ", dob=" + dob +
                ", gender='" + gender + '\'' +
                ", user=" + user +
                '}';
    }
}
