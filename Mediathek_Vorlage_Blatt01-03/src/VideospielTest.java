import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VideospielTest
{
    /*    private Videospiel _videospiel1;
    
        @Before
    public void setUp()
    {
        _videospiel1 = getMedium();
        _videospiel2 = getMedium();
    }*/

    private Videospiel Gui;

    public VideospielTest()
    {
        Gui = new Videospiel("Das GUi-Spiel", "Graphical Interface");

    }

    @Test
    public void testGetMedienBezeichnung()
    {

        assertEquals(Gui.getMedienBezeichnung(), "Videospiel");

    }

    @Test
    public void testGetKommentar()
    {

        assertEquals(Gui.getKommentar(), "Graphical Interface");
    }

    @Test
    public void testGetTitel()
    {

        assertEquals(Gui.getTitel(), "Das GUi-Spiel");
    }

}
