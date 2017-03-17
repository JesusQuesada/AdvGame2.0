/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapas;

/**
 *
 * @author JesusQuesada
 */
public class Lago extends MapasRPG {
    
    
    
    public void sector2(){
        
        /*<html><p>El manantial parece tener un objeto en el fondo. A su lado ves un camino.</p></html>
        
        Te zambulles en el agua (sector5());
        Intentas alcanzarlo con una rama (sector6());
        Sigues por el camino (sector7());
        */
    }
    
    public void sector5(){
        
        /*<html><p>Te zambulles en el agua y cuando estás a punto de alcanzar el objeto, algo te agarra la pierna y tira de ti. Intentas escapar pero no lo consigues y cada vez tienes menos fuerzas. No puedes aguantar la respiración más tiempo y decides dejar de resistirte y afrontar tu destino.</p><br></br><p>FIN</p></html>*/
    }
    
    public void sector6(){
        /*<html><p>Con la ayuda de una rama consigues acercar el objeto lo suficiente para cogerlo con la mano pero al introducirla en el agua, sientes que algo te agarra. Cuando consigues soltarte unos tentáculos emergen y te atacan</p></html>
        
        Huyes (sector13());
        Luchas (sector14());
        
        Recoges una llave
        */
    }
    
    public void sector7(){
        /*<html><p>El camino te lleva de vuelta a la entrada del bosque.</p></html>
        
        Vuelves (m1.sector1());
        */
    }
    
    public void sector13(){
        /*<html><p>Te giras y comienzas a correr pero te tropiezas con la rama que utilizaste y caes al suelo. Un tentáculo te agarra la pierna y te arrastra dentro del lago. Te ahogas antes de ser devorado por la bestia.</p><br></br><p>FIN</p></html>*/
    }
    
    public void sector14(){
        /*<html><p>Desenvainas tu espada y con un movimiento certero consigues cortar uno de los tentáculos. El resto vuelven a sumergirse en el lago y te planteas que hacer.</p></html>
        
        Te acercas con la intención de rematarla (sector21());
        Te marchas (sector22());
        */
    }
    
    public void sector21(){
        /*<html><p>Te acercas al lago espada en mano y de repente el monstruo emerge mostrando toda su magnitud. Los tentáculos iniciales no eran más que unas pequeñas extremidades delanteras. El tamaño total es descomunal y te das cuenta que frente a algo así lo único que puedes hacer es bajar tu espada y esperar una muerte rápida</p><br></br><p>FIN</p></html>*/
    }
    
    public void sector22(){
        /*<html><p>Finalmente decides no tentar a la suerte y te marchas.</p></html>
        
        Te diriges a la hoguera (m3.sector3());
        Te diriges a la cabaña (m4.sector4());
        */
    }
    
    /*A PARTIR DE AQUI NO SIRVE*/
        
        
//        gen.setHistory(text.setText("fasdfsdf"));
        
    }
//
//    public void sec() {
//
//        System.out.println("Llegas a un precioso lago y de pronto sientes la necesidad de bañarte. \nTodo parece tranquilo y piensas que quizá te siente bien relajarte un poco antes de continuar el camino. \nHacia el Norte ves una cabaña, aparentemente abandonada.\n1. Te quedas un rato y aprovechas para darte un baño y relajarte.\n2. Vas a inspeccionar la cabaña.\n3. Vuelves por el camino del Oeste.");
//
//        switch (direccion) {
//            case 1:
//                nEvento = 10; //temporal
//                comprobarDireccion();
//                break;
//            case 2:
//                nSector = 4;
//                comprobarDireccion();
//                break;
//            case 3:
//                nSector = 2;
//                comprobarDireccion();
//                break;
//            
//        }
//
//    }
//
//    public void sector2() {
//
//        System.out.println("Te internas en el bosque y te das cuenta de que es mucho más profundo de lo que creías. \nLa luz apenas es capaz de atravesar las frondosas ramas de los árboles. \nHacia el Este ves un reflejo, quizá sea agua. \nHacia el Oeste ves un pequeño camino que parece meterse entre los árboles. \nHacia el Norte ves otro camino y una señal en el suelo que dice ‘NO PASAR’.\n1. Vas a inspeccionar el reflejo.\n2. Vas por el camino entre los árboles.\n3. Ignoras la señal del suelo y te diriges hacia el Norte.");
//        switch (direccion) {
//            case 1:
//                nSector = 1;
//                comprobarDireccion();
//                break;
//            case 2:
//                nSector = 3;
//                comprobarDireccion();
//                break;
//            case 3:
//                nSector = 5;
//                comprobarDireccion();
//                break;
//            default:
//                break;
//        }
//
//    }
//
//    public void sector3() {
//
//        System.out.println("Cruzas entre los árboles con dificultad, haciendo uso de tu arma para ayudarte a despejar el camino. \nCuando consigues pasar ves un claro y los restos de una hoguera. \nHacia el Norte hay un camino que vuelve a internarse en el bosque.\n1. Inspeccionas los restos de la hoguera.\n2. Te internas de nuevo en el bosque por el camino del Norte.\3. Vuelves sobre tus pasos por el camino que despejaste.");
//        switch (direccion) {
//            case 1:
//                nEvento = 11; //temporal
//                comprobarDireccion();
//                break;
//            case 2:
//                nSector = 6;
//                comprobarDireccion();
//                break;
//            case 3:
//                nSector = 2;
//                comprobarDireccion();
//                break;
//            default:
//                break;
//        }
//    }
//
//    public void sector4() {
//
//        System.out.println("Te acercas despacio a la cabaña, intentando escudriñar el interior a través de las ventanas pero eres incapaz de ver nada. \nDetrás de la cabaña ves un sendero que sube por la montaña.\n1. Entras en la cabaña.\n2. Subes por el camino de la montaña.\n3. Vuelves por el camino del lago.");
//        switch (direccion) {
//            case 1:
//                nEvento = 12; //temporal
//                comprobarDireccion();
//                break;
//            case 2:
//                nSector = 7;
//                comprobarDireccion();
//                break;
//            case 3:
//                nSector = 1;
//                comprobarDireccion();
//                break;
//            default:
//                break;
//        }
//    }
//
//    public void sector5() {
//
//        System.out.println("Tras avanzar unos metros te encuentras con un puente derruido y a su lado un árbol que parece bastante viejo y frágil. \nQuizá si tuvieras un hacha podrías usarlo como pasarela. \nAl otro lado del puente ves un enorme castillo.\n1. Das media vuelta y vuelves por el camino por el que viniste.\n2. Utilizas el hacha" /*Nota: solo si lo llevas encima*/);
//        if (direccion==1) {
//            nSector = 2; 
//            comprobarDireccion();
//        } else if (direccion==2) {
//            nEvento = 13; //temporal
//            nSector = 8;
//            comprobarDireccion();
//        }
//    }
//
//    public void sector6() {
//
//        System.out.println("Avanzas de nuevo por el bosque hasta que te encuentras en una bifurcación. \nAparentemente ambos caminos parecen seguros pero tu instinto te dice que uno de los dos te traerá problemas.\n1. Tomas el camino de la izquierda.\n2. Tomas el camino de la derecha.\n3. Vuelves hacia el claro.");
//        switch (direccion) {
//            case 1:
//                nEvento = 14; //temporal
//                comprobarDireccion();
//                break;
//            case 2:
//                nSector = 9;
//                comprobarDireccion();
//                break;
//            case 3:
//                nSector = 3;
//                comprobarDireccion();
//                break;
//            default:
//                break;
//        }
//    }
//
//    public void sector7() {
//
//        System.out.println("Llevas más de una hora subiendo y el camino parece no tener fin. \nEstás cansado y cada vez tienes más frío a causa de la altura. \nHas subido tanto que empiezas a ver nieve y lo que parece una tormenta que se acerca. \nTe das cuenta de que este camino es una trampa mortal y tienes que volver.\n1. Decides hacer un refugio en la falda de la montaña y esperar a que pase la tormenta.\n2. Intentas descender lo más rápido posible con la esperanza de que la tormenta no te alcance.");
//        
//        if (direccion==1) {
//            nEvento = 15; //temporal
//            comprobarDireccion();
//        } else if (direccion==2) {
//            nSector = 4;
//            comprobarDireccion();
//        }
//    }
//
//    public void sector8() {
//
//        System.out.println("Tras cruzar el puente te encuentras a las puertas del castillo. \nDesde fuera parece un lugar lóbrego y abandonado pero sabes que en su interior alberga un sinfín de peligros. \nTe ajustas tus pertrechos, agarras firmemente tu arma y te adentras en su interior.");
//
//    }
//
//    public void sector9() {
//
//        System.out.println("Avanzas por el camino de la derecha hasta encontrarte con un derrumbamiento. \nEl camino está cortado y no ves forma de pasar. \nAplastados por las enormes piedras ves los restos de algunos guerreros.”\n1. Examinas los cuerpos.\n2. Vuelves por dónde viniste.");
//        
//        if (direccion==1) {
//            nEvento = 16; //temporal
//            comprobarDireccion();
//        } else if (direccion==2) {
//            nSector = 6;
//            comprobarDireccion();
//        }
//    }
//
//    public void comprobarDireccion() {
//        switch (nSector) {
//
//            case 1:
//                sector1();
//                break;
//            case 2:
//                sector2();
//                break;
//            case 3:
//                sector3();
//                break;
//            case 4:
//                sector4();
//                break;
//            case 5:
//                sector5();
//                break;
//            case 6:
//                sector2();
//                break;
//            case 7:
//                sector3();
//                break;
//            case 8:
//                sector4();
//                break;
//            case 9:
//                sector5();
//                break;
//            
//
//        }
//
//    }


