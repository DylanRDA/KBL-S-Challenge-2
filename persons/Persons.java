import net.sf.clipsrules.jni.Environment;

public class Persons {
    
    public static Environment clips = new Environment();

    public static void main (String[] args){
        
  
      
  clips.load("load-persons.cpl");
  clips.load("load-persons-rules.cpl");
  

        clips.reset();
        
        clips.run();
        clips.clear();
    }




}