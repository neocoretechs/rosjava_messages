package geometry_msgs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import org.json.JSONArray;
import org.json.JSONObject;

public class PolygonStamped implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "geometry_msgs/PolygonStamped";
	public static final java.lang.String _DEFINITION = "# This represents a Polygon with reference coordinate frame and timestamp\nHeader header\nPolygon polygon\n";
	public PolygonStamped() {}
	private std_msgs.Header header;
	public std_msgs.Header getHeader() { return header; }
	public void setHeader(std_msgs.Header value) { header = value; }
	private geometry_msgs.Polygon polygon;
	public geometry_msgs.Polygon getPolygon() { return polygon; }
	public void setPolygon(geometry_msgs.Polygon value) { polygon = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.put("type", _TYPE);
		if(header != null)
		jobj.put("header", header.toJSON());
		if(polygon != null)
		jobj.put("polygon", polygon.toJSON());
		return jobj;
	}
}
