package in.ongrid.b2cportal.entity;

public class GDCVerification extends BaseVerification {
    private long id; //foreign key

    public GDCVerification() {};


    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "GDCVerification{" +
                "id=" + id +
                '}';
    }
}
