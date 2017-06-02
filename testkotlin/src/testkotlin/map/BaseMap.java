package testkotlin.map;

import java.util.HashMap;
import java.util.Map;

public class BaseMap {
	
	private	Map<String, Object> data=new HashMap<String,Object>();

	public Map<String, Object> getData() {
		return data;
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}
	
	
	public void init() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 100; i++) {
			data.put("key"+i, "value"+i);
		}

	}
	

}
