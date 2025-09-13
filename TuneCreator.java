
/**
 * Write a description of class TuneCreator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TuneCreator
{
    // instance variables - replace the example below with your own
    private MidiPlayer player;
    /**
     * Constructor for objects of class TuneCreator
     */
    public TuneCreator()
    {
        // initialise instance variables
        player = new MidiPlayer();
    }
    
    public void CreateAndPlay()
    {
     SimpleTune tune = new SimpleTune(); 
     
     tune.setInstrument(5);
     
    tune.addNote("C4", 4);
    tune.addNote("E4", 4);
    tune.addNote("G4", 4);
    tune.addNote("C5", 4);
    
    player.playTune(tune);  
    }
}