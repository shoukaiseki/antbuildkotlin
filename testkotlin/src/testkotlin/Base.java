package testkotlin;

import java.util.HashMap;
import java.util.Map;

public class Base {
	
	protected JsonModel jm=new JsonModel();
	
	public Base(){
		
	}
	
	public static String getSql(String sqlid,Object  model){
		if(model instanceof Map){
			Object object = ((Map)model).get(sqlid);
			if(object!=null){
				return object.toString();
			}
		}
		
		
		return sqlid;
		
	}

	
	public HashMap<String, String> getParameters() {
		return new HashMap();
	}
	
}
