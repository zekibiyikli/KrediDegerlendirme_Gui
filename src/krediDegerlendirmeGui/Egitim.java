package krediDegerlendirmeGui;

public class Egitim {
	
	public static String[][] veri() {
		String veri[][]=new String[][] {
			{"Bor�",	"Egitim",		"Gelir",	"Sonuc"},
			{"y�ksek",	"ilk",			"d���k",	"hay�r"},
			{"y�ksek",	"orta",			"orta",		"hay�r"},
			{"y�ksek",	"�niversite",	"y�ksek",	"evet"},
			{"d���k",	"lise",			"orta",		"evet"},
			{"d���k",	"�niversite",	"y�ksek",	"evet"},
			{"d���k",	"lise",			"y�ksek",	"evet"},
			{"d���k",	"ilk",			"d���k",	"hay�r"},
			{"d���k",	"ilk",			"orta",		"hay�r"},
			{"d���k",	"orta",			"orta",		"hay�r"},
			{"d���k",	"�niversite",	"orta",		"evet"},
			{"d���k",	"�niversite",	"orta",		"hay�r"},

		};
		return veri;
}

}
