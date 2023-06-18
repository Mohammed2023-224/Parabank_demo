package base;

import com.github.javafaker.Faker;

public class FakeData {
	Faker faker=new Faker();
	public String username=faker.name().username();
	public String fake_password=faker.princessBride().character();
	
}
