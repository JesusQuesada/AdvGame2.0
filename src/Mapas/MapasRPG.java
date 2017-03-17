/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapas;

import Ventanas.ventanaGeneral;
import java.util.Scanner;
import javax.swing.JLabel;
/**
 *
 * @author JesusQuesada
 */
public class MapasRPG {
    
    //public void  sector1(){
      int T,btns;  
      public String [][] maps = new String[50][50];  

    public String[][] cargarJuego() {
        
        maps [0][0] ="<html><p>Al entrar en el bosque ves un reflejo a lo lejos de lo que parece ser un lago. Por encima de los árboles ves humo, posiblemente los restos de una hoguera reciente. Entre los árboles ves una cabaña al abrigo de la ladera de la montaña.</p></html>";
        maps [0][1] ="Inspeccionar el lago";
        maps [1][0] ="Inspeccionar la hoguera";
        maps [1][1] ="Inspeccionar la cabaña";
        
        maps [2][0] ="<html><p>El lago parece tener un objeto en el fondo. A su lado ves un camino.</p></html>";
        maps [2][1] ="Te zambulles en el agua";
        maps [1][2] ="Intentas alcanzar el objeto con una rama";
        maps [2][2] ="Sigues por el camino";
        
        maps [3][0] ="<html><p>Al llegar compruebas que todavía quedan algunos rescoldos en la hoguera y parece tener algo clavado justo en el centro. A unos metros ves un camino.</p></html>";
        maps [3][1] ="Aprovechas las brasas para entrar en calor";
        maps [1][3] ="Te diriges hacia el camino";
        maps [3][3] =null;
        
        maps [4][0] ="<html><p>La cabaña está situada en la ladera de la montaña y entre una y otra ves un camino que serpentea hasta la cima. Al otro lado ves un pozo.</p></html>";
        maps [4][1] ="Examinas el pozo";
        maps [1][4] ="Examinas la cabaña";
        maps [4][4] ="Te diriges hacia la cima de la montaña";
        
        maps [5][0] ="<html><p>Te zambulles en el agua y cuando estás a punto de alcanzar el objeto, algo te agarra la pierna y tira de ti. Intentas escapar pero no lo consigues y cada vez tienes menos fuerzas. No puedes aguantar la respiración más tiempo y decides dejar de resistirte y afrontar tu destino.</p><br></br><p>FIN</p></html>";
        maps [5][1] ="Volver a empezar";
        maps [1][5] =null;
        maps [5][5] =null;
        
        maps [6][0] ="<html><p>Con la ayuda de una rama consigues acercar el objeto lo suficiente para cogerlo con la mano pero al introducirla en el agua, sientes que algo te agarra. Cuando consigues soltarte unos tentáculos emergen y te atacan</p></html>";
        maps [6][1] ="Huyes";
        maps [1][6] ="Luchas";
        maps [6][6] =null;
        
        maps [7][0] ="<html><p>El camino te lleva de vuelta a la entrada del bosque.</p></html>";
        maps [7][1] ="Vuelves";
        maps [1][7] =null;
        maps [7][7] =null;
        
        maps [8][0] ="<html><p>Al acercarte examinas el objeto del centro y al tocarlo la hoguera se aviva. Te sientas y sientes como se recuperan tus fuerzas al calor del fuego. Tras un rato decides proseguir la marcha</p></html>";
        maps [8][1] ="Continúa";
        maps [1][8] =null;
        maps [8][8] =null;
        
        maps [9][0] ="<html><p>A medio camino, de la nada aparece un caballero de aspecto imponente. Su armadura es totalmente negra y antes de darte cuenta ejecuta un movimiento con su espada que no eres capaz de esquivar. Recibes el golpe a la altura del cuello y todo empieza a girar hasta que tu cabeza toca el suelo.</p><br></br><p>FIN</p></html>";
        maps [9][1] ="Volver a empezar";
        maps [1][9] =null;
        maps [9][9] =null;
        
        maps [10][0] ="<html><p>Lanzas una piedra pero no llegas a oir sonido alguno.</p></html>";
        maps [10][1] ="Te lanzas al pozo";
        maps [1][10] ="Vuelves a la zona de la cabaña";
        maps [10][10] =null;
        
        maps [11][0] ="<html><p>La cabaña parece estar vacía. Rebuscas entre las cosas y encuentras un mapa del bosque. Al recogerlo escuchas unas voces y sales a investigar. Ves a dos personas acercarse por el camino en dirección a la cabaña.</p></html>";
        maps [11][1] ="Huyes con el mapa";
        maps [1][11] ="Esperas a que lleguen";
        maps [11][11] =null;
        
        maps [12][0] ="<html><p>Inicias el ascenso. Tras 4 horas todavía no has llegado a la cima. Cada vez hace más frío y a lo lejos parece que se está formando una tormenta</p></html>";
        maps [12][1] ="Continuas";
        maps [1][12] ="Decides emprender el descenso";
        maps [12][12] =null;
        
        maps [13][0] ="<html><p>Te giras y comienzas a correr pero te tropiezas con la rama que utilizaste y caes al suelo. Un tentáculo te agarra la pierna y te arrastra dentro del lago. Te ahogas antes de ser devorado por la bestia.</p><br></br><p>FIN</p></html>";
        maps [13][1] ="Volver a empezar";
        maps [1][13] =null;
        maps [13][13] =null;
        
        maps [14][0] ="<html><p>Desenvainas tu espada y con un movimiento certero consigues cortar uno de los tentáculos. El resto vuelven a sumergirse en el lago y te planteas que hacer.</p></html>";
        maps [14][1] ="Te acercas con la intención de rematarla";
        maps [1][14] ="Te marchas";
        maps [14][14] =null;
        
        maps [15][0] ="<html><p>A medio camino, de la nada aparece un caballero de aspecto imponente. Su armadura es totalmente negra y antes de darte cuenta ejecuta un movimiento con la espada que milagrosamente logras esquivar. Con un rápido movimiento derribas al caballero. Al tocar el suelo, la armadura se hace pedazos y observas asombrado que no había nadie en su interior.</p></html>";
        maps [15][1] ="Continuas avanzando por el camino";
        maps [1][15] =null;
        maps [15][15] =null;
        
        maps [16][0] ="<html><p>Te lanzas al pozo con la esperanza de que tenga todavía agua y por suerte así es. Cuando emerges observas a tu alrededor una caverna bastante amplia. Al salir del agua ves montones y montones de huesos humanos y, entre ellos, un hacha vieja. La recoges y buscando una salida te topas con dos caminos.<p><html>";
        maps [16][1] ="Eliges el camino de la izquierda";
        maps [1][16] ="Eliges el camino de la derecha";
        maps [16][16] =null;
        
        maps [17][0] ="<html><p>Emprendes la huida por otro camino y al hacerlo te cruzas con un tercer hombre que levanta la vista y al verte se dispone a decir algo.<p><html>";
        maps [17][1] ="Lo ejecutas en sigilo antes de que diga nada";
        maps [1][17] ="Le dejas que hable";
        maps [17][17] =null;
        
        maps [18][0] ="<html><p>De pronto sientes un golpe en la nuca y todo se vuelve oscuro. Despiertas en lo que parece el sótano de la cabaña, colgando boca abajo. A tu lado puedes ver los cuerpos de otras personas, salvajemente mutilados. De entre las sombras ves acercarse a un hombre, con un machete y una gran sonrisa.<br></br>FIN.<p><html>";
        maps [18][1] ="Volver a empezar";
        maps [1][18] =null;
        maps [18][18] =null;
        
        maps [19][0] ="<html><p>Tras una hora más de ascenso, se levanta una ventisca que te impide ver bien por donde pisas. Las condiciones son cada vez peores y el camino más escarpado y estrecho. De pronto pisas una piedra medio suelta y antes de darte cuenta estás cayendo hacia el abismo. El impacto contra las rocas es letal.<br></br>FIN.<p><html>";
        maps [19][1] ="Volver a empezar";
        maps [1][19] =null;
        maps [19][19] =null;
        
        maps [20][0] ="<html><p>Decides descender pero a medio camino te alcanza la tormenta.<p><html>";
        maps [20][1] ="Continúas el descenso";
        maps [1][20] ="Buscas refugio";
        maps [20][20] =null;
        
        maps [21][0] ="<html><p>Te acercas al lago espada en mano y de repente el monstruo emerge mostrando toda su magnitud. Los tentáculos iniciales no eran más que unas pequeñas extremidades delanteras. El tamaño total es descomunal y te das cuenta que frente a algo así lo único que puedes hacer es bajar tu espada y esperar una muerte rápida</p><br></br><p>FIN</p></html>";
        maps [21][1] ="Volver a empezar";
        maps [1][21] =null;
        maps [21][21] =null;
        
        maps [22][0] ="<html><p>Finalmente decides no tentar a la suerte y te marchas.</p></html>";
        maps [22][1] ="Te diriges a la hoguera";
        maps [1][22] ="Te diriges a la cabaña";
        maps [22][22] =null;
        
        maps [23][0] ="<html><p>Al final del camino te encuentras delante de un puente totalmente derruido. A su lado un árbol podría servir como pasarela si consigues talarlo. Está a punto de caer la noche y se empiezan a oír aullidos en la distancia</p></html>";
        maps [23][1] ="Utilizas tu espada para intentar talar el árbol";
        maps [1][23] =null;
        maps [23][23] =null;
        
        maps [24][0] ="<html><p>Te diriges por el camino de la izquierda hasta encontrar la salida de la cueva.</p></html>";
        maps [24][1] ="Te diriges a la cabaña";
        maps [1][24] ="Pones rumbo a la cima de la montaña";
        maps [24][24] =null;
        
        maps [25][0] ="<html><p>Avanzas por el camino de la derecha hasta llegar a un callejón sin salida. Al volver escuchas el sonido de unos pasos acercándose y cuando observas que los produce no das crédito a lo que ven tus ojos. Los huesos que encontraste al caer al pozo se han levantado y se dirigen hacia ti arma en mano. Antes de que puedas reaccionar, uno de ellos te ensarta con su espada.<br></br>FIN.</p></html>";
        maps [25][1] ="Volver a empezar";
        maps [1][25] =null;
        maps [25][25] =null;
        
        maps [26][0] ="<html><p>Antes de poder pronunciar sonido alguno, le rajas la garganta con tu puñal. La sangre brota a borbotones. Escondes el cuerpo entre unos arbustos y prosigues tu camino.</p></html>";
        maps [26][1] ="Te diriges a la hoguera";
        maps [1][26] ="Vas a inspeccionar el lago";
        maps [26][26] =null;
        
        maps [27][0] ="<html><p>El hombre grita: ¡COMIDA! y rápidamente te encuentras rodeado por cinco hombres. Desenvainas tu espada y te preparas para luchar. Tras matar a dos de ellos, recibes un tajo en la muñeca y observas perplejo como tu espada cae al suelo aún sostenida por tu mano. En shock, caes de rodillas sin posibilidad de defenderte.";
        maps [27][1] ="Continuar";
        maps [1][27] =null;
        maps [27][27] =null;
        
        maps [28][0] ="<html><p>Continuas descendiendo apresuradamente cuando de pronto tropiezas y comienzas a dar vueltas sin control. Oyes el crujir de los huesos al tiempo que te das con algunas piedras. Finalmente, una enorme roca pone fin a tu caída aunque desgraciadamente lo último que escuchas es el crujido de tu cuello al romperse.<br></br>FIN.</p></html>";
        maps [28][1] ="Volver a empezar";
        maps [1][28] =null;
        maps [28][28] =null;
        
        maps [29][0] ="<html><p>Localizas un punto en la roca dónde resguardecerte de la tormenta y esperas pacientemente a que pase. Después continúas el descenso.</p></html>";
        maps [29][1] ="Te diriges al pozo";
        maps [1][29] ="Encaminas tus pasos hacia la cabaña";
        maps [29][29] =null;
        
        maps [30][0] ="<html><p>Cae la noche y tras un par de horas intentándolo el árbol empieza a ceder. Los aullidos comienzan a escucharse cada vez más cerca de modo que te apresuras a terminar tu tarea. Con las prisas, das un mal golpe y tu arma se queda encajada en el tronco. Los lobos están cada vez más cerca. Luchas por sacar el arma sin éxito. Piensas que quizá no fue buena idea utilizar tu única posibilidad de defensa y mientras lo haces te das cuenta de que ya te han rodeado.<br></br>FIN.</p></html>";
        maps [30][1] ="Volver a empezar";
        maps [1][30] =null;
        maps [30][30] =null;
        
        maps [31][0] ="<html><p>Utilizas el hacha que encontraste en el pozo y consigues derribar el árbol antes de que te alcancen los lobos. Utilizas el tronco como pasarela para cruzar el puente.</p></html>";
        maps [31][1] ="Continúa";
        maps [1][31] =null;
        maps [31][31] =null;
        
        maps [32][0] ="";
        maps [32][1] ="";
        maps [1][32] ="";
        maps [32][32] ="";
        
        maps [33][0] ="";
        maps [33][1] ="";
        maps [1][33] ="";
        maps [33][33] ="";
        
        maps [34][0] ="";
        maps [34][1] ="";
        maps [1][34] ="";
        maps [34][34] ="";
        
        maps [35][0] ="";
        maps [35][1] ="";
        maps [1][35] ="";
        maps [35][35] ="";
        
        maps [36][0] ="";
        maps [36][1] ="";
        maps [1][36] ="";
        maps [36][36] ="";
        
        maps [37][0] ="";
        maps [37][1] ="";
        maps [1][37] ="";
        maps [37][37] ="";
        
        maps [38][0] ="";
        maps [38][1] ="";
        maps [1][38] ="";
        maps [38][38] ="";
        
        maps [39][0] ="";
        maps [39][1] ="";
        maps [1][39] ="";
        maps [39][39] ="";
        
        maps [40][0] ="";
        maps [40][1] ="";
        maps [1][40] ="";
        maps [40][40] ="";
        
        return maps;
    }
      
      
      
      
//      public String  btn1="Inspeccionar el lago (m2.sector2())";
//      public String  btn2="Inspeccionar la hoguera (m3.sector3())";
//      public String  btn3 ="Inspeccionar la cabaña (m4.sector4())";
         
    //}
    

//    ventanaGeneral gen = new ventanaGeneral();
//    JLabel text = new JLabel();
//   
//    int nSector,nEvento;
//    Scanner sc = new Scanner(System.in);
//
//    public MapasRPG() {
//    }
//
//    public MapasRPG(int nSector, int nEvento) {
//        this.nSector = nSector;
//        this.nEvento = nEvento;
//    }
//
//    public int getnSector() {
//        return nSector;
//    }
//
//    public int getnEvento() {
//        return nEvento;
//    }
//
//    public Scanner getSc() {
//        return sc;
//    }
//
//    public void setnSector(int nSector) {
//        this.nSector = nSector;
//    }
//
//    public void setnEvento(int nEvento) {
//        this.nEvento = nEvento;
//    }
//
//    public void setSc(Scanner sc) {
//        this.sc = sc;
//    }

}
