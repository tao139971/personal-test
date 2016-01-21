package timestamp;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.lang3.ObjectUtils;
public class transfertimestamp 
{
	public static void main(String[] args) {  
		Base base = new Base();
		base.setA(10);
		
		Set<Base> set = new TreeSet<>();
		set.add(base);
		if(set.contains(base))
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		for(Base base2 :set)
		{
			System.out.println(base2.hashCode());
		}
		System.out.println(base.hashCode());
		
		base.setA(14);
		
		System.out.println(base.hashCode());
		for(Base base2 :set)
		{
			System.out.println(base2.hashCode());
		}
		if(set.contains(base))
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		set.add(base);
		System.out.println(set.size());
		for(Base base2 :set)
		{
			System.out.println(base2.getA());
		}
		base.setA(15);
		for(Base base2 :set)
		{
			System.out.println(base2.getA());
		}
    }  
}
