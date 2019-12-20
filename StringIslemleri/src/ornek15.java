public class ornek15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String metin06 = "Programlama Temelleri - Bilgisayar Programciligi";
		System.out.println("Cumle : " + metin06);
		String[] kelime = metin06.split(" ");

		for (int i = 0; i < kelime.length; i++) {
			System.out.println(kelime[i]);
			kelime[i] = kelime[i].trim();
			if (kelime[i].equalsIgnoreCase("-")) {
				System.out.println("Cumleyi ikiye bolebilirsiniz");
			}
		}
	}
}
