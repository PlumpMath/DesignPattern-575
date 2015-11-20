package adapter;

import java.util.Map;

public class Adapter {
	private Teacher mTeacher = null;
	public Adapter(Teacher _teacher){
		mTeacher = _teacher;
	}private Map BaseInfo = mTeacher.getBaseInfo();
	public String getTID(){
		return (String)BaseInfo.get("TID");
	}
	public String getTel(){
		return (String)BaseInfo.get("Tel");
	}
}
