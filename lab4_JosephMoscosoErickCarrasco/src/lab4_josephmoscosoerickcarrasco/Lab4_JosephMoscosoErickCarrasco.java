/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_josephmoscosoerickcarrasco;

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
    //Arraylist<evas> e=new ArrayList();
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
    public static void inicializar(){
        
    }

}
