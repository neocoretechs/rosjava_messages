package std_msgs;

import org.json.JSONObject;

public class Int8 implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "std_msgs/Int8";
	public static final java.lang.String _DEFINITION = "int8 data\n";
	public Int8() {}
	private byte data;
	public byte getData() { return data; }
	public void setData(byte value) { data = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.append("type", _TYPE);
		jobj.append("data", data);
		return jobj;
	}
}
