package std_msgs;

import org.json.JSONObject;

public class Empty implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON{
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "std_msgs/Empty";
	public static final java.lang.String _DEFINITION = "";
	public Empty() {}
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.append("type", _TYPE);
		return jobj;
	}
}
