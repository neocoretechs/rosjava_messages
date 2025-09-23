package geometry_msgs;

import org.json.JSONObject;

public class PoseStamped implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "geometry_msgs/PoseStamped";
	public static final java.lang.String _DEFINITION = "# A Pose with reference coordinate frame and timestamp\nHeader header\nPose pose\n";
	public PoseStamped() {}
	private std_msgs.Header header;
	public std_msgs.Header getHeader() { return header; }
	public void setHeader(std_msgs.Header value) { header = value; }
	private geometry_msgs.Pose pose;
	public geometry_msgs.Pose getPose() { return pose; }
	public void setPose(geometry_msgs.Pose value) { pose = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.append("type", _TYPE);
		if(header != null)
		jobj.append("header", header.toJSON());
		if(pose != null)
		jobj.append("pose", pose.toJSON());
		return jobj;
	}
}
