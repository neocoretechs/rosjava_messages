package nav_msgs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import org.json.JSONArray;
import org.json.JSONObject;

public class Path implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "nav_msgs/Path";
	public static final java.lang.String _DEFINITION = "#An array of poses that represents a Path for a robot to follow\nHeader header\ngeometry_msgs/PoseStamped[] poses\n";
	public Path() {}
	private std_msgs.Header header;
	public std_msgs.Header getHeader() { return header; }
	public void setHeader(std_msgs.Header value) { header = value; }
	private java.util.List<geometry_msgs.PoseStamped> poses;
	public java.util.List<geometry_msgs.PoseStamped> getPoses() { return poses; }
	public void setPoses(java.util.List<geometry_msgs.PoseStamped> value) { poses = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.put("type", _TYPE);
		if(header != null)
		jobj.put("header", header.toJSON());
		if(poses != null) {
		Collection<JSONObject> result = poses.stream()
			    .map(entry -> entry.toJSON()) // or ClassName::someMethod
			    .collect(Collectors.toCollection(ArrayList::new)); // or any other collection type
		JSONArray jarray = new JSONArray(result);
		jobj.put("poses", jarray);
		}
		return jobj;
	}
}
