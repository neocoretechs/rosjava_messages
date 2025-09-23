package geometry_msgs;

import org.json.JSONObject;

public class Quaternion implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "geometry_msgs/Quaternion";
	public static final java.lang.String _DEFINITION = "# This represents an orientation in free space in quaternion form.\n\nfloat64 x\nfloat64 y\nfloat64 z\nfloat64 w\n";
	public Quaternion() {}
	private double x;
	public double getX() { return x; }
	public void setX(double value) { x = value; }
	private double y;
	public double getY() { return y; }
	public void setY(double value) { y = value; }
	private double z;
	public double getZ() { return z; }
	public void setZ(double value) { z = value; }
	private double w;
	public double getW() { return w; }
	public void setW(double value) { w = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.append("type", _TYPE);
		jobj.append("x", x);
		jobj.append("y", y);
		jobj.append("z", z);
		jobj.append("w", w);
		return jobj;
	}
}
