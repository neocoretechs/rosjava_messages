package geometry_msgs;

import org.json.JSONObject;

public class Vector3Stamped implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "geometry_msgs/Vector3Stamped";
	public static final java.lang.String _DEFINITION = "# This represents a Vector3 with reference coordinate frame and timestamp\nHeader header\nVector3 vector\n";
	public Vector3Stamped() {}
	private std_msgs.Header header;
	public std_msgs.Header getHeader() { return header; }
	public void setHeader(std_msgs.Header value) { header = value; }
	private geometry_msgs.Vector3 vector;
	public geometry_msgs.Vector3 getVector() { return vector; }
	public void setVector(geometry_msgs.Vector3 value) { vector = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.put("type", _TYPE);
		if(header != null)
		jobj.put("header", header.toJSON());
		if(vector != null)
		jobj.put("vector", vector.toJSON());
		return jobj;
	}
}
