
package in.sp.main.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {
	
	@Value("${msg}")
	private String msg;
	
	@GetMapping("/")
	  public String getMessage() {
        return msg;
    }
	
}
