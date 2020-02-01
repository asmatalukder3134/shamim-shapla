package arraypractice;

public class D2 {

	
		public static void main(String[] args) {
			String str="cucumber - 1 kg";
			String[] ara=str.split("kg");
			String s1=ara.toString();
			String[]ara1=s1.split("1");
			String s2=ara1.toString();
			String[]ara2=s2.split("-");
			
			for(String s:ara1) {
				System.out.println(s);
				//System.out.println(ara);
			String st=ara[0];
			System.out.println(st);
			String out="asma123";
			String out1="1abc2ac5";
			
			}

		}


	}


