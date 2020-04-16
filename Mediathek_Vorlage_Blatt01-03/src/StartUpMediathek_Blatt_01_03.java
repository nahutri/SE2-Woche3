import java.io.File;

import javax.swing.SwingUtilities;

/**
 * Startet die Hauptanwendung mit grafischer Oberfläche.
 * 
 * @author SE2-Team
 * @version SoSe 2019
 */
class StartUpMediathek_Blatt_01_03
{

    private static final File KUNDEN_DATEI = new File(
            "./bestand/kundenstamm.txt");
    private static final File MEDIEN_DATEI = new File(
            "./bestand/medienbestand.txt");

    private static KundenstammService _kundenstamm;
    private static MedienbestandService _medienbestand;
    private static VerleihService _verleihService;

    /**
     * Main-Methode, mit der die Anwendung gestartet wird.
     */
    public static void main(String[] args)
    {

        System.out.println("mit SE2Format (1.1.4)");
        System.out.println("Woche 3");
        pruefeObAssertionsAktiviert();
        erstelleServices();

        final MediathekWerkzeug mediathekWerkzeug = new MediathekWerkzeug(
                _medienbestand, _kundenstamm, _verleihService);

        // Dies ist die korrekte Art eine Swing-Anwendnung zu starten.
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                mediathekWerkzeug.zeigeFenster();
            }
        });

    }

    /**
     * Erstellt die Services und lädt die Daten.
     */
    private static void erstelleServices()
    {
        try
        {
            DatenEinleser datenEinleser = new DatenEinleser(MEDIEN_DATEI,
                    KUNDEN_DATEI);
            datenEinleser.leseDaten();
            _medienbestand = new MedienbestandServiceImpl(
                    datenEinleser.getMedien());
            _kundenstamm = new KundenstammServiceImpl(
                    datenEinleser.getKunden());
            _verleihService = new DummyVerleihService(_kundenstamm,
                    _medienbestand, datenEinleser.getVerleihkarten());
        }
        catch (DateiLeseException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * prueft, ob -ea als Default VM Argument hinterlegt ist
     */
    private static void pruefeObAssertionsAktiviert()
    {

        boolean sindAssertionsAktiv = false;
        assert sindAssertionsAktiv = true;
        if (!sindAssertionsAktiv)
        {
            System.err.println("Assertions sind nicht eingeschaltet!\n"
                    + " Schalte sie ein, indem du unter Window -> Preferences-> Java -> installed JREs das genutzte JRE anwähltst, auf Edit klickst und bei Default VM Arguments \"-ea\" einträgst.");
        }
    }

}
