public abstract class Factory {
	
	public static LogIn CreateInstance(String name){
		if(name.equals("facebook"))
			return new Facebook();
		else if(name.equals("google"))
			return new Google();
		else if(name.equals("twitter"))
			return new Twitter();
		else if(name.equals("linkedin"))
			return new Linkedin();
		else
			return null;
	}
}
