package std_msgs;

import org.json.JSONArray;
import org.json.JSONObject;

public class Duration implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "std_msgs/Duration";
	public static final java.lang.String _DEFINITION = "duration data\n";
	public Duration() {}
	private org.ros.message.Duration data;
	public org.ros.message.Duration getData() { return data; }
	public void setData(org.ros.message.Duration value) { data = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.put("type", _TYPE);
		if(data != null)
		jobj.put("duration", data.secs);
		return jobj;
	}
	
}
