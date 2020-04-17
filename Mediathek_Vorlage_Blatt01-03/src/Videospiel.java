
public class Videospiel implements Medium
{
    //vom MedienEinleser
    //medium = new Videospiel(titel, kommentar, system);
    //push (01:55, 18.04.2020)
    // push (01:59, 18.04.2020)
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
     * 
     * @require titel !=null
     * @require kommentar != null
     * @require system != null
     * 
     * @ensure getKommentar = kommentar
     * @ensure getSystem = system
     * @ensure getTitel = titel
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
     * Setzt den Titel
     * @param titel
     */
    public void setTitel(String titel)
    {
        assert titel != null : "Vorbedingung verletzt: null";
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
        assert kommentar != null : "Vorbedingung verletzt: null";

        _kommentar = kommentar;
    }

    /**
     * Getter für System
     * @return das System des Videosspiels
     * @ensure _system !=0
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
        assert system != null : "Vorbedingung verletzt: null";

        //this._system = _system; //Vorschlag von Eclipse

        _system = system;
    }

}
