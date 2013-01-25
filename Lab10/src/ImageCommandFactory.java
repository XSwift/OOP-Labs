import java.util.LinkedList;

abstract class ImageCommand {
	
	
    public void Execute(Image x){
    	
    }
    public void Undo(Image x){
    	
    }
    public void Redo(Image x){
    	
    }
    
    
}

class ResizeCommand extends ImageCommand {
	private Image y;
	public void Execute(Image x){
		x.Action(x.Blured, x.Cropped, 100, 100);
    	System.out.println("Se face resize");
    }

}

class BlurFilterCommand extends ImageCommand {
	private Image y;
	public void Execute(Image x){
		x.Action(true, x.Cropped, x.height, x.width);
    	System.out.println("Bluefilter");
    }

}

class CropCommand extends ImageCommand {
	private Image y;
	public void Execute(Image x){
		x.Action(x.Blured, true, x.height, x.width);
    	System.out.println("Se executa crop");
    }
	

}

class ImageCommandFactory {
    public enum CommandType {
        Resize,
        BlurFilter,
        Crop
    }

    public static ImageCommand createCommand(CommandType cType) {
        switch (cType) {
            case Resize:
                return new ResizeCommand();
            case BlurFilter:
                return new BlurFilterCommand();
            case Crop:
                return new CropCommand();
        }
        throw new IllegalArgumentException("The command type " + cType + " is not recognized.");
    }
}
