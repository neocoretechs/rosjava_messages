package std_msgs;

import org.json.JSONObject;

public class UInt64 implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "std_msgs/UInt64";
	public static final java.lang.String _DEFINITION = "uint64 data";
	public UInt64() {}
	private long data;
	public long getData() { return data; }
	public void setData(long value) { data = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.append("type", _TYPE);
		jobj.append("data", data);
		return jobj;
	}
}
