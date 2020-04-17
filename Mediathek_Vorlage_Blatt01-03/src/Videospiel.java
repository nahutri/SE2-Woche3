
public class Videospiel implements Medium
{
    //vom MedienEinleser
    //medium = new Videospiel(titel, kommentar, system);

    /**
     * Titel des Videospiels
     */
    private String _titel;

    /**
     * Kommentar des Videospiels
     */
    private String _kommentar;

    /**
     * Systems (wie Xbox,Pc) des Videospiels
     */
    private String _system;

    /**
     * Konstruktor des Videospiels
     * @param titel
     * @param kommentar
     * @param system
     */
    public Videospiel(String titel, String kommentar, String system)
    {
        _titel = titel;
        _kommentar = kommentar;
        //set_System(system); // Eclipse vorschlag
        _system = system;

    }

    @Override
    /**
     * @return "Videospiel"
     */
    public String getMedienBezeichnung()
    {
        return "Videospiel";
    }

    @Override
    /**
     * @return den Titel
     */
    public String getTitel()
    {
        return _titel;
    }

    /**
     * 
     * @param titel
     */
    public void setTitel(String titel)
    {
        _titel = titel;
    }

    @Override
    /**
     * @return Kommentar
     */
    public String getKommentar()
    {
        return _kommentar;
    }

    /**
     * Setter für Kommentar
     * @param kommentar
     */
    public void setKommentar(String kommentar)
    {
        _kommentar = kommentar;
    }

    /**
     * Getter für System
     * @return das System des Videosspiels
     */
    public String getSystem()
    {
        return _system;
    }

    /**
     * Setter für das System
     * @param system
     */
    public void setSystem(String system)
    {

        //this._system = _system; //Vorschlag von Eclipse

        _system = system;
    }

}
