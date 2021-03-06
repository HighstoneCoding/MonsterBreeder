import java.awt.Graphics2D;


public class Map {
	
	private int layerOne[][] = new int[20][20];
	private boolean boundary;	//This is set to true on tiles that cannot be walked past
	
	//---Tiles---
	private GameImage GI_Grass;
	
	public Map(int ref){
		
		loadMap(ref);
		GI_Grass = new GameImage("Map/Tiles/Grass.png");
		}

	public void loadMap(int ref){	
		/*	
		  	Loading the map we input each value into the Map object
		  	with each row represent the X coordinates and the columns
		 	being the Y coordinates.
		 */
			
	//if(ref == 0){
		int[][] layerOne = {
				{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2}, //1
				{2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2}, //2
				{2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2}, //3
				{2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2}, //4
				{2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2}, //5
				{2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2}, //6
				{2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2}, //7
				{2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2}, //8
				{2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2}, //9
				{2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2}, //10
				{2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2}, //11
				{2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2}, //12
				{2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2}, //13
				{2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2}, //14
				{2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2}, //15
				{2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2}, //16
				{2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2}, //17
				{2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2}, //18
				{2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2}, //19
				{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2}  //20
			};
			System.out.println("loaded");
		//}
	}

	public void renderMap(Graphics2D canvas, int scale){
		/*	
		 	To render the map we have to check each value in
		  	the array, this is done through a nested for statement.
			To get the size right we use x*32 and y*32 as each tile
			in this version will be 32 pixel squares. Scales allows 
			the size of the map to be changed.
		*/
		for(int x = 0; x < layerOne.length; x++){
			for(int y = 0; y < layerOne[x].length; y++){
				if(layerOne[x][y] == 1){
					GI_Grass.drawRotatedScaled(canvas, (x*32*scale), (y*32*scale), 0, scale);
				}
				
				if(layerOne[x][y] == 2){
					boundary = true;
				}
			  }
			}
	}


}