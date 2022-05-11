import net.sf.clipsrules.jni.Environment;

public class market {
    
    public static Environment clips = new Environment();

    public static void main (String[] args){
        
  //clips.load("load-fruta.cpl");
  //clips.load("load-fruta-rules.cpl");

  clips.load("templates.cpl");
  clips.load("facts.cpl");
  clips.load("rules.cpl");

        clips.reset();
        clips.run();

    }




}