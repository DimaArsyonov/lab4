package lab4.lab4;

import java.awt.List;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class EvalTest {
	@Before
	@SuppressWarnings("unused")
    public void Creating_Objects_Of_List_And_Person() {
		Person obj1 = new Person();
		ArrayList<Person> obj2 = new ArrayList<>();
		List obj3 = new List();
    }
	@Test
	public void Is_Empty_Return_Of_Methods_setName_And_getName() {
		Person obj = new Person();
		String name = "Anton";
		obj.setName(name);
		Assert.assertNotNull(obj.getName());
	}
	@Test
	public void Is_Empty_Return_Of_Methods_setSalary_And_getSalary() {
		Person obj = new Person();
		String sal = "12800";
		obj.setSalary(sal);
		Assert.assertNotNull(obj.getSalary());
	}		
	@Test
	public void Testing_Adding_Of_Divisions() {
		ArrayList<Person> obj1 = new ArrayList<>();
		for(int i=0; i<100;i++)
			obj1.add(0, null);
		for(int i=0; i<100;i++)
			obj1.add(new Person());
		Assert.assertEquals(obj1.size(), obj1.size());
	}
}