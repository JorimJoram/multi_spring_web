package chap11.model;

public class VersionPrinter {
	private int majorVersion;
	private int minorVersion;
	
	public VersionPrinter() {
		
	}
	
	public void setMajorVersion(int majorVersion) {
		this.majorVersion=majorVersion;
	}
	public void setMinorVersion(int minorVersion) {
		this.minorVersion = minorVersion;
	}
	
	public void print() {
		System.out.println("Latest Version: " + this.majorVersion + "." + this.minorVersion);
	}
}
