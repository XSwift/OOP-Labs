
public class Image {
boolean Blured;
int height, width;
boolean Cropped;

public void Show(Image x){
System.out.println("Size "+ height +"x"+width + "Blured:"+ Blured +"Cropped:"+ Cropped );
}

public void Action(Boolean b, Boolean c, int h, int w){
	System.out.println("S-a actionat");
	Blured=b;
	Cropped=c;
	height=h;
	width=w;
	
}
}
