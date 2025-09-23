package std_msgs;

import org.json.JSONObject;

public class Int16 implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "std_msgs/Int16";
	public static final java.lang.String _DEFINITION = "int16 data\n";
	public Int16() {}
	private short data;
	public short getData() { return data; }
	public void setData(short value) { data = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.append("type", _TYPE);
		jobj.append("data", data);
		return jobj;
	}
}
