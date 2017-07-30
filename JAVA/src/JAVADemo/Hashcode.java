package JAVADemo;

public class Hashcode {

	public static void main(String[] args) {
		String str= "JAVA";
		System.out.println(str.hashCode());
		str=str+"code";
				System.out.println(str.hashCode());
				
				StringBuffer point= new StringBuffer("test") ;
				System.out.println(point.hashCode());
                point.append("case");
                System.out.println(point.hashCode());

	}

}

