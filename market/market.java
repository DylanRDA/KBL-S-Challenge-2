import net.sf.clipsrules.jni.Environment;

public class market {
    
    public static Environment clips = new Environment();

    public static void main (String[] args){
        
  

  clips.load("templates.cpl");
  clips.load("facts.cpl");
  clips.load("rules2.cpl");

        clips.reset();
        clips.run();

    }




}