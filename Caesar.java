import java.util.*;
public class Caesar{
	public static String encrypt(String Text,int shift){
		
		if(shift>26){
			shift=shift%26;
		}
		else if(shift<0){
			shift=(shift%26)+26;
		}
		String cipherText="";
		int len=Text.length();
		for(int i=0;i<len;i++){
			char ch=Text.charAt(i);
			if(Character.isLetter(ch)){
				if(Character.isLowerCase(ch)){
					char c=(char)(ch+shift);
					if(c>'z'){
						cipherText+=(char)(ch-(26-shift));
					}
					else{
						cipherText+=c;
					}
				}
				else if(Character.isUpperCase(ch)){
					char c=(char)(ch+shift);
					if(c>'Z'){
						cipherText+=(char)(ch-(26-shift));
					}
					else{
						cipherText+=c;
					}
				}


			}
			else{
				cipherText+=ch;
			}

		}
		return cipherText;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String Text=sc.nextLine();
		int shift=sc.nextInt();
		sc.close();
		String cipher=encrypt(Text,shift);
		System.out.println(cipher);
	}
}