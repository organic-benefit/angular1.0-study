package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Kim Dong Chul / on 2016-10-05.
 */
@Controller
public class MainController {

	@RequestMapping("day3")
	public String day3(){
		return "day3";
	}
}
