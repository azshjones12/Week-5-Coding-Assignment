
public class App {

	public static void main(String[] args) {
		
		//AsteriskLogger
		Logger logger = new AsteriskLogger();

		logger.log("Howdy");
		logger.error("Howdy");
		
		//SpacedLogger
		Logger logger2 = new SpacedLogger();
		
		logger2.log("Hola");
		logger2.error("Hola");
	}

}
