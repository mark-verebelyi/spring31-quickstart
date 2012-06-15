package ${groupId};

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	private static Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(final String[] args) {
		final ApplicationContext context = new ClassPathXmlApplicationContext("/spring/application.xml");
		logger.info("Context started up on {}", context.getStartupDate());
	}

}
