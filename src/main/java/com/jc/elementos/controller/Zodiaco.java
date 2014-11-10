/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.elementos.controller;

import java.util.ArrayList;

/**
 *
 * @author campitos
 */
public class Zodiaco implements Futuro{
private ArrayList<Signo> signos;

    public Zodiaco() {
        signos=new ArrayList<Signo>();
        Signo virgo=new Signo("virgo","Durante los primeros d�as de la semana demu�strele a esa persona especial cu�nto la aprecia, despu�s hum�llela como siempre. Puede ser que las exigencias laborales afecten su estado de �nimo y entre en un pico de estr�s, no se altere, recuerde que estr�s por dos, seis. El d�a jueves entrar� en estado de p�nico al ser v�ctima de un robo a mano armada, tiene tres opciones: la primera: reducir al delincuente, quitarle el arma y entregarlo a la polic�a, la segunda: quedarse inm�vil con cara de nada y dejar que el ladr�n act�e, y la tercer opci�n: gritar socorro mientras corre despavorido por el medio de la calle. Me parece que esta �ltima es la que va elegir. ");
        Signo libra=new Signo("libra","Su esposa traer� a la casa el dinero que hacia falta para pagar la hipoteca, no le pregunte de donde lo saco, la respuesta puede llegar a no gustarle, ojos que no ven coraz�n que no siente. Su hijo descubre que tiene talento con la m�sica, espec�ficamente con la percusi�n, aliente este talento, c�mprele una bater�a y h�galo feliz, aunque vaya en contra de la felicidad de los vecinos, su desarrollo musical es m�s importante que la queja de tres viejas locas. Viernes o S�bado caer� la polic�a a su casa preguntado si sabe algo de unos ruidos molestos, h�gase el sota, si no tienen orden de allanamiento no pueden entrar a revisar si hay o no bater�a. \n" +
"\n" +
"Frase para la semana: Felices los que nada esperan porque nunca ser�n defraudados. ");
        Signo acuario=new Signo("acuario","Escucha con m�s atenci�n el cantar de los pajaritos, su o�do se agudiza y siente que quieren decirle algo, tenga cuidado que son chismosos, la otra vez mi esposa descubri� mi debilidad por los caramelos gomita, cuando le pregunte quien se lo cont�, me dijo: �Me lo cont� un pajarito�, vio, son chismosos, desconf�e de ellos. Una situaci�n engorrosa es la que tendr� que pasar el d�a s�bado en el restaurante cuando se de cuenta de que el dinero que lleva encima no le alcanza para pagar, yo le sugiero que haga como que va al ba�o y se escape por la puerta trasera, luego h�gale se�as de luces a su mujer para que salte por la ventana y suba al auto en marcha presto a huir a m�xima velocidad. \n" +
"\n" +
"Y trate que toda esta acci�n pase desapercibida. \n" +

"Frase para la semana: Estudiar es desconfiar de la inteligencia del compa�ero de al lado ");
        Signo sagitario=new Signo("sagitario","Su imaginaci�n lo entretiene, m�s de lo que lo hace el mundo real, duendes y hadas rodean su vida y lo acompa�an todo el d�a, hasta un hipop�tamo volador se sienta a conversar con usted entre mate y mate, h�gase tratar, est� m�s loco que una cabra. \n" +
"\n" +
"Esta semana sentir� repulsi�n por cualquier tipo de carne, de esta manera, despertar� al mundo vegetariano, a una nueva forma de vivir, el br�coli y los rabanitos ser�n parte de est� nueva conciencia, hasta que su primo Jorge cae con media res y el mundo vegetariano desaparece de su vida, se comen terrible asadazo. \n" +
"\n" +
"Frase para la semana: Toda part�cula que vuela, siempre encuentra un ojo abierto. ");
        Signo capricornio=new Signo("capricornio","Si necesita consejo en el terreno rom�ntico, p�daselo a un amigo que sea exitoso en el reino de lo amoroso. Por lo general, las personas m�s dispuestas a dar consejos sobre el amor son las menos exitosas, te aconsejan como formar un buen matrimonio cuando ellos ya se divorciaron cinco veces y fueron veinte veces denunciados por su pareja, en todo caso, haga todo lo contrario de lo que le digan. Si usted es mujer y esta buscando tener un ni�o, al�grese, esta semana tiene muchas posibilidades de quedar embarazada, sobre todo si tiene relaciones. Desista de la idea de concebir un hijo por la gracia del esp�ritu santo, usted no es Mar�a y no hay Jos� que se lo crea. \n" +
"\n" +
"Frase para la semana: Lo importante no es saber, sino tener el tel�fono del que sabe. ");
        Signo piscis=new Signo("piscis","Las cosas son un tanto confusas entre el lunes y el mi�rcoles. Ser�a aconsejable que evite chocar con sujetos extra�os, mejor, choque con parientes as� queda todo en familia. Una grata noticia recibir� esta semana, uno de sus hijos ser� abanderado en la escuela, trate por esto no hacer diferencias con su otro hijo, el ignorante burro bueno para nada. El viernes puede ser que discuta con su pareja, aunque despu�s de 10 minutos ya no se acordar�n porque discut�an pero seguir�n haci�ndolo por gusto, recuerde que una buena discusi�n se termina a las pi�as.");
        Signo leo=new Signo("leo","Esta semana es propicia para realizar esas tareas del hogar que tendr�a que haber hecho hace tiempo, p�ngale de una vez por todas el techo a su habitaci�n, su mujer ya esta cansada de contar las estrellas para poder dormirse. Aparte, que sabe si alguien no esp�a su intimidad, hay muchos radares dando vueltas, no se sorprenda si fotos suyas con su mujer aparecen en Internet. \n" +
"\n" +
"Frase para la semana: El que nace pobre y feo, tiene grandes posibilidades de que al crecer se le desarrollen ambas condiciones. ");
        Signo cancer=new Signo("cancer","Es posible que el cielo est� despejado y soleado, pero en su interior reinan las nubes y la confusi�n. Es hora de terminar con est� oscuridad, c�mase una linterna prendida y todo su interior quedar� iluminado. El s�bado ser� un d�a especial para salir a caminar un ratico, pasee por el r�o, juegue con una piedrita, haga castillitos de arena, por un momento saqu� ese ni�o que hay en su interior, sobre todo si est� embarazada. Adem�s, esta semana es ideal para comenzar con los ejercicios f�sicos, baje esos kilitos dem�s, esos 57 kilitos que tiene dem�s, que el verano no lo sorprenda. \n" +
"\n" +
"Frase de la semana: Lo importante no es ganar. Lo que importa es competir, sin perder ni empatar ");
        Signo geminis=new Signo("geminis","De lunes a mi�rcoles, su cabeza se llenar� de nueva informaci�n, pero el jueves no se acordar� de nada, entonces, se dar� cuenta de que esta perdiendo la memoria, pero para el viernes ya no se har� problema porque olvidar� que estaba perdiendo la memoria �se entendi�? Yo les aconsejo a los geminianos que no presten dinero, porque no se acordar�n ni cuanto ni a quien le prestaron. Otra cosa, si esta semana quiere aprovechar para estar con varias mujeres, le va a ir muy bien, porque se encuentra de ligue, �nicamente tenga cuidado si est� en pareja porque la va a ligar. ");
        Signo tauro=new Signo("tauro","Esta semana para Aries se torna bastante complicada, hay un problema que debe ser resuelto cuanto antes, sino la profe de matem�ticas lo aplazar�. Modifique su conducta agresiva hacia los dem�s, si no la puede modificar del todo alterne esa agresividad con amor, o sea, si alguien le cruza el auto, ins�ltelo, p�nchele la rueda si quiere o r�mpale el parabrisas con el matafuego, pero luego, p�dale disculpas, d�le un beso en la mejilla y d�gale: � ta` todo bien hermano�, si este responde con hostilidad, no diga nada, dese vuelta tranquilamente y en el momento que crea oportuno des�rmele el matafuego en la cabeza, para que aprenda a perdonar. \n" +
"\n" +
"Frase de la semana: Arreglar los problemas econ�micos es f�cil, lo �nico que se necesita es dinero. ");
        Signo aries=new Signo("aries","Los d�as jueves y viernes sentir� como si un loro le hablara al o�do, no se confunda, ese loro es, nada m�s y nada menos que su linda y tan venerada suegra, vendr� de visita y se quedar� con usted un par de d�as, en lo posible, trate de no matarla. \n" +
"\n" +
"Frase de la semana: Morir es como dormir, pero sin levantarse a hacer pis. ");
        Signo escorpion=new Signo("escorpion","Esta semana algunos d�as estar� bien y otros no tanto, aproveche los d�as que este bien para salir y divertirse, y los d�as que este mal no se deprima, salga y divi�rtase, o sea que si usted quiere puede estar de fiesta toda la semana. T�mese unas mini vacaciones, vaya a un mini golf y p�ngase una minifalda. \n" +
"\n" +
"El jueves comienza a sentir que necesita una se�al para saber si est� con la persona correcta, y entonces ve un cartel en la ruta que dice: �Si, est�s con la persona correcta� y se queda tranquilo. Pero luego piensa: �esto es cosa e` mandinga�. Y si, puede ser, quien sabe. \n" +
"\n" +
"Frase para la semana: Si quieres una mano que te ayude, la encontraras al final de tu brazo. ");



        signos.add(virgo);
        signos.add(libra);
        signos.add(acuario);
        signos.add(sagitario);
        signos.add(capricornio);
        signos.add(piscis);
        signos.add(leo);
        signos.add(cancer);
        signos.add(geminis);
        signos.add(tauro);
        signos.add(aries);
        signos.add(escorpion);
    }
    public String leerFuturo(String parametro) {
      String tuFuturo="Tu signo no está disponible :(";
      for(Signo s:signos){
      if(parametro.equalsIgnoreCase(s.getNombre())){
          tuFuturo=s.getPrediccion();
                }
          
          }
        return tuFuturo;
    }

    
    
  
    
}
