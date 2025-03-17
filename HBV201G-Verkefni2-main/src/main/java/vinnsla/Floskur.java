package vinnsla;

public class Floskur {
    private int virdiDosir;
    private int fjoldiDosir;

    private int virdiFloskur;
    private int fjoldiFloskur;

    private static final int VERD_DOSIR = 20;
    private static final int VERD_FLOSKUR = 25;

    /**
     * Setur fjölda dósa og uppfærir viðri dósa.
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
     * @param floskur
     */
    public void setFjoldiFloskur(int floskur) {
        this.fjoldiFloskur += floskur;
        this.virdiFloskur = this.fjoldiFloskur * VERD_FLOSKUR;
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
     * Skilar virði flaska.
     *
     * @return virdiFloskur
     */
    public int getISKFloskur() {
        return this.virdiFloskur;
    }

    /**
     * Hreinsar fjölda og virði dósa og flaska.
     */
    public void hreinsa() {
        this.fjoldiDosir = 0;
        this.fjoldiFloskur = 0;
        this.virdiDosir = 0;
        this.virdiFloskur = 0;
    }
}
