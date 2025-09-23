package geometry_msgs;

import org.json.JSONObject;

public class PointStamped implements org.ros.internal.message.Message, java.io.Serializable {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "geometry_msgs/PointStamped";
	public static final java.lang.String _DEFINITION = "# This represents a Point with reference coordinate frame and timestamp\nHeader header\nPoint point\n";
	public PointStamped() {}
	private std_msgs.Header header;
	public std_msgs.Header getHeader() { return header; }
	public void setHeader(std_msgs.Header value) { header = value; }
	private geometry_msgs.Point point;
	public geometry_msgs.Point getPoint() { return point; }
	public void setPoint(geometry_msgs.Point value) { point = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.append("type", _TYPE);
		if(header != null)
		jobj.append("header", header.toJSON());
		if(point != null)
		jobj.append("point", point.toJSON());
		return jobj;
	}
}
