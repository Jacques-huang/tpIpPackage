#question 1
class IpTest {
        public static void main (String args[]) {
            IpPackage ip1 = IpPackage.getInstance(128,12,45,21);
            System.out.println("L'adresse ip et les octes:");
            System.out.println(ip1.ToString());
			System.out.println("la classe est " + "classe " + ip1.getClasse());
			System.out.println("l'adresse du reseau est  " + ip1.adresseReseau());


	    System.out.println("");
			System.out.println("l'ip 2");
			IpPackage ip2 = IpPackage.getInstance(128,12,59,210);
            System.out.println("L'Adresse IP avec les octet qui se suivent :");
            System.out.println(" --> " + ip2.ToString());
			System.out.println("la classe est " + "classe " + ip2.getClasse());
			System.out.println("l'adresse du reseau est : " + ip2.adresseReseau());
			System.out.println(ip1.alememereseau(ip2));


			System.out.println("");
			System.out.println("c'est l'ip numero 3");
			IpPackage ip3 = IpPackage.getInstance(128,17,125,81);
            System.out.println("L'adresse ip");
            System.out.println(ip3.ToString());
			System.out.println("la classe est " + "classe " + ip3.getClasse());
			System.out.println("l"adresse du reseau est  " + ip3.adresseReseau());
			System.out.println(ip1.alememereseau(ip3));






String Binaire1? =Integer.toBinaryString(octet1);
String Binaire2? =Integer.toBinaryString(octet2);
String Binaire3? =Integer.toBinaryString(octet3);
String Binaire4? =Integer.toBinaryString(octet4);

String Hexa1? =Integer.toHexString(octet1);
String Hexa2? =Integer.toHexString(octet2);
String Hexa3? =Integer.toHexString(octet3);
String Hexa4?=Integer.toHexString(octet4);

System.out.println("L'adresse IP en decimal est "+octet1+"."+octet2+"."+octet3+"."+octet4);
System.out.println("L'adresse IP en binaire est "+Binaire1?+"."+Binaire2?+"."+Binaire3?+"."+ Binaire4?);

System.out.println("L'adresse IP en decimal est "+octet1+"."+octet2+"."+octet3+"."+octet4);
System.out.println("L'adresse IP en binaire est "+Hexa1?+"."+Hexa2?+"."+Hexa3?+"."+ Hexa4?);