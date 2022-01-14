package com.solvd.onlineshop.enums;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public enum Countries {
    AFGHANISTAN("Afghanistan"), ALBANIA("Albania"), ALGERIA("Algeria"), ANDORRA("Andorra"), ANGOLA("Angola"), ANTIGUAANDDEPS("Antigua & Deps"),
    ARGENTINA("Argentina"), ARMENIA("Armenia"), AUSTRALIA("Australia"), AUSTRIA("Austria"), AZERBAIJAN("Azerbaijan"), BAHAMAS("Bahamas"),
    BAHRAIN("Bahrain"), BANGLADESH("Bangladesh"), BARBADOS("Barbados"), BELARUS("Belarus"), BELGIUM("Belgium"), BELIZE("Belize"), BENIN("Benin"),
    BHUTAN("Bhutan"), BOLIVIA("Bolivia"), BOSNIA("Bosnia"), BOTSWANA("Botswana"), BRAZIL("Brazil"), BRUNEI("Brunei"), BULGARIA("Bulgaria"),
    BURKINA("Burkina"), BURUNDI("Burundi"), CAMBODIA("Cambodia"), CAMEROON("Cameroon"), CANADA("Canada"), CAPEVERDE("Cape Verde"),
    CENTRALAFRICANREPCHAD("Central African Republic of Chad"), CHILE("Chile"), CHINA("China"), COLOMBIA("Colombia"), COMOROS("Comoros"),
    CONGO("Congo"), CONGODEMOCRATICREP("Congo Democratic Republic"), COSTARICA("Costa Rica"), CROATIA("Croatia"), CUBA("Cuba"),
    CYPRUS("Cyprus"), CZECHREPUBLIC("Czech Republic"), DENMARK("Denmark"), DJIBOUTI("Djibouti"), DOMINICA("Dominica"),
    DOMINICANREPUBLIC("Dominican Republic"), EASTTIMOR("East Timor"), ECUADOR("Ecuador"), EGYPT("Egypt"), ELSALVADOR("El Salvador"),
    EQUATORIALGUINEA("Eqatorial Guinea"), ERITREA("Eritrea"), ESTONIA("Estonia"), ETHIOPIA("Ethiopia"), FIJI("Fiji"), FINLAND("Finland"), FRANCE("France"),
    GABON("Gabon"), GAMBIA("Gambia"), GEORGIA("Georgia"), GERMANY("Germany"), GHANA("Ghana"), GREECE("Greece"), GRENADA("Grenada"),
    GUATEMALA("Guatemala"), GUINEA("Guinea"), GUINEABISSAU("Guinea Bissau"), GUYANA("Guyana"), HAITI("Haiti"), HONDURAS("Honduras"), HUNGARY("Hungary"),
    ICELAND("Iceland"), INDIA("India"), INDONESIA("Indonesia"), IRAN("Iran"), IRAQ("Iraq"), IRELAND("Ireland"), ISRAEL("Israel"),
    ITALY("Italy"), IVORYCOAST("Ivory Coast"), JAMAICA("Jamaica"), JAPAN("Japan"), JORDAN("Jordan"), KAZAKHSTAN("Kazakhstan"), KENYA("Kenya"),
    KIRIBATI("Kiribati"), KOREANORTH("North Korea"), KOREASOUTH("South Korea"), KOSOVO("Kosovo"), KUWAIT("Kuwait"),
    KYRGYZSTAN("Kyrgyzstan"), LAOS("Laos"), LATVIA("Latvia"), LEBANON("Lebanon"), LESOTHO("Lesotho"), LIBERIA("Liberia"), LIBYA("Libya"),
    LIECHTENSTEIN("Liechtenstein"), LITHUANIA("Lithuania"), LUXEMBOURG("Luxembourg"), MACEDONIA("Macedonia"), MADAGASCAR("Madagascar"),
    MALAWI("Malawi"), MALAYSIA("Malaysia"), MALDIVES("Maldives"), MALI("Mali"), MALTA("Malta"), MARSHALLISLANDS("Marshall Islands"),
    MAURITANIA("Mauritania"), MAURITIUS("Mauritius"), MEXICO("Mexico"), MICRONESIA("Micronesia"), MOLDOVA("Moldova"), MONACO("Monaco"),
    MONGOLIA("Mongolia"), MONTENEGRO("Montenegro"), MOROCCO("Morocco"), MOZAMBIQUE("Mozambique"), MYANMARBURMA("Myanmar Burma"),
    NAMIBIA("Nambia"), NAURU("Nauru"), NEPAL("Nepal"), NETHERLANDS("Netherlands"), NEWZEALAND("New Zealand"), NICARAGUA("Nicaragua"),
    NIGER("Niger"), NIGERIA("Nigeria"), NORWAY("Norway"), OMAN("Oman"), PAKISTAN("Pakistan"), PALAU("Palau"), PANAMA("Panama"),
    PAPUANEWGUINEA("Papua New Guinea"), PARAGUAY("Paraguay"), PERU("Peru"), PHILIPPINES("Philippines"), POLAND("Poland"), PORTUGAL("Portugal"),
    QATAR("Qatar"), ROMANIA("Romania"), RUSSIA("Russia"), RWANDA("Rwanda"), STKITTSNEVIS("Saint Kitts and Nevis"), STLUCIA("Saint Lucia"),
    SAINTVINCENTANDTHEGRENADINES("Saint Vincent and the Grenadines"), SAMOA("Samoa"), SANMARINO("San Marino"),
    SAOTOMEANDPRINCIPE("Saotome and Principe"), SAUDIARABIA("Saudi Arabia"), SENEGAL("Senegal"), SERBIA("Serbia"), SEYCHELLES("Seychelles"),
    SIERRALEONE("Sierra Leone"), SINGAPORE("Singapore"), SLOVAKIA("Slovakia"), SLOVENIA("Slovenia"), SOLOMONISLANDS("Solomon Islands"),
    SOMALIA("Somalia"), SOUTHAFRICA("South Africa"), SOUTHSUDAN("South Sudan"), SPAIN("Spain"), SRILANKA("Srilanka"), SUDAN("Sudan"),
    SURINAME("Suriname"), SWAZILAND("Swaziland"), SWEDEN("Sweden"), SWITZERLAND("Switzerland"), SYRIA("Syria"), TAIWAN("Taiwan"),
    TAJIKISTAN("Tajikistan"), TANZANIA("Tanzania"), THAILAND("Thailand"), TOGO("Togo"), TONGA("Tonga"), TRINIDADANDTOBAGO("Trinidad and Tobago"),
    TUNISIA("Tunisia"), TURKEY("Turkey"), TURKMENISTAN("Turkmenistan"), TUVALU("Tuvalu"), UGANDA("Uganda"), UKRAINE("Ukraine"),
    UNITEDARABEMIRATES("United Arab Emirates"), UNITEDKINGDOM("United Kingdom"), UNITEDSTATES("United States"), URUGUAY("Uruguay"),
    UZBEKISTAN("Uzbekistan"), VANUATU("Vanuatu"), VATICANCITY("Vatican City"), VENEZUELA("Venezuela"), VIETNAM("Vietnam"),
    YEMEN("Yemen"), ZAMBIA("Zambia"), ZIMBABWE("Zimbabwe"), NOTHING_FOUND("Nothing Found");

    private static final Logger logger = LogManager.getLogger(Currencies.class);


    private String name;

    Countries(String name){
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Countries valueOfName(final String name) {
        final String enumName = name.toUpperCase().replaceAll(" ", "_");
        try {
            return valueOf(enumName);
        } catch (final IllegalArgumentException e) {
            return Countries.NOTHING_FOUND;
        }
    }


    @Override
    public String toString() {
        return "Countries{" +
                "Name='" + name + '\'' +
                '}';
    }
}
