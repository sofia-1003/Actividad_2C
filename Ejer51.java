public class Ejer51 extends Base {

    public static void main(String[] args) {
    int num;
    char numrom='?';
    String umil="";
    String cen="";
    String dec="";
    String uni="";

    screen.println("Ingrese un numero del 1 al 3999");
    num=keyboard.nextInt();

        if(num/1000==3)
            umil="MMM";
        else if(num/1000==2)
            umil="MM";
        else if(num/1000==1)
            umil="M";

        num=num%1000;

        if(num/100==9)
            cen="MC";
        else if(num/100==8)
            cen="DCCC";
        else if(num/100==7)
            cen="DCC";
        else if(num/100==6)
            cen="DC";
        else if(num/100==5)
            cen="D";
        else if(num/100==4)
            cen="CD";
        else if(num/100==3)
            cen="CCC";
        else if(num/100==2)
            cen="CC";
        else if(num/100==1)
            cen="C";

        num=num%100;

        if(num/10==9)
            dec="XC";
        else if(num/10==8)
            dec="LXXX";
        else if(num/10==7)
            dec="LXX";
        else if(num/10==6)
            dec="LX";
        else if(num/10==5)
            dec="L";
        else if(num/10==4)
            dec="XL";
        else if(num/10==3)
            dec="XXX";
        else if(num/10==2)
            dec="XX";
        else if(num/10==1)
            dec="X";

        if(num%10==9)
            cen="IX";
        else if(num%10==8)
            cen="VIII";
        else if(num%10==7)
            cen="VII";
        else if(num%10==6)
            cen="VI";
        else if(num%10==5)
            cen="V";
        else if(num%10==4)
            cen="IV";
        else if(num%10==3)
            cen="III";
        else if(num%10==2)
            cen="II";
        else if(num%10==1)
            cen="I";

        screen.println("El numero que usted digito en romano es: "+ umil + cen + dec );
    }
}
