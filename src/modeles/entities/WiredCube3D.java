package modeles.entities;

import java.nio.FloatBuffer;

public class WiredCube3D extends Cube3D {
	
	public WiredCube3D(float x, float y, float z, float size){
		super(x, y, z, size);

	}

	public void draw() {
		genCube();
	}

	public void destroy(){

	}

	public float[] genCubes(){

		return new float[]{
				pos.x, pos.y, pos.z,
				pos.x, pos.y-size, pos.z,
				
				pos.x, pos.y, pos.z,
				pos.x+size, pos.y, pos.z,
				
				pos.x, pos.y-size, pos.z,
				pos.x+size, pos.y-size, pos.z,

				pos.x+size, pos.y-size, pos.z,
				pos.x+size, pos.y, pos.z,

				//north face
				pos.x, pos.y, pos.z+size,
				pos.x, pos.y-size, pos.z+size,

				pos.x, pos.y, pos.z+size,
				pos.x+size, pos.y, pos.z+size,

				pos.x, pos.y-size, pos.z+size,
				pos.x+size, pos.y-size, pos.z+size,

				pos.x+size, pos.y-size, pos.z+size,
				pos.x+size, pos.y, pos.z+size,

				//bottom face
				pos.x, pos.y-size, pos.z,
				pos.x, pos.y-size, pos.z+size,

				pos.x+size, pos.y-size, pos.z,
				pos.x+size, pos.y-size, pos.z+size,


				//top face
				pos.x, pos.y, pos.z,
				pos.x, pos.y, pos.z+size,

				pos.x+size, pos.y, pos.z,
				pos.x+size, pos.y, pos.z+size,};
		
	}

}