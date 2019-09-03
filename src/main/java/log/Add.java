package log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Add {
    public void add(String name){
        Log log=LogFactory.getLog(Add.class);
        log.info("param"+name+"");
        System.out.println("finidsh");
    }
}
