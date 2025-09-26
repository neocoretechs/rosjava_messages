package geometry_msgs;

import org.json.JSONArray;
import org.json.JSONObject;

public class TwistWithCovariance implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "geometry_msgs/TwistWithCovariance";
	public static final java.lang.String _DEFINITION = "# This expresses velocity in free space with uncertainty.\n\nTwist twist\n\n# Row-major representation of the 6x6 covariance matrix\n# The orientation parameters use a fixed-axis representation.\n# In order, the parameters are:\n# (x, y, z, rotation about X axis, rotation about Y axis, rotation about Z axis)\nfloat64[36] covariance\n";
	public TwistWithCovariance() {}
	private geometry_msgs.Twist twist;
	public geometry_msgs.Twist getTwist() { return twist; }
	public void setTwist(geometry_msgs.Twist value) { twist = value; }
	private double[] covariance;
	public double[] getCovariance() { return covariance; }
	public void setCovariance(double[] value) { covariance = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.put("type", _TYPE);
		if(covariance != null) {
		JSONArray jarray = new JSONArray(covariance);
		jobj.put("covariance", jarray);
		}
		if(twist != null)
		jobj.put("twist", twist.toJSON());
		return jobj;
	}
}
