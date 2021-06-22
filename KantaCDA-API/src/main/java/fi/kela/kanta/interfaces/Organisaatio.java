
package fi.kela.kanta.interfaces;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

public interface Organisaatio extends Serializable {

   
    /**
     * @return Organisaation yksilöintitunnus (oid).
     */
    public String getYksilointitunnus();

    /**
     * @param yksilointitunnus
     *            Organisaation yksilöintitunnus (oid).
     */
    public void setYksilointitunnus(String yksilointitunnus);

    /**
     * @return Organisaation yritys- ja yksilöintitunnus (y-tunnus).
     */
    public String getYtunnus();

    /**
     * @param yTunnus
     *            Organisaation yritys- ja yksilöintitunnus (y-tunnus).
     */
    public void setYtunnus(String yTunnus);

    /**
     * @return Organisaation puhelinnumero.
     */
    public String getPuhelinnumero();

    /**
     * @param puhelinnumero
     *            Organisaation puhelinnumero.
     */
    public void setPuhelinnumero(String puhelinnumero);

    /**
     * @return Organisaation sähköpostiosoite.
     */
    public String getSahkoposti();

    /**
     * @param sahkoposti
     *            Organisaation sähköpostiosoite.
     */
    public void setSahkoposti(String sahkoposti);
}
