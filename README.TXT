Project: midi-player
Authors: David Barnes and Michael Kölling

This project is part of the material for the book

   Objects First with Java - A Practical Introduction using BlueJ
   Seventh edition
   David J. Barnes and Michael Kölling

It is discussed in chapter 3.

#41 Instrument number: 0 
C (12) B (24) A (36)

#43 Yes you can play it more than once.

#45 external method call: if(!tune.getNotes().isEmpty())
    internal method call: playTrack(sequence);
    
#47 public class TuneCreator{
    // Field to hold a MidiPlayer
    private MidiPlayer player;

    /**
     * Constructor for objects of class TuneCreator
     */
    public TuneCreator()
    {
        // Create a new MidiPlayer and store it in the field
        player = new MidiPlayer();
    }
    
#48

public void CreateAndPlay()
    {
     // Code will go here later, this does nothing right now.   
    }
    
#49 public void CreateAndPlay()
    {
     SimpleTune tune = new SimpleTune(); 
     
    tune.addNote("C4", 4);
    tune.addNote("E4", 4);
    tune.addNote("G4", 4);
    tune.addNote("C5", 4);
    
    player.playTune(tune);  
    }
    
#50 public void CreateAndPlay()
    {
     SimpleTune tune = new SimpleTune(); 
     
     tune.setInstrument(5)
     
    tune.addNote("C4", 4);
    tune.addNote("E4", 4);
    tune.addNote("G4", 4);
    tune.addNote("C5", 4);
    
    player.playTune(tune);  
    }
    
#51 public ClockDisplay()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
                        
        long millis = System.currentTimeMillis();
        long seconds = millis / 1000;
        int currentMinutes = (int) (seconds / 60 % 60);
        int currentHours = (int) (seconds / (60 * 60) % 24);
        
        hours.setValue(currentHours);
        minutes.setValue(currentMinutes);

        updateDisplay();
    }
    
#52 It gives the same results as the original version
(always shows two digits, like 09 instead of 9).

The difference is its style: String.format("%02d", value) 
is a shorter, cleaner way to write the same thing.