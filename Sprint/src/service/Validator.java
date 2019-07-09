package service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import bean.AccountDetails;
public class Validator {
	boolean result=false;
	boolean Validate(AccountDetails user)
	{
		ValidateEmail(user.getEmailid());
		ValidatePhoneNumber(user.getPhoneNumber());
		return result;
	}
	public void ValidateEmail(String string)
	{
		Pattern p = Pattern.compile("\\b[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}\\b");
		Matcher m = p.matcher(string);
		if(m.find())
		{
			result=true;
		}
	}
	public void ValidatePhoneNumber(long phone)
	{
		String temp=String.valueOf(phone);
		Pattern p = Pattern.compile("\\d{10}");
		Matcher m = p.matcher(temp);
		if(m.find())
		{
			result=true;
		}
	}
}
