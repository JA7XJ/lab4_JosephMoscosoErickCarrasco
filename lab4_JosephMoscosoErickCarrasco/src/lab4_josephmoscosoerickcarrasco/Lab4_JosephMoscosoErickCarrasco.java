/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_josephmoscosoerickcarrasco;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Joseph
 */
public class Lab4_JosephMoscosoErickCarrasco {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    static ArrayList<EVA> ev = new ArrayList();
    static ArrayList<Angeles> an = new ArrayList();
    static ArrayList<Piloto> pil = new ArrayList();

    public static void main(String[] args) {
        // TODO code application logic here
        inicializar();
        System.out.println("Bienvenido a Nerv");
        System.out.println("------------------------------------------------------");
        System.out.println("............................-*@WWWWWWWWWWWW+...............\n"
                + "\n"
                + "...........................+WWWWWWWWWWWWWW+................\n"
                + "\n"
                + "................**.........@WWWWWWWWWWWWWWWWW@+............\n"
                + "\n"
                + "................=W+........#WWWWWWWWWWWWWWWWWWWWW=.........\n"
                + "\n"
                + "..................#@-.....+WWWWWWWWWWWWWWWWWWWWWWWW+.......\n"
                + "\n"
                + "....................#=...=WWWWWWWWWWWWWWWWWWWWWWWWWW@......\n"
                + "\n"
                + ".....................-#WWWWWWWWWWWWWWWWWWWWWWWWWWWW#=......\n"
                + "\n"
                + "........-:::-...-:::-::+WWWWWWWWWWWWWWWWW@#WWWW@@-.........\n"
                + "\n"
                + "..........#WW@-...#...=WW+@WWWWWWWWWWWWWWW@#+..............\n"
                + "\n"
                + "..........=.#WW=..=...=WW-.#WWWWWWWWWWWWWWWWWW@-...........\n"
                + "\n"
                + "..........=..:WWW:=...=WW#@@.:WWWWWWWWWWWWWWWWW#...........\n"
                + "\n"
                + "..........=....=WW#...=WW-.*..-*WWWWWWWWWWWWWWWW#..........\n"
                + "\n"
                + "..........#.....-@#...=WW:...*#..*WWWWWWWWWWWWWWW:.........\n"
                + "\n"
                + "..................-................=WWWWWWWWWWWWW#.........\n"
                + "\n"
                + "........................:WW#+*@W=.-#WWWWWWWWWWWWWW=........\n"
                + "\n"
                + "........................-WW=...WW#..@WW#WWWWWWWWWW=........\n"
                + "\n"
                + "........................-WW=..*WW:..-@W@-#WWWWWWWW#........\n"
                + "\n"
                + "........................-WW=:WW@.....-WW#++@WWWWWW#........\n"
                + "\n"
                + "........................-WW=..#WW+....:WW+..-@WWWW#........\n"
                + "\n"
                + ".......................:=@@@+-.+@@#:...+*.....-@WW=........\n"
                + "\n"
                + "................................................:WW........");
        String[][] Radar1 = {{" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
        {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
        {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
        {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
        {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
        {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
        {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
        {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
        {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
        {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
        {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
        {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "}};
        
        Radar1 = asign(Radar1);
        
        int c = 1;
        while (c == 1) {
            System.out.println("------------------------------------------------------");
            System.out.println("1-Lista de EVAs "
                    + "2-Lista de Angeles "
                    + "3-Lista de Pilotos"
                    + "4-Simulación "
                    + "5-Salir");
            System.out.println("------------------------------------------------------");
            System.out.print("Ingrese un numero correspondiente a la opcion: ");
            int op = sc.nextInt();
            System.out.println("------------------------------------------------------");
            if (op == 1) {

            }
            if (op == 2) {

            }
            if (op == 3) {
                /*System.out.println("1-Listar\n"
                        + "2-Modificar datos\n"
                        + "3-Eliminar\n"
                        + "4-Crear"
                );
                System.out.println("------------------------------------------------------");
                System.out.print("Ingrese un numero correspondiente a la opcion: ");
                int op2 = sc.nextInt();
                System.out.println("------------------------------------------------------");
                if (op2==1) {
                    
                }
                if (op2==2) {
                    
                }
                if (op2==3) {
                    
                }
                if (op2==4) {
                    
                }
                if (op2<0||op2>4) {
                    
                }*/
            }
            if (op == 4) {
                //SIMULACION
                int lives1 = 8;
                int lives2 = 8;
                boolean simulador=true;
                int turn = 1;
                do{
                    if (turn == 1) {
                        System.out.println("User 1 turns");
                        
                    }
                    
                }while(simulador);
            }
            if (op == 5) {
                c = 0;
            }
            if (op < 0 || op > 5) {
                System.out.println("Error, opcion incorrecta");
            }
        }
        System.out.println("Fin del programa");
    }

    public static void inicializar() {
        pil.add(new Piloto("Rocho", 34, "Transa","Joseph", "X-R Echelon", 65.3, ev.get(0)));
        pil.add(new Piloto("Elmer", 37, "Chorro","Stale", "Pro-Alpha", 95.3, ev.get(1)));
        pil.add(new Piloto("Fryden", 28, "Pejelagarto","Ed", "Archive type 3", 34.9, ev.get(2)));
        pil.add(new Piloto("Joshua", 20, "Braulix","Suazzo", "PSM Elite", 88.7, ev.get(3)));
        pil.add(new Piloto("Carl", 29, "Dane","Elixius", "RP Echo", 78.2, ev.get(4)));
        pil.add(new Piloto("Props", 44, "Chicken","CJ", "Smokemouth", 31.8, ev.get(5)));
        pil.add(new Piloto("Mord", 19, "Elias","XP", "X-R Echelon", 65.3, ev.get(6)));
        pil.add(new Piloto("Rocho", 34, "Transa","Joseph", "X-R Echelon", 65.3, ev.get(7)));
        pil.add(new Piloto("Rocho", 34, "Transa","Joseph", "X-R Echelon", 65.3, ev.get(8)));
    }
    
    public static void ImpMatrix(String Matriz[][], int filas, int columnas){
        
        if (filas== Matriz.length-1 && columnas == Matriz[0].length-1) {
            System.out.println("[ "+Matriz[filas][columnas]+ " ]");
            
        } else {
            if (columnas == Matriz[0].length-1) {
                System.out.println("[ "+Matriz[filas][columnas]+ " ]");
                ImpMatrix(Matriz,filas+1,0);
            } else {
                System.out.print("[ "+Matriz[filas][columnas]+ " ]");
                ImpMatrix(Matriz, filas, columnas +1);
            }
        }
    }
    
    public static String [][] asign(String[][]radar){
        
        //
        radar [0][2] = "R";
        radar [0][7] = "R";
        radar [1][1] = "Z";
        radar [1][8] = "Z";
        radar [1][4] = "S";
        radar [1][5] = "S";
        radar [3][2] = "Z";
        radar [3][7] = "Z";
        
        radar[9][0] = "PM";
        radar[9][2] = "PM";
        radar[9][3] = "EV0";
        radar[9][4] = "EV1";
        radar[9][5] = "EV2";
        radar[9][6] = "EV0";
        radar[9][7] = "PM";
        radar[9][9] = "PM";
        
        return radar;
    }

}
