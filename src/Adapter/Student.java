package adapter;

public class Student {
	private String SID;
	private String tel;

	public void create(String _SID, String _tel) {
		this.SID = _SID;
		this.tel = _tel;
	}

	public String getSID() {
		return SID;
	}

	public String getTel() {
		return tel;
	}
}
