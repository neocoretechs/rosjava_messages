package std_msgs;

import org.json.JSONObject;

public class String implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "std_msgs/String";
	public static final java.lang.String _DEFINITION = "string data\n";
	public String() {}
	private java.lang.String data;
	public java.lang.String getData() { return data; }
	public void setData(java.lang.String value) { data = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.put("type", _TYPE);
		jobj.put("data", data);
		return jobj;
	}
}
