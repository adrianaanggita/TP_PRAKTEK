import static java.lang.System.*;

public class Itachi extends Rikudo {
    private String KekkeiGenkai = "Susanoo";
    private String Dojutsu = super.Dojutsu;

    void printKekkeiGenkai() {
        out.println(this.KekkeiGenkai);
    }

    void printDojutsu() {
        out.println(this.Dojutsu);
        setDojutsu();
        out.println(this.Dojutsu);
    }

    private void setDojutsu() {
        this.Dojutsu = "Mangekyou Sharingan";
    }
}
