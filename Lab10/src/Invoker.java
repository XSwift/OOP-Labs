import java.util.LinkedList;


public class Invoker {

	private ImageCommand Resize;
	private ImageCommand Blur;
	private ImageCommand Crop;
	LinkedList<ImageCommand>List;
	
	public Invoker (ImageCommand Resize, ImageCommand Blur, ImageCommand Crop){
		this.Resize=Resize;
		this.Blur=Blur;
		this.Crop=Crop;
	}
	
	public void Resize(Image x)
	{  Resize.Execute(x);
		
	}
	
	public void Blur(Image x)
	{
		Blur.Execute(x);
	}
	public void Crop(Image x)
	{
		Crop.Execute(x);
	}
}
