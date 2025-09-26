package geometry_msgs;

import org.json.JSONObject;

public class Vector3 implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "geometry_msgs/Vector3";
	public static final java.lang.String _DEFINITION = "# This represents a vector in free space. \n\nfloat64 x\nfloat64 y\nfloat64 z";
	public Vector3() {}
	private double x;
	public double getX() { return x; }
	public void setX(double value) { x = value; }
	private double y;
	public double getY() { return y; }
	public void setY(double value) { y = value; }
	private double z;
	public double getZ() { return z; }
	public void setZ(double value) { z = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.put("type", _TYPE);
		jobj.put("x", x);
		jobj.put("y", y);
		jobj.put("z", z);
		return jobj;
	}
}
