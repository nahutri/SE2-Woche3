import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VideospielTest
{
    private static final String SYSTEM = "System";

    private static final String KOMMENTAR = "Kommentar";

    private static final String TITEL = "Titel";
    /*    private Videospiel _videospiel1;
    
        @Before
    public void setUp()
    {
        _videospiel1 = getMedium();
        _videospiel2 = getMedium();
    }*/

    private Videospiel Gui;
    private Videospiel _standard;

    public VideospielTest()
    {
        Gui = new Videospiel("Das GUi-Spiel", "Graphical Interface", "PC");
        _standard = new Videospiel(TITEL, KOMMENTAR, SYSTEM);

    }

    @Test
    public void testGetMedienBezeichnung()
    {

        assertEquals(Gui.getMedienBezeichnung(), "Videospiel");
        assertEquals(_standard.getMedienBezeichnung(), "Videospiel");

    }

    @Test
    public void testGetKommentar()
    {

        assertEquals(Gui.getKommentar(), "Graphical Interface");
        assertEquals(_standard.getKommentar(), KOMMENTAR);
    }

    @Test
    public void testGetTitel()
    {

        assertEquals(Gui.getTitel(), "Das GUi-Spiel");
        assertEquals(_standard.getTitel(), TITEL);
    }

    @Test
    public void testGetSystem()
    {
        Gui.getSystem();
        _standard.getSystem();

        assertEquals(Gui.getSystem(), "PC");
        assertEquals(_standard.getSystem(), SYSTEM);
    }

    @Test
    public void testKonstruktor()
    {
        assertEquals(TITEL, _standard.getTitel());
        assertEquals(KOMMENTAR, _standard.getKommentar());
    }

}
