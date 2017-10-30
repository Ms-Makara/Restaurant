package Login;

import java.sql.ResultSet;
import java.util.Vector;

public class LoginModel
{
	Data.DBHelper dh = null;
	String username,pwd;
	Vector userInfo;
	ResultSet rs;
	public LoginModel(String un, String pwd)
	{
		
		this.username = un;
		this.pwd = pwd;
		verify();
	}
	
	public int verify()
	{
		dh = new Data.DBHelper();
		String sql = "select * from users where username= '"
				+ this.username+"' and password = '"+pwd+"'";
		
		try
		{
			rs = dh.ExecuteQuery(sql);
			userInfo = new Vector(3);
			while(rs.next())
			{
				userInfo.add(rs.getInt(1));
				userInfo.add(rs.getString(2));
				userInfo.add(rs.getInt(4));
			}
		} catch (Exception e)
		{
			// TODO: handle exception
		}
		
		return (int)userInfo.get(2);
	}
	
	
}
