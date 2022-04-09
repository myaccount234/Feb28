package constructors;

public class Y {
	Y()
	{
		this(90);
	}
	Y(int i)
	{
		this();
	}

}
//recursive calling methos not allowed as above 1st constructor calling 2nd and 2nd calling 1st.