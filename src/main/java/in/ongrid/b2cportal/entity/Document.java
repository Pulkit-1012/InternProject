package in.ongrid.b2cportal.entity;

import in.ongrid.b2cportal.enums.DocType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "document")
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "document_id")
    private long id;

    @Column(name = "doc_type")
    private DocType docType;

    public Document() {};

    public Document(DocType docType) {
        this.docType = docType;
    }






    //toString


    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", docType=" + docType +
                '}';
    }
}
