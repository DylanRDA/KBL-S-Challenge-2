import net.sf.clipsrules.jni.Environment;

public class Prodcust {
    
    public static Environment clips = new Environment();

    public static void main (String[] args){
        
  

  clips.load("load-prod-cust.cpl");
  clips.load("load-prodcust-rules.cpl");
  

        clips.reset();
        
        clips.run();
        clips.clear();
    }




}