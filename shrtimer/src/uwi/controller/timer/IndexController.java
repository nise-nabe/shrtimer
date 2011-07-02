package uwi.controller.timer;

import java.util.GregorianCalendar;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.arnx.jsonic.JSON;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.datastore.Datastore;
import org.slim3.util.RequestLocator;
import org.slim3.util.ResponseLocator;

import uwi.model.Capsule;
import uwi.model.Owner;

public class IndexController extends Controller {

    @Override
    public Navigation run() throws Exception {
        HttpServletRequest req = RequestLocator.get();
        Logger logger = Logger.getLogger(this.getClass().getName());
        logger.info("" + JSON.encode(new int[] { 1, 2, 3 }));
        String ss = asString("q");
        if (ss != null) {
            String time = asString("q");
            Matcher m = Pattern.compile("(\\d+)(\\D+)").matcher(time);
            if (m.matches()) {
                int i = new Integer(m.group(1));
                String type = m.group(2);
            }
            Owner o = new Owner();
            o.setKey(Datastore.createKey(Owner.class, o.hashCode()));
            o.setName("" + o.getKey());

            Capsule cap = new Capsule();
            cap.setOwnerId(o.getKey());
            cap.setRegisteredDate(GregorianCalendar.getInstance().getTime());
            cap.setKey(Datastore.createKey(Capsule.class, cap.hashCode()));
            o.getCapsules().add(cap);

            Datastore.put(o);
            HttpServletResponse res = ResponseLocator.get();
            
        }
        ss = asString("key");
        if (ss != null) {

        }
        return forward("index.jsp");
    }
}
