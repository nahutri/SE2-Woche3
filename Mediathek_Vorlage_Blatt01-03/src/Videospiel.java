
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
     * Konstruktor des Videospiels
     * 
     */
    public Videospiel(String titel, String kommentar)
    {
        _titel = titel;
        _kommentar = kommentar;

    }

    @Override
    public String getMedienBezeichnung()
    {
        return "Videospiel";
    }

    @Override
    public String getTitel()
    {
        return _titel;
    }

    @Override
    public String getKommentar()
    {
        return _kommentar;
    }

}
