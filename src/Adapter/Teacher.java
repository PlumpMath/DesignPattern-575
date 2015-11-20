package adapter;

import java.util.HashMap;
import java.util.Map;

public class Teacher {
	private Map BaseInfo = new HashMap();
	private void create(String TID, String tel){
		BaseInfo.put("TID", TID);
		BaseInfo.put("Tel", tel);
	}
	
	public Map getBaseInfo(){
		return BaseInfo;
	}
}
