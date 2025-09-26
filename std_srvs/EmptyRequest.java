package std_srvs;

import org.json.JSONObject;

public class EmptyRequest implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "std_srvs/EmptyRequest";
	public static final java.lang.String _DEFINITION = "";
	public EmptyRequest() {}
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.put("type", _TYPE);
		return jobj;
	}
}
