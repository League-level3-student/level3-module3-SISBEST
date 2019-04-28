package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		char[] string = s.toCharArray();
		for(int i = 0; i<string.length; i+=2) {
			string[i] = Character.toLowerCase(string[i]);
		}
		for(int i = 1; i<string.length; i+=2) {
			string[i] = Character.toUpperCase(string[i]);
		}
		return new String(string);
	}

}