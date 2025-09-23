package geometry_msgs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import org.json.JSONArray;
import org.json.JSONObject;

public class PoseArray implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "geometry_msgs/PoseArray";
	public static final java.lang.String _DEFINITION = "# An array of poses with a header for global reference.\n\nHeader header\n\nPose[] poses\n";
	public PoseArray() {}
	private std_msgs.Header header;
	public std_msgs.Header getHeader() { return header; }
	public void setHeader(std_msgs.Header value) { header = value; }
	private java.util.List<geometry_msgs.Pose> poses;
	public java.util.List<geometry_msgs.Pose> getPoses() { return poses; }
	public void setPoses(java.util.List<geometry_msgs.Pose> value) { poses = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		if(header != null)
		jobj.append("header", header.toJSON());
		jobj.append("type", _TYPE);
		if(poses != null) {
		Collection<JSONObject> result = poses.stream()
			    .map(entry -> entry.toJSON()) // or ClassName::someMethod
			    .collect(Collectors.toCollection(ArrayList::new)); // or any other collection type
		JSONArray jarray = new JSONArray(result);
		jobj.append("poses", jarray);
		}
		return jobj;
	}
}
