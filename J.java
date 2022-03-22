class J
{
	enum E{CON, MM, XX, Test, Total, YY};
	public static void main(String[] args) 
	{
		E e1 = E.MM;
		E e2 = E.XX;
		E e3 = E.Total;
		System.out.println(e1.ordinal());
		System.out.println(e2.ordinal());
		System.out.println(e3.ordinal());
	}
}
