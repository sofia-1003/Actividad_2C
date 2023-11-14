public class Ejer52 extends Base {

    public static void main(String[] args) {
        String[] nombrejug ={"","","","","","","",""};
        String resul="";
        String ganadorajuego1="";
        String ganadorajuego2="";
        String ganadorajuego3="";
        String ganadorajuego4="";
        String ganadorajuego5="";
        String ganadorajuego6="";
        String ganadorajuego7="";

        screen.println("Ingrese el nombre de la jugadora #1");
        nombrejug[0]= keyboard.nextLine();
        screen.println("Ingrese el nombre de la jugadora #2");
        nombrejug[1]= keyboard.nextLine();
        screen.println("Ingrese el nombre de la jugadora #3");
        nombrejug[2]= keyboard.nextLine();
        screen.println("Ingrese el nombre de la jugadora #4");
        nombrejug[3]= keyboard.nextLine();
        screen.println("Ingrese el nombre de la jugadora #5");
        nombrejug[4]= keyboard.nextLine();
        screen.println("Ingrese el nombre de la jugadora #6");
        nombrejug[5]= keyboard.nextLine();
        screen.println("Ingrese el nombre de la jugadora #7");
        nombrejug[6]= keyboard.nextLine();
        screen.println("Ingrese el nombre de la jugadora #8");
        nombrejug[7]= keyboard.nextLine();


        screen.println("Partido #1: " +nombrejug[0]+ " vs " +nombrejug[7]);
        screen.println("Ingrese el resultado de este partido (2-0,2-1,1-2,0-2)");
        resul= keyboard.nextLine();
        if(resul.equals("2-0") || resul.equals("2-1"))
            ganadorajuego1=nombrejug[0];
        else
            ganadorajuego1=nombrejug[7];

        screen.println("La ganadora del partido #1 es: " +ganadorajuego1);


        screen.println("Partido #2: " +nombrejug[3]+ " vs " +nombrejug[4]);
        screen.println("Ingrese el resultado de este partido (2-0,2-1,1-2,0-2)");
        resul= keyboard.nextLine();
        if(resul.equals("2-0") || resul.equals("2-1"))
            ganadorajuego2=nombrejug[3];
        else
            ganadorajuego2=nombrejug[4];

        screen.println("La ganadora del partido #2 es: " +ganadorajuego2);


        screen.println("Partido #3: " +nombrejug[5]+ " vs " +nombrejug[2]);
        screen.println("Ingrese el resultado de este partido (2-0,2-1,1-2,0-2)");
        resul= keyboard.nextLine();
        if(resul.equals("2-0") || resul.equals("2-1"))
            ganadorajuego3=nombrejug[5];
        else
            ganadorajuego3=nombrejug[2];

        screen.println("La ganadora del partido #3 es: " +ganadorajuego3);


        screen.println("Partido #4: " +nombrejug[6]+ " vs " +nombrejug[1]);
        screen.println("Ingrese el resultado de este partido (2-0,2-1,1-2,0-2)");
        resul= keyboard.nextLine();
        if(resul.equals("2-0") || resul.equals("2-1"))
            ganadorajuego4=nombrejug[6];
        else
            ganadorajuego4=nombrejug[1];

        screen.println("La ganadora del partido #4 es: " +ganadorajuego4);


        screen.println("Partido #5: " +ganadorajuego1+ " vs " +ganadorajuego2);
        screen.println("Ingrese el resultado de este partido (2-0,2-1,1-2,0-2)");
        resul= keyboard.nextLine();
        if(resul.equals("2-0") || resul.equals("2-1"))
            ganadorajuego5=ganadorajuego1;
        else
            ganadorajuego5=ganadorajuego2;

        screen.println("La ganadora del partido #5 es: " +ganadorajuego5);


        screen.println("Partido #6: " +ganadorajuego3+ " vs " +ganadorajuego4);
        screen.println("Ingrese el resultado de este partido (2-0,2-1,1-2,0-2)");
        resul= keyboard.nextLine();
        if(resul.equals("2-0") || resul.equals("2-1"))
            ganadorajuego6=ganadorajuego3;
        else
            ganadorajuego6=ganadorajuego4;

        screen.println("La ganadora del partido #6 es: " +ganadorajuego6);


        screen.println("Partido #7(final): " +ganadorajuego5+ " vs " +ganadorajuego6);
        screen.println("Ingrese el resultado de este partido (2-0,2-1,1-2,0-2)");
        resul= keyboard.nextLine();
        if(resul.equals("2-0") || resul.equals("2-1"))
            ganadorajuego7=ganadorajuego5;
        else
            ganadorajuego7=ganadorajuego6;

        screen.println("La ganadora de la final (partido #7) es: " +ganadorajuego7);

    }
}
