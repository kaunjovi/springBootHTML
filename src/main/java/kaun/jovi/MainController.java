package kaun.jovi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//This is a controller
@Controller
public class MainController {

	final static Logger logger = LoggerFactory.getLogger(MainController.class);

	// This is the response to the homepage request from browser.
	@RequestMapping("/")
	public String homepage() {
		logger.debug("Show the homepage.");
		return ("redirect:/index.html");

	}

}
