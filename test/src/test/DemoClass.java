package test;

import java.io.Serializable;

/**
 * @author Bukrek
 *
 */
public class DemoClass implements Serializable {
	
	private String msj;
	
	/**
	 * @return the msj
	 */
	public String getMsj() {
		return msj;
	}

	/**
	 * @param msj the msj to set
	 */
	public void setMsj(String msj) {
		this.msj = msj;
	}

	public static void main(String[] args) {
		System.out.println("HEKKI WORLD");
	}
}
