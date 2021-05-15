package com.rain.domain;

public class Family implements java.io.Serializable {
	
	private Integer fam_id;
	private String family_status;
	/**
	 * @return fam_id
	 */
	public Integer getFam_id() {
		return fam_id;
	}
	/**
	 * @param fam_id 要设置的 fam_id
	 */
	public void setFam_id(Integer fam_id) {
		this.fam_id = fam_id;
	}
	/**
	 * @return family_status
	 */
	public String getFamily_status() {
		return family_status;
	}
	/**
	 * @param family_status 要设置的 family_status
	 */
	public void setFamily_status(String family_status) {
		this.family_status = family_status;
	}

}
