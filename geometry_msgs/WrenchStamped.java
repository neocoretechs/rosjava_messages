package geometry_msgs;

import org.json.JSONObject;

public class WrenchStamped implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "geometry_msgs/WrenchStamped";
	public static final java.lang.String _DEFINITION = "# A wrench with reference coordinate frame and timestamp\nHeader header\nWrench wrench\n";
	public WrenchStamped() {}
	private std_msgs.Header header;
	public std_msgs.Header getHeader() { return header; }
	public void setHeader(std_msgs.Header value) { header = value; }
	private geometry_msgs.Wrench wrench;
	public geometry_msgs.Wrench getWrench() { return wrench; }
	public void setWrench(geometry_msgs.Wrench value) { wrench = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.put("type", _TYPE);
		if(header != null)
		jobj.put("header", header.toJSON());
		if(wrench != null)
		jobj.put("wrench", wrench.toJSON());
		return jobj;
	}
}
