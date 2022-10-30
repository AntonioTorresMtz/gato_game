
package gato_hilos;

import java.applet.AudioClip;


public class Musica extends Thread{
    @Override
public void run()
{
try
{
// Displaying the thread that is running
System.out.println("Hilo ejecutendose");
AudioClip sound;

 sound = java.applet.Applet.newAudioClip(getClass().getResource("/Musica/cancion1.wav"));
int x=0;
while(x<1){
sound.play();
sleep(10000);
}

}
catch (Exception e)
{

System.out.println ("Excepcion");
}
}
}
