
public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		StringBuilder logWithSpace = new StringBuilder();

		for(int i = 0 ; i < log.length(); i++)
		{
		   logWithSpace = logWithSpace.append(log.charAt(i));
		   logWithSpace = logWithSpace.append(' ');
		}

		System.out.println(logWithSpace.toString());
	}
	

	@Override
	public void error(String error) {
		StringBuilder errorWithSpace = new StringBuilder();

		for(int i = 0 ; i < error.length(); i++)
		{
		   errorWithSpace = errorWithSpace.append(error.charAt(i));
		   errorWithSpace = errorWithSpace.append(' ');
		}
		
		System.out.println("ERROR: " + errorWithSpace.toString());
	}

}
