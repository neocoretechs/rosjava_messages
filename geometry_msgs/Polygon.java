package geometry_msgs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import org.json.JSONArray;
import org.json.JSONObject;

public class Polygon implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "geometry_msgs/Polygon";
	public static final java.lang.String _DEFINITION = "#A specification of a polygon where the first and last points are assumed to be connected\nPoint32[] points\n";
	public Polygon() {}
	private java.util.List<geometry_msgs.Point32> points;
	public java.util.List<geometry_msgs.Point32> getPoints() { return points; }
	public void setPoints(java.util.List<geometry_msgs.Point32> value) { points = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.put("type", _TYPE);
		if(points != null) {
		Collection<JSONObject> result = points.stream()
			    .map(entry -> entry.toJSON()) // or ClassName::someMethod
			    .collect(Collectors.toCollection(ArrayList::new)); // or any other collection type
		JSONArray jarray = new JSONArray(result);
		jobj.put("points", jarray);
		}
		return jobj;
	}
}
