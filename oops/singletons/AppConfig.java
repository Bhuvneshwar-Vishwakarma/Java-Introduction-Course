package oops.singletons;

public class AppConfig {

	private AppConfig(){
		
	}
	
	private static AppConfig obj = null;
//	private static AppConfig obj = new AppConfig();
	
	public static AppConfig getInstance() {
		if(obj == null) {
			obj = new AppConfig();
		}
		return obj; 
	}
	

}
