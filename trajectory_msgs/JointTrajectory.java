package trajectory_msgs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import org.json.JSONArray;
import org.json.JSONObject;

public class JointTrajectory implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "trajectory_msgs/JointTrajectory";
	public static final java.lang.String _DEFINITION = "Header header\nstring[] joint_names\nJointTrajectoryPoint[] points";
	public JointTrajectory() {}
	private std_msgs.Header header;
	public std_msgs.Header getHeader() { return header; }
	public void setHeader(std_msgs.Header value) { header = value; }
	private java.util.List<java.lang.String> joint_names;
	public java.util.List<java.lang.String> getJointNames() { return joint_names; }
	public void setJointNames(java.util.List<java.lang.String> value) { joint_names = value; }
	private java.util.List<trajectory_msgs.JointTrajectoryPoint> points;
	public java.util.List<trajectory_msgs.JointTrajectoryPoint> getPoints() { return points; }
	public void setPoints(java.util.List<trajectory_msgs.JointTrajectoryPoint> value) { points = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.append("type", _TYPE);
		if(header != null)
		jobj.append("header", header.toJSON());
		if(joint_names != null) {
			JSONArray jarray = new JSONArray(joint_names);
			jobj.append("joint_names", jarray);
		}
		if(points != null) {
			Collection<JSONObject> result = points.stream()
				    .map(entry -> entry.toJSON()) // or ClassName::someMethod
				    .collect(Collectors.toCollection(ArrayList::new)); // or any other collection type
			JSONArray jarray = new JSONArray(result);
			jobj.append("points", jarray);
		}
		return jobj;
	}
}
