package uwi.controller.timer;

import java.util.logging.Logger;

import org.mortbay.util.ajax.JSON;
import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class IndexController extends Controller {

    @Override
    public Navigation run() throws Exception {
        Logger logger = Logger.getLogger(this.getClass().getName());
        logger.info("にゃ"+JSON.toString(new int[]{1, 2, 3}));
        return forward("index.jsp");
    }
}
