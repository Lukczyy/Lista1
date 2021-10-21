public class Main {
    public static void main(String[] args) {
        int indeks=1;
        double b1;
        double b2;
        double b3;
        double b4;
        double kat;
        Kolo k = new Kolo();
        Pieciokat p = new Pieciokat();
        Szesciokat s = new Szesciokat();
        Kwadrat ck = new Kwadrat();
        Prostokat cp = new Prostokat();
        Romb cr = new Romb();
        try {
            for (int i = 0; i < args[0].length(); i++) {
                switch (args[0].charAt(i)) {
                    case 'k':
                        try {
                            k.r = Double.parseDouble(args[indeks]);
                            if(k.r<0) throw new MyException("promien nie moze byc ujemny");
                            System.out.println("Pole: " + k.ObliczPole());
                            System.out.println("Obwod: " + k.ObliczObwod());
                            indeks++;
                        } catch (NumberFormatException e) {
                            System.out.println("bledne dane");
                        } catch (MyException e) {
                            System.out.println(e.getMessage());
                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("bledna ilosc danych");
                        }
                        break;
                    case 'p':
                        try {
                            p.a = Double.parseDouble(args[indeks]);
                            if(p.a<0) throw new MyException("bok nie moze byc ujemny");
                            System.out.println("Pole: "+p.ObliczPole());
                            System.out.println("Obwod: "+p.ObliczObwod());
                            indeks++;
                        } catch (NumberFormatException e) {
                            System.out.println("bledne dane");
                        } catch (MyException e) {
                            System.out.println(e.getMessage());
                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("bledna ilosc danych");
                        }
                        break;
                    case 's':
                        try {
                            s.a = Double.parseDouble(args[indeks]);
                            if(s.a < 0) throw new MyException("promien nie moze byc ujemny");
                            System.out.println("Pole: " + s.ObliczPole());
                            System.out.println("Obwod: " + s.ObliczObwod());
                            indeks++;
                        } catch (NumberFormatException e) {
                            System.out.println("bledne dane");
                        } catch (MyException e) {
                            System.out.println(e.getMessage());
                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("bledna ilosc danych");
                        }
                        break;
                    case 'c':
                        try {
                            b1 = Double.parseDouble(args[indeks]);
                            b2 = Double.parseDouble(args[indeks+1]);
                            b3 = Double.parseDouble(args[indeks+2]);
                            b4 = Double.parseDouble(args[indeks+3]);
                            kat = Double.parseDouble(args[indeks+4]);
                            if(b1<0||b2<0||b3<0||b4<0||kat<0||kat>180) throw new MyException("bledne dane");
                            if(b1==b2&&b2==b3&&b3==b4) {
                                if(kat == 90) {
                                    ck.a=b1;
                                    System.out.println(ck.ObliczPole());
                                    System.out.println(ck.ObliczObwod());
                                } else {
                                    cr.a=b1;
                                    cr.kat=Math.toRadians(kat);
                                    System.out.println(cr.ObliczPole());
                                    System.out.println(cr.ObliczObwod());
                                }
                            } else {
                                if (((b1==b2&&b3==b4)||(b1==b3&&b2==b4)||(b1==b4&&b2==b3))&&kat==90) {
                                    if (b1==b2) {
                                        if(b1==b3)
                                            b2=b4;
                                        else
                                            b2=b3;
                                    }
                                    cp.a=b1;
                                    cp.b=b2;
                                    System.out.println(cp.ObliczPole());
                                    System.out.println(cp.ObliczObwod());
                                } else throw new MyException("bledne dane");
                            }
                            indeks+=5;
                        } catch (NumberFormatException e){System.out.println("niepoprawny argument");
                        } catch (ArrayIndexOutOfBoundsException e){System.out.println("bledna ilosc argumentow");
                        } catch ( MyException e ) {System.out.println(e.getMessage());
                        }
                        break;
                    default:
                        System.out.println("bledny typ figury");
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("brak danych");
        }
    }
}
