package org.copyarray;


public final class NameAndValue
{
	public String name;
	public String value;

	public NameAndValue()
	{

	}

	public NameAndValue(String name,String value)
	{
		this.name = name;
		this.value = value;
	}

	public static void main(String[] args)
	{
		NameAndValue[] nv = new NameAndValue[4];
		nv[0] = new NameAndValue("A", "1");
		nv[1] = new NameAndValue("B", "2");
		nv[2] = new NameAndValue("C", "3");
		nv[3] = new NameAndValue("D", "4");

		NameAndValue[] nv2 = new NameAndValue[4];
		System.arraycopy(nv, 0, nv2, 0, 2);
		nv2[2] = new NameAndValue("Y","25");
		nv2[3] = new NameAndValue("Z","26");

		for (int i = 0; i < 2; i++)
		{
			NameAndValue[] nv3 = new NameAndValue[4];
			System.arraycopy(nv2, 0, nv3, 0, 4);
			nv3[2].value = String.valueOf(i);
			nv3[3].value = String.valueOf(i+1);

			System.out.println(nv2[2].value);
			System.out.println(nv2[3].value);
			System.out.println("-----------------------");
		}
	}
}
