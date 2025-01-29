package in.ongrid.b2cportal.entity;

import in.ongrid.b2cportal.enums.OfferingType;
import in.ongrid.b2cportal.enums.Result;
import in.ongrid.b2cportal.enums.Status;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "base_verification")
public class BaseVerification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "verification_id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "id")
    private Individual individual;

    @Column(name = "offering_type")
    private OfferingType offeringType;

    @Column(name = "status")
    private Status status;

    @Column(name = "result")
    private Result result;

    @Column(name = "pdf_url")
    private String pdfReportUrl;


    //no attribute constructor
    public BaseVerification() {};

    public BaseVerification(OfferingType offeringType, Status status, Result result, String pdfReportUrl) {
        this.offeringType = offeringType;
        this.status = status;
        this.result = result;
        this.pdfReportUrl = pdfReportUrl;
    }







    //toString


    @Override
    public String toString() {
        return "BaseVerification{" +
                "id=" + id +
                ", user=" + user +
                ", individual=" + individual +
                ", offeringType=" + offeringType +
                ", status=" + status +
                ", result=" + result +
                ", pdfReportUrl='" + pdfReportUrl + '\'' +
                '}';
    }
}
