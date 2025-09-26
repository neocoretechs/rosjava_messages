package diagnostic_msgs;

import org.json.JSONObject;

public class SelfTestRequest implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "diagnostic_msgs/SelfTestRequest";
	public static final java.lang.String _DEFINITION = "";
	public SelfTestRequest() {}
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.put("type", _TYPE);
		jobj.put("text", _DEFINITION);
		return jobj;
	}
}
