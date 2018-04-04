/*
  Taken from https://github.com/copygirl/mod_Alchemy
 */
package io.github.shadowchild.util.geometry;

public abstract class Shape {

	public abstract BoundingBox getBoundingBox();
	
	public Point getCenter() { return getBoundingBox().getCenter(); }

}
