package vinnsla;

public class Floskur {
    private int virdiDosir;
    private int fjoldiDosir;

    private int virdiFloskur;
    private int fjoldiFloskur;

    private int virdiGler;
    private int fjoldiGler;

    private static final int VERD_DOSIR = 20;
    private static final int VERD_FLOSKUR = 25;
    private static final int VERD_GLER = 27;

    /**
     * Setur fjölda dósa og uppfærir virði dósa.
     *
     * @param dosir
     */
    public void setFjoldiDosir(int dosir) {
        this.fjoldiDosir += dosir;
        this.virdiDosir = this.fjoldiDosir * VERD_DOSIR;
    }

    /**
     * Skilar fjölda flaska.
     *
     * @return fjöldi flaska
     */
    public int getFjoldiFloskur() {
        return fjoldiFloskur;
    }

    /**
     * Skilar virði dósa.
     *
     * @return virdiDosir
     */
    public int getISKDosir() {
        return this.virdiDosir;
    }

    /**
     * Setur fjölda flaska og uppfærir viðri dósa.
     *
     * @param floskur flöskur
     */
    public void setFjoldiFloskur(int floskur) {
        this.fjoldiFloskur += floskur;
        this.virdiFloskur = this.fjoldiFloskur * VERD_FLOSKUR;
    }

    /**
     * Setur fjölda gler og uppfærir virði gler
     *
     * @param gler flöskur
     */
    public void setFjoldiGler(int gler) {
        this.fjoldiGler += gler;
        this.virdiGler = this.fjoldiGler * VERD_GLER;
    }

    /**
     * Skilar fjölda dósa.
     *
     * @return fjöldi dósa
     */
    public int getFjoldiDosir() {
        return fjoldiDosir;
    }

    /**
     * Skilar fjölda gler
     *
     * @return fjöldi gler
     */
    public int getFjoldiGler() {
        return fjoldiGler;
    }

    /**
     * Skilar virði flaska.
     *
     * @return virdiFloskur
     */
    public int getISKFloskur() {
        return this.virdiFloskur;
    }

    /**
     * Skilar virði gler
     *
     * @return virdiGler
     */
    public int getISKGler() {
        return this.virdiGler;
    }

    /**
     * Hreinsar fjölda og virði dósa, flaska og gler.
     */
    public void hreinsa() {
        this.fjoldiDosir = 0;
        this.fjoldiFloskur = 0;
        this.virdiDosir = 0;
        this.virdiFloskur = 0;
        this.virdiGler = 0;
        this.fjoldiGler = 0;
    }
}
