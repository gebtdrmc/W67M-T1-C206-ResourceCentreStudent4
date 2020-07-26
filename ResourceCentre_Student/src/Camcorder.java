//comment 26/7/2020 
//changed in GitHub
//conflict Changed in Git
//merge test
public class Camcorder extends Item{
	private int opticalZoom;

	//test conflict change in workspace

	public Camcorder(String assetTag, String description, int opticalZoom) {
		super(assetTag, description);
		this.opticalZoom = opticalZoom;
	}
//test merge change local
//test merge change github
	
	public int getOpticalZoom() {
		return opticalZoom;
	}
	
	public String toString(){
		String output = "";
		// Write your codes here
		return output;
	}
}

