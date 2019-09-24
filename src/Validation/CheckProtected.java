package Validation;

//protected member only access outside the package through inheritance
//default member can't access outside the package
//default-->private-->protected-->public
public class CheckProtected {
	protected int i = 1011;
	protected int j = 10;

	int p = 1011;
	protected int q = 10;
	public int r = 1011;

	protected void showProtected() {
		System.out.println("CheckProtected====" + i);
	}

	void showDefault() {
		System.out.println("CheckProtected====" + i);
	}

	public void showPublic() {
		System.out.println("CheckProtected====" + i);
	}
}
