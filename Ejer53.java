package src;

public class Ej4 extends Base{

    public static void main(String[] args) {
    String numrom;
    String numromtemp;
    int numarabigo=0;

    screen.println("Ingrese un numero romano entre I(1) y MMMCMXCIX (3999)");
    numrom=keyboard.nextLine().trim().toUpperCase();
    numromtemp=numrom;

    if(numromtemp.startsWith("MMM")){
        numarabigo+=3000;
        numromtemp=numromtemp.substring(3);
    }else if(numromtemp.startsWith("MM")){
        numarabigo+=2000;
        numromtemp=numromtemp.substring(2);
    }else if(numromtemp.charAt(0) == 'M'){
        numarabigo+=1000;
        numromtemp=numromtemp.substring(1);
    }
    if(numromtemp.startsWith("DCCC")){
        numarabigo+=800;
        numromtemp=numromtemp.substring(4);
    }else if(numromtemp.startsWith("DCC")){
        numarabigo+=700;
        numromtemp=numromtemp.substring(3);
    }else if(numromtemp.startsWith("CCC")){
        numarabigo+=300;
        numromtemp=numromtemp.substring(3);
    }else if(numromtemp.startsWith("CM")){
        numarabigo+=900;
        numromtemp=numromtemp.substring(2);
    } else if (numromtemp.startsWith("DC")) {
        numarabigo+=600;
        numromtemp=numromtemp.substring(2);
    } else if (numromtemp.startsWith("CD")) {
        numarabigo+=400;
        numromtemp=numromtemp.substring(2);
    } else if (numromtemp.startsWith("cc")) {
        numarabigo+=200;
        numromtemp=numromtemp.substring(2);
    } else if (numromtemp.startsWith("D")) {
        numarabigo+=500;
        numromtemp=numromtemp.substring(1);
    }else if (numromtemp.startsWith("C")){
        numarabigo+=100;
        numromtemp=numromtemp.substring(1);
    }

    if(numromtemp.startsWith("LXXXX")){
        numarabigo+=80;
        numromtemp=numromtemp.substring(4);
    }else if(numromtemp.startsWith("LXX")){
        numarabigo+=70;
        numromtemp=numromtemp.substring(3);
    }else if(numromtemp.startsWith("XXX")){
        numarabigo+=30;
        numromtemp=numromtemp.substring(3);
    }else if(numromtemp.startsWith("XC")){
        numarabigo+=90;
        numromtemp=numromtemp.substring(2);
    }else if(numromtemp.startsWith("LX")){
        numarabigo+=60;
        numromtemp=numromtemp.substring(2);
    }else if(numromtemp.startsWith("XL")){
        numarabigo+=40;
        numromtemp=numromtemp.substring(2);
    }else if(numromtemp.startsWith("XX")){
        numarabigo+=20;
        numromtemp=numromtemp.substring(2);
    }else if(numromtemp.startsWith("L")){
        numarabigo+=50;
        numromtemp=numromtemp.substring(1);
    }else if(numromtemp.startsWith("X")){
        numarabigo+=10;
        numromtemp=numromtemp.substring(1);
    }
    if(numromtemp.startsWith("VIII")){
            numarabigo+=8;
            numromtemp=numromtemp.substring(4);
    }else if(numromtemp.startsWith("VII")){
        numarabigo+=7;
        numromtemp=numromtemp.substring(3);
    }else if(numromtemp.startsWith("III")){
        numarabigo+=3;
        numromtemp=numromtemp.substring(3);
    }else if(numromtemp.startsWith("IX")){
        numarabigo+=9;
        numromtemp=numromtemp.substring(2);
    }else if(numromtemp.startsWith("VI")){
        numarabigo+=6;
        numromtemp=numromtemp.substring(2);
    }else if(numromtemp.startsWith("IV")){
        numarabigo+=4;
        numromtemp=numromtemp.substring(2);
    }else if(numromtemp.startsWith("II")){
        numarabigo+=2;
        numromtemp=numromtemp.substring(2);
    }else if(numromtemp.startsWith("V")){
        numarabigo+=5;
        numromtemp=numromtemp.substring(1);
    }else if(numromtemp.startsWith("I")){
        numarabigo+=1;
        numromtemp=numromtemp.substring(1);
    }

        screen.println(numarabigo);
    }
}
