package visualization_msgs;

import org.json.JSONObject;

public class InteractiveMarkerPose implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "visualization_msgs/InteractiveMarkerPose";
	public static final java.lang.String _DEFINITION = "# Time/frame info.\nHeader header\n\n# Initial pose. Also, defines the pivot point for rotations.\ngeometry_msgs/Pose pose\n\n# Identifying string. Must be globally unique in\n# the topic that this message is sent through.\nstring name\n";
	public InteractiveMarkerPose() {}
	private std_msgs.Header header;
	public std_msgs.Header getHeader() { return header; }
	public void setHeader(std_msgs.Header value) { header = value; }
	private geometry_msgs.Pose pose;
	public geometry_msgs.Pose getPose() { return pose; }
	public void setPose(geometry_msgs.Pose value) { pose = value; }
	private java.lang.String name;
	public java.lang.String getName() { return name; }
	public void setName(java.lang.String value) { name = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.put("type", _TYPE);
		if(header != null)
			jobj.put("header",header.toJSON());
		jobj.put("name", name);
		if(pose != null)
			jobj.put("pose",pose.toJSON());
		return jobj;
	}
}
