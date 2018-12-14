package zvierata;

import java.util.Date;

public abstract class Cicavec {
    protected Date datumNarodenia;

    public Cicavec() {
    }

    public Cicavec(Date datumNarodenia) {
        this.datumNarodenia = datumNarodenia;
    }

    public Date getDatumNarodenia() {
        return datumNarodenia;
    }

    public void setDatumNarodenia(Date datumNarodenia) {
        this.datumNarodenia = datumNarodenia;
    }

    abstract public void napisCoSom();
}
