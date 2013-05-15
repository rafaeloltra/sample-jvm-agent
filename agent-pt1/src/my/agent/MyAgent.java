package my.agent;

import java.lang.instrument.Instrumentation;
/**
 * Dummy sample JVM agent
 * @author rafael oltra - rafaeloltra@gmail.com
 *
 */

public class MyAgent {

    //JVM start-up hook
    public static void premain(String args, Instrumentation inst) throws Exception {
    	System.out.println("Loading Agent..");
        inst.addTransformer(new MyTransfomer());
    }

}