package zvierata;

import java.util.Date;

public class Pes extends Cicavec {

    protected String meno;

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public Pes(Date datumNarodenia, String meno) {
        super(datumNarodenia);
        this.meno = meno;


    }

    @Override
    public void napisCoSom() {
        System.out.println("Haf Haf Som Pes");
    }
}
