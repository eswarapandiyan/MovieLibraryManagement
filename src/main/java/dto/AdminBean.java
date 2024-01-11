package dto;

public class AdminBean {
	private int Aid;
	private String Aname;
	private long Acontact;
	private String Amail;
	private String Apassword;

	public int getAid() {
		return Aid;
	}

	public void setAid(int aid) {
		this.Aid = aid;
	}

	public String getAname() {
		return Aname;
	}

	public void setAname(String aname) {
		this.Aname = aname;
	}

	public long getAcontact() {
		return Acontact;
	}

	public void setAcontact(long acontact) {
		this.Acontact = acontact;
	}

	public String getAmail() {
		return Amail;
	}

	public void setAmail(String amail) {
		this.Amail = amail;
	}

	public String getApassword() {
		return Apassword;
	}

	public void setApassword(String apassword) {
		this.Apassword = apassword;
	}

	@Override
	public String toString() {
		return "AdminBean [Aid=" + Aid + ", Aname=" + Aname + ", Acontact=" + Acontact + ", Amail=" + Amail
				+ ", Apassword=" + Apassword + "]";
	}

}
