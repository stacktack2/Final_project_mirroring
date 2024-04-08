package ezen.dteam.vo;

public class CinemaReplyVO {
	private String ccmtno;
	private String ccmtContent;
	private String ccmtRdadte;
	private int ccmtLikeCnt;
	private int ccmtDelyn;
	private String cno;
	private int mno;
	private int ccode;
	private String mnickNm;

	public CinemaReplyVO() {}
	public CinemaReplyVO( int mno,String cno, String ccmtContent) {
		super();
		
		this.mno = mno;
		this.cno=cno;
		this.ccmtContent = ccmtContent;
	}
	public String getCcmtno() {
		return ccmtno;
	}
	public void setCcmtno(String ccmtno) {
		this.ccmtno = ccmtno;
	}
	public String getCcmtContent() {
		return ccmtContent;
	}
	public void setCcmtContent(String ccmtContent) {
		this.ccmtContent = ccmtContent;
	}
	public String getCcmtRdadte() {
		return ccmtRdadte;
	}
	public void setCcmtRdadte(String ccmtRdadte) {
		this.ccmtRdadte = ccmtRdadte;
	}
	public int getCcmtLikeCnt() {
		return ccmtLikeCnt;
	}
	public void setCcmtLikeCnt(int ccmtLikeCnt) {
		this.ccmtLikeCnt = ccmtLikeCnt;
	}
	public int getCcmtDelyn() {
		return ccmtDelyn;
	}
	public void setCcmtDelyn(int ccmtDelyn) {
		this.ccmtDelyn = ccmtDelyn;
	}
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public int getCcode() {
		return ccode;
	}
	public void setCcode(int ccode) {
		this.ccode = ccode;
	}
	public String getMnickNm() {
		return mnickNm;
	}
	public void setMnickNm(String mnickNm) {
		this.mnickNm = mnickNm;
	}

}
