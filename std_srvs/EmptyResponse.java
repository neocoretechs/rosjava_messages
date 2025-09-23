package std_srvs;

import org.json.JSONObject;

public class EmptyResponse implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "std_srvs/EmptyResponse";
	public static final java.lang.String _DEFINITION = "";
	public EmptyResponse() {}
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.append("type", _TYPE);
		return jobj;
	}
}
