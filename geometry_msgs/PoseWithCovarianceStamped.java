package geometry_msgs;

import org.json.JSONArray;
import org.json.JSONObject;

public class PoseWithCovarianceStamped implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "geometry_msgs/PoseWithCovarianceStamped";
	public static final java.lang.String _DEFINITION = "# This expresses an estimated pose with a reference coordinate frame and timestamp\n\nHeader header\nPoseWithCovariance pose\n";
	public PoseWithCovarianceStamped() {}
	private std_msgs.Header header;
	public std_msgs.Header getHeader() { return header; }
	public void setHeader(std_msgs.Header value) { header = value; }
	private geometry_msgs.PoseWithCovariance pose;
	public geometry_msgs.PoseWithCovariance getPose() { return pose; }
	public void setPose(geometry_msgs.PoseWithCovariance value) { pose = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.append("type", _TYPE);
		if(header != null)
		jobj.append("header",header.toJSON());
		if(pose != null)
		jobj.append("pose", pose.toJSON());
		return jobj;
	}
}
