package geometry_msgs;

import org.json.JSONArray;
import org.json.JSONObject;

public class TwistWithCovarianceStamped implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "geometry_msgs/TwistWithCovarianceStamped";
	public static final java.lang.String _DEFINITION = "# This represents an estimated twist with reference coordinate frame and timestamp.\nHeader header\nTwistWithCovariance twist\n";
	public TwistWithCovarianceStamped() {}
	private std_msgs.Header header;
	public std_msgs.Header getHeader() { return header; }
	public void setHeader(std_msgs.Header value) { header = value; }
	private geometry_msgs.TwistWithCovariance twist;
	public geometry_msgs.TwistWithCovariance getTwist() { return twist; }
	public void setTwist(geometry_msgs.TwistWithCovariance value) { twist = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.put("type", _TYPE);
		if(header != null)
		jobj.put("header", header.toJSON());
		if(twist != null)
		jobj.put("twist", twist.toJSON());
		return jobj;
	}
}
