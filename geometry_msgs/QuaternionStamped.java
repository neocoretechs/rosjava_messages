package geometry_msgs;

import org.json.JSONObject;

public class QuaternionStamped implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "geometry_msgs/QuaternionStamped";
	public static final java.lang.String _DEFINITION = "# This represents an orientation with reference coordinate frame and timestamp.\n\nHeader header\nQuaternion quaternion\n";
	public QuaternionStamped() {}
	private std_msgs.Header header;
	public std_msgs.Header getHeader() { return header; }
	public void setHeader(std_msgs.Header value) { header = value; }
	private geometry_msgs.Quaternion quaternion;
	public geometry_msgs.Quaternion getQuaternion() { return quaternion; }
	public void setQuaternion(geometry_msgs.Quaternion value) { quaternion = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.put("type", _TYPE);
		if(header != null)
		jobj.put("header", header.toJSON());
		if(quaternion != null) {
		jobj.put("x", quaternion.getX());
		jobj.put("y", quaternion.getY());
		jobj.put("z", quaternion.getZ());
		jobj.put("w", quaternion.getW());
		}
		return jobj;
	}
}
