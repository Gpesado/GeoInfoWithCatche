package ipResercher.models;

import java.util.ArrayList;

import org.apache.commons.codec.language.bm.Languages;

import ipResercher.models.Gini.Currencies;
import ipResercher.models.Gini.Demonyms;
import ipResercher.models.Gini.Idd;
import ipResercher.models.Gini.Maps;
import ipResercher.models.Gini.Translations;

public class CountryInfoData {
    Name Name;
    ArrayList<Object> tld = new ArrayList<Object>();
    private String cca2;
    private String ccn3;
    private String cca3;
    private String cioc;
    private boolean independent;
    private String status;
    private boolean unMember;
    Currencies Currencies;
    Idd Idd;
    ArrayList<Object> capital = new ArrayList<Object>();
    ArrayList<Object> altSpellings = new ArrayList<Object>();
    private String region;
    private String subregion;
    Languages Languages;
    Translations Translations;
    ArrayList<Object> latlng = new ArrayList<Object>();
    private boolean landlocked;
    ArrayList<Object> borders = new ArrayList<Object>();
    private float area;
    Demonyms Demonyms;
    private String flag;
    Maps Maps;
    private float population;
    Gini Gini;
    private String fifa;
    Car Car;
    ArrayList<Object> timezones = new ArrayList<Object>();
    ArrayList<Object> continents = new ArrayList<Object>();
    Flags Flags;
    CoatOfArms CoatOfArms;
    private String startOfWeek;
    CapitalInfo CapitalInfo;
    PostalCode PostalCode;

    // Getter Methods

    public Name getName() {
        return Name;
    }

    public String getCca2() {
        return cca2;
    }

    public String getCcn3() {
        return ccn3;
    }

    public String getCca3() {
        return cca3;
    }

    public String getCioc() {
        return cioc;
    }

    public boolean getIndependent() {
        return independent;
    }

    public String getStatus() {
        return status;
    }

    public boolean getUnMember() {
        return unMember;
    }

    public Currencies getCurrencies() {
        return Currencies;
    }

    public Idd getIdd() {
        return Idd;
    }

    public String getRegion() {
        return region;
    }

    public String getSubregion() {
        return subregion;
    }

    public Languages getLanguages() {
        return Languages;
    }

    public Translations getTranslations() {
        return Translations;
    }

    public boolean getLandlocked() {
        return landlocked;
    }

    public float getArea() {
        return area;
    }

    public Demonyms getDemonyms() {
        return Demonyms;
    }

    public String getFlag() {
        return flag;
    }

    public Maps getMaps() {
        return Maps;
    }

    public float getPopulation() {
        return population;
    }

    public Gini getGini() {
        return Gini;
    }

    public String getFifa() {
        return fifa;
    }

    public Car getCar() {
        return Car;
    }

    public Flags getFlags() {
        return Flags;
    }

    public CoatOfArms getCoatOfArms() {
        return CoatOfArms;
    }

    public String getStartOfWeek() {
        return startOfWeek;
    }

    public CapitalInfo getCapitalInfo() {
        return CapitalInfo;
    }

    public PostalCode getPostalCode() {
        return PostalCode;
    }

    // Setter Methods

    public void setName(Name name) {
        this.Name = name;
    }

    public void setCca2(String cca2) {
        this.cca2 = cca2;
    }

    public void setCcn3(String ccn3) {
        this.ccn3 = ccn3;
    }

    public void setCca3(String cca3) {
        this.cca3 = cca3;
    }

    public void setCioc(String cioc) {
        this.cioc = cioc;
    }

    public void setIndependent(boolean independent) {
        this.independent = independent;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUnMember(boolean unMember) {
        this.unMember = unMember;
    }

    public void setCurrencies(Currencies currencies) {
        this.Currencies = currencies;
    }

    public void setIdd(Idd idd) {
        this.Idd = idd;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public void setLanguages(Languages languages) {
        this.Languages = languages;
    }

    public void setTranslations(Translations translations) {
        this.Translations = translations;
    }

    public void setLandlocked(boolean landlocked) {
        this.landlocked = landlocked;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setDemonyms(Demonyms demonyms) {
        this.Demonyms =demonyms;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public void setMaps(Maps maps) {
        this.Maps = maps;
    }

    public void setPopulation(float population) {
        this.population = population;
    }

    public void setGini(Gini gini) {
        this.Gini = gini;
    }

    public void setFifa(String fifa) {
        this.fifa = fifa;
    }

    public void setCar(Car car) {
        this.Car = car;
    }

    public void setFlags(Flags flags) {
        this.Flags = flags;
    }

    public void setCoatOfArms(CoatOfArms coatOfArms) {
        this.CoatOfArms = coatOfArms;
    }

    public void setStartOfWeek(String startOfWeek) {
        this.startOfWeek = startOfWeek;
    }

    public void setCapitalInfo(CapitalInfo capitalInfo) {
        this.CapitalInfo = capitalInfo;
    }

    public void setPostalCode(PostalCode postalCode) {
        this.PostalCode = postalCode;
    }
}

public class Name {
    private String common;
    private String official;
    NativeName NativeName;

    // Getter Methods

    public String getCommon() {
        return common;
    }

    public String getOfficial() {
        return official;
    }

    public NativeName getNativeName() {
        return NativeName;
    }

    // Setter Methods

    public void setCommon(String common) {
        this.common = common;
    }

    public void setOfficial(String official) {
        this.official = official;
    }

    public void setNativeName(NativeName nativeName) {
        this.NativeName = nativeName;
    }
}

public class NativeName {
    Grn Grn;
    Spa Spa;

    // Getter Methods

    public Grn getGrn() {
        return Grn;
    }

    public Spa getSpa() {
        return Spa;
    }

    // Setter Methods

    public void setGrn(Grn grn) {
        this.Grn = grn;
    }

    public void setSpa(Spa spa) {
        this.Spa = spa;
    }
}

public class Spa {
    private String official;
    private String common;

    // Getter Methods

    public String getOfficial() {
        return official;
    }

    public String getCommon() {
        return common;
    }

    // Setter Methods

    public void setOfficial(String official) {
        this.official = official;
    }

    public void setCommon(String common) {
        this.common = common;
    }
}

public class Grn {
    private String official;
    private String common;

    // Getter Methods

    public String getOfficial() {
        return official;
    }

    public String getCommon() {
        return common;
    }

    // Setter Methods

    public void setOfficial(String official) {
        this.official = official;
    }

    public void setCommon(String common) {
        this.common = common;
    }
}

public class PostalCode {
    private String format;
    private String regex;

    // Getter Methods

    public String getFormat() {
        return format;
    }

    public String getRegex() {
        return regex;
    }

    // Setter Methods

    public void setFormat(String format) {
        this.format = format;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }
}

public class CapitalInfo {
    ArrayList<Object> latlng = new ArrayList<Object>();

    // Getter Methods

    // Setter Methods

}

public class CoatOfArms {
    private String png;
    private String svg;

    // Getter Methods

    public String getPng() {
        return png;
    }

    public String getSvg() {
        return svg;
    }

    // Setter Methods

    public void setPng(String png) {
        this.png = png;
    }

    public void setSvg(String svg) {
        this.svg = svg;
    }
}

public class Flags {
    private String png;
    private String svg;
    private String alt;

    // Getter Methods

    public String getPng() {
        return png;
    }

    public String getSvg() {
        return svg;
    }

    public String getAlt() {
        return alt;
    }

    // Setter Methods

    public void setPng(String png) {
        this.png = png;
    }

    public void setSvg(String svg) {
        this.svg = svg;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }
}

public class Car {
    ArrayList<Object> signs = new ArrayList<Object>();
    private String side;

    // Getter Methods

    public String getSide() {
        return side;
    }

    // Setter Methods

    public void setSide(String side) {
        this.side = side;
    }
}

public class Gini {
  private float year;


 // Getter Methods 

  public float getYear() {
    return year;
  }

    // Setter Methods

  public void setYear( float year) {
    this.year = year;
  }
}

    public class Maps {
        private String googleMaps;
        private String openStreetMaps;

        // Getter Methods

        public String getGoogleMaps() {
            return googleMaps;
        }

        public String getOpenStreetMaps() {
            return openStreetMaps;
        }

        // Setter Methods

        public void setGoogleMaps(String googleMaps) {
            this.googleMaps = googleMaps;
        }

        public void setOpenStreetMaps(String openStreetMaps) {
            this.openStreetMaps = openStreetMaps;
        }
    }

    public class Demonyms {
        Eng Eng;
        Fra Fra;

        // Getter Methods

        public Eng getEng() {
            return Eng;
        }

        public Fra getFra() {
            return Fra;
        }

        // Setter Methods

        public void setEng(Eng eng) {
            this.Eng = eng;
        }

        public void setFra(Fra fra) {
            this.Fra = fra;
        }
    }

    public class Fra {
        private String f;
        private String m;

        // Getter Methods

        public String getF() {
            return f;
        }

        public String getM() {
            return m;
        }

        // Setter Methods

        public void setF(String f) {
            this.f = f;
        }

        public void setM(String m) {
            this.m = m;
        }
    }

    public class Eng {
        private String f;
        private String m;

        // Getter Methods

        public String getF() {
            return f;
        }

        public String getM() {
            return m;
        }

        // Setter Methods

        public void setF(String f) {
            this.f = f;
        }

        public void setM(String m) {
            this.m = m;
        }
    }

    public class Translations {
        Ara Ara;
        Bre Bre;
        Ces Ces;
        Cym Cym;
        Deu Deu;
        Est Est;
        Fin Fin;
        Fra Fra;
        Hrv Hrv;
        Hun Hun;
        Ita Ita;
        Jpn Jpn;
        Kor Kor;
        Nld Nld;
        Per Per;
        Pol Pol;
        Por Por;
        Rus Rus;
        Slk Slk;
        Spa Spa;
        Srp Srp;
        Swe Swe;
        Tur Tur;
        Urd Urd;
        Zho Zho;

        // Getter Methods

        public Ara getAra() {
            return Ara;
        }

        public Bre getBre() {
            return Bre;
        }

        public Ces getCes() {
            return Ces;
        }

        public Cym getCym() {
            return Cym;
        }

        public Deu getDeu() {
            return Deu;
        }

        public Est getEst() {
            return Est;
        }

        public Fin getFin() {
            return Fin;
        }

        public Fra getFra() {
            return Fra;
        }

        public Hrv getHrv() {
            return Hrv;
        }

        public Hun getHun() {
            return Hun;
        }

        public Ita getIta() {
            return Ita;
        }

        public Jpn getJpn() {
            return Jpn;
        }

        public Kor getKor() {
            return Kor;
        }

        public Nld getNld() {
            return Nld;
        }

        public Per getPer() {
            return Per;
        }

        public Pol getPol() {
            return Pol;
        }

        public Por getPor() {
            return Por;
        }

        public Rus getRus() {
            return Rus;
        }

        public Slk getSlk() {
            return Slk;
        }

        public Spa getSpa() {
            return Spa;
        }

        public Srp getSrp() {
            return Srp;
        }

        public Swe getSwe() {
            return Swe;
        }

        public Tur getTur() {
            return Tur;
        }

        public Urd getUrd() {
            return Urd;
        }

        public Zho getZho() {
            return Zho;
        }

        // Setter Methods

        public void setAra(Ara ara) {
            this.Ara = ara;
        }

        public void setBre(Bre bre) {
            this.Bre = bre;
        }

        public void setCes(Ces ces) {
            this.Ces = ces;
        }

        public void setCym(Cym cym) {
            this.Cym = cym;
        }

        public void setDeu(Deu deu) {
            this.Deu = deu;
        }

        public void setEst(Est est) {
            this.Est = est;
        }

        public void setFin(Fin fin) {
            this.Fin = fin;
        }

        public void setFra(Fra fra) {
            this.Fra = fra;
        }

        public void setHrv(Hrv hrv) {
            this.Hrv = hrv;
        }

        public void setHun(Hun hun) {
            this.Hun = hun;
        }

        public void setIta(Ita ita) {
            this.Ita = ita;
        }

        public void setJpn(Jpn jpn) {
            this.Jpn = jpn;
        }

        public void setKor(Kor kor) {
            this.Kor = kor;
        }

        public void setNld(Nld nld) {
            this.Nld = nld;
        }

        public void setPer(Per per) {
            this.Per = per;
        }

        public void setPol(Pol pol) {
            this.Pol = pol;
        }

        public void setPor(Por por) {
            this.Por = por;
        }

        public void setRus(Rus rus) {
            this.Rus = rus;
        }

        public void setSlk(Slk slk) {
            this.Slk = slk;
        }

        public void setSpa(Spa spa) {
            this.Spa = spa;
        }

        public void setSrp(Srp srp) {
            this.Srp = srp;
        }

        public void setSwe(Swe swe) {
            this.Swe = swe;
        }

        public void setTur(Tur tur) {
            this.Tur = tur;
        }

        public void setUrd(Urd urd) {
            this.Urd = urd;
        }

        public void setZho(Zho zho) {
            this.Zho = zho;
        }
    }

    public class Zho {
        private String official;
        private String common;

        // Getter Methods

        public String getOfficial() {
            return official;
        }

        public String getCommon() {
            return common;
        }

        // Setter Methods

        public void setOfficial(String official) {
            this.official = official;
        }

        public void setCommon(String common) {
            this.common = common;
        }
    }

    public class Urd {
        private String official;
        private String common;

        // Getter Methods

        public String getOfficial() {
            return official;
        }

        public String getCommon() {
            return common;
        }

        // Setter Methods

        public void setOfficial(String official) {
            this.official = official;
        }

        public void setCommon(String common) {
            this.common = common;
        }
    }

    public class Tur {
        private String official;
        private String common;

        // Getter Methods

        public String getOfficial() {
            return official;
        }

        public String getCommon() {
            return common;
        }

        // Setter Methods

        public void setOfficial(String official) {
            this.official = official;
        }

        public void setCommon(String common) {
            this.common = common;
        }
    }

    public class Swe {
        private String official;
        private String common;

        // Getter Methods

        public String getOfficial() {
            return official;
        }

        public String getCommon() {
            return common;
        }

        // Setter Methods

        public void setOfficial(String official) {
            this.official = official;
        }

        public void setCommon(String common) {
            this.common = common;
        }
    }

    public class Srp {
        private String official;
        private String common;

        // Getter Methods

        public String getOfficial() {
            return official;
        }

        public String getCommon() {
            return common;
        }

        // Setter Methods

        public void setOfficial(String official) {
            this.official = official;
        }

        public void setCommon(String common) {
            this.common = common;
        }
    }

    public class Spa {
        private String official;
        private String common;

        // Getter Methods

        public String getOfficial() {
            return official;
        }

        public String getCommon() {
            return common;
        }

        // Setter Methods

        public void setOfficial(String official) {
            this.official = official;
        }

        public void setCommon(String common) {
            this.common = common;
        }
    }

    public class Slk {
        private String official;
        private String common;

        // Getter Methods

        public String getOfficial() {
            return official;
        }

        public String getCommon() {
            return common;
        }

        // Setter Methods

        public void setOfficial(String official) {
            this.official = official;
        }

        public void setCommon(String common) {
            this.common = common;
        }
    }

    public class Rus {
        private String official;
        private String common;

        // Getter Methods

        public String getOfficial() {
            return official;
        }

        public String getCommon() {
            return common;
        }

        // Setter Methods

        public void setOfficial(String official) {
            this.official = official;
        }

        public void setCommon(String common) {
            this.common = common;
        }
    }

    public class Por {
        private String official;
        private String common;

        // Getter Methods

        public String getOfficial() {
            return official;
        }

        public String getCommon() {
            return common;
        }

        // Setter Methods

        public void setOfficial(String official) {
            this.official = official;
        }

        public void setCommon(String common) {
            this.common = common;
        }
    }

    public class Pol {
        private String official;
        private String common;

        // Getter Methods

        public String getOfficial() {
            return official;
        }

        public String getCommon() {
            return common;
        }

        // Setter Methods

        public void setOfficial(String official) {
            this.official = official;
        }

        public void setCommon(String common) {
            this.common = common;
        }
    }

    public class Per {
        private String official;
        private String common;

        // Getter Methods

        public String getOfficial() {
            return official;
        }

        public String getCommon() {
            return common;
        }

        // Setter Methods

        public void setOfficial(String official) {
            this.official = official;
        }

        public void setCommon(String common) {
            this.common = common;
        }
    }

    public class Nld {
        private String official;
        private String common;

        // Getter Methods

        public String getOfficial() {
            return official;
        }

        public String getCommon() {
            return common;
        }

        // Setter Methods

        public void setOfficial(String official) {
            this.official = official;
        }

        public void setCommon(String common) {
            this.common = common;
        }
    }

    public class Kor {
        private String official;
        private String common;

        // Getter Methods

        public String getOfficial() {
            return official;
        }

        public String getCommon() {
            return common;
        }

        // Setter Methods

        public void setOfficial(String official) {
            this.official = official;
        }

        public void setCommon(String common) {
            this.common = common;
        }
    }

    public class Jpn {
        private String official;
        private String common;

        // Getter Methods

        public String getOfficial() {
            return official;
        }

        public String getCommon() {
            return common;
        }

        // Setter Methods

        public void setOfficial(String official) {
            this.official = official;
        }

        public void setCommon(String common) {
            this.common = common;
        }
    }

    public class Ita {
        private String official;
        private String common;

        // Getter Methods

        public String getOfficial() {
            return official;
        }

        public String getCommon() {
            return common;
        }

        // Setter Methods

        public void setOfficial(String official) {
            this.official = official;
        }

        public void setCommon(String common) {
            this.common = common;
        }
    }

    public class Hun {
        private String official;
        private String common;

        // Getter Methods

        public String getOfficial() {
            return official;
        }

        public String getCommon() {
            return common;
        }

        // Setter Methods

        public void setOfficial(String official) {
            this.official = official;
        }

        public void setCommon(String common) {
            this.common = common;
        }
    }

    public class Hrv {
        private String official;
        private String common;

        // Getter Methods

        public String getOfficial() {
            return official;
        }

        public String getCommon() {
            return common;
        }

        // Setter Methods

        public void setOfficial(String official) {
            this.official = official;
        }

        public void setCommon(String common) {
            this.common = common;
        }
    }

    public class Fra {
        private String official;
        private String common;

        // Getter Methods

        public String getOfficial() {
            return official;
        }

        public String getCommon() {
            return common;
        }

        // Setter Methods

        public void setOfficial(String official) {
            this.official = official;
        }

        public void setCommon(String common) {
            this.common = common;
        }
    }

    public class Fin {
        private String official;
        private String common;

        // Getter Methods

        public String getOfficial() {
            return official;
        }

        public String getCommon() {
            return common;
        }

        // Setter Methods

        public void setOfficial(String official) {
            this.official = official;
        }

        public void setCommon(String common) {
            this.common = common;
        }
    }

    public class Est {
        private String official;
        private String common;

        // Getter Methods

        public String getOfficial() {
            return official;
        }

        public String getCommon() {
            return common;
        }

        // Setter Methods

        public void setOfficial(String official) {
            this.official = official;
        }

        public void setCommon(String common) {
            this.common = common;
        }
    }

    public class Deu {
        private String official;
        private String common;

        // Getter Methods

        public String getOfficial() {
            return official;
        }

        public String getCommon() {
            return common;
        }

        // Setter Methods

        public void setOfficial(String official) {
            this.official = official;
        }

        public void setCommon(String common) {
            this.common = common;
        }
    }

    public class Cym {
        private String official;
        private String common;

        // Getter Methods

        public String getOfficial() {
            return official;
        }

        public String getCommon() {
            return common;
        }

        // Setter Methods

        public void setOfficial(String official) {
            this.official = official;
        }

        public void setCommon(String common) {
            this.common = common;
        }
    }

    public class Ces {
        private String official;
        private String common;

        // Getter Methods

        public String getOfficial() {
            return official;
        }

        public String getCommon() {
            return common;
        }

        // Setter Methods

        public void setOfficial(String official) {
            this.official = official;
        }

        public void setCommon(String common) {
            this.common = common;
        }
    }

    public class Bre {
        private String official;
        private String common;

        // Getter Methods

        public String getOfficial() {
            return official;
        }

        public String getCommon() {
            return common;
        }

        // Setter Methods

        public void setOfficial(String official) {
            this.official = official;
        }

        public void setCommon(String common) {
            this.common = common;
        }
    }

    public class Ara {
        private String official;
        private String common;

        // Getter Methods

        public String getOfficial() {
            return official;
        }

        public String getCommon() {
            return common;
        }

        // Setter Methods

        public void setOfficial(String official) {
            this.official = official;
        }

        public void setCommon(String common) {
            this.common = common;
        }
    }

    public class Languages {
        private String grn;
        private String spa;

        // Getter Methods

        public String getGrn() {
            return grn;
        }

        public String getSpa() {
            return spa;
        }

        // Setter Methods

        public void setGrn(String grn) {
            this.grn = grn;
        }

        public void setSpa(String spa) {
            this.spa = spa;
        }
    }

    public class Idd {
        private String root;
        ArrayList<Object> suffixes = new ArrayList<Object>();

        // Getter Methods

        public String getRoot() {
            return root;
        }

        // Setter Methods

        public void setRoot(String root) {
            this.root = root;
        }
    }

    public class Currencies {
        ARS ARS;

        // Getter Methods

        public ARS getARS() {
            return ARS;
        }

        // Setter Methods

        public void setARS(ARS ARS) {
            this.ARS = ARS;
        }
    }

    public class ARS {
        private String name;
        private String symbol;

        // Getter Methods

        public String getName() {
            return name;
        }

        public String getSymbol() {
            return symbol;
        }

        // Setter Methods

        public void setName(String name) {
            this.name = name;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }
    }

    public class Name {
        private String common;
        private String official;
        NativeName NativeName;

        // Getter Methods

        public String getCommon() {
            return common;
        }

        public String getOfficial() {
            return official;
        }

        public NativeName getNativeName() {
            return NativeName;
        }

        // Setter Methods

        public void setCommon(String common) {
            this.common = common;
        }

        public void setOfficial(String official) {
            this.official = official;
        }

        public void setNativeName(NativeName nativeName) {
            this.NativeName = nativeName;
        }
    }

    public class NativeName {
        Grn Grn;
        Spa Spa;

        // Getter Methods

        public Grn getGrn() {
            return Grn;
        }

        public Spa getSpa() {
            return Spa;
        }

        // Setter Methods

        public void setGrn(Grn grn) {
            this.Grn = grn;
        }

        public void setSpa(Spa spa) {
            this.Spa = spa;
        }
    }

    public class Spa {
        private String official;
        private String common;

        // Getter Methods

        public String getOfficial() {
            return official;
        }

        public String getCommon() {
            return common;
        }

        // Setter Methods

        public void setOfficial(String official) {
            this.official = official;
        }

        public void setCommon(String common) {
            this.common = common;
        }
    }

public class Grn {
  private String official;
  private String common;


 // Getter Methods 

  public String getOfficial() {
    return official;
  }

  public String getCommon() {
    return common;
  }

 // Setter Methods 

  public void setOfficial( String official ) {
    this.official = official;
  }

  public void setCommon( String common ) {
    this.common = common;
  }
}
