package std_msgs;

import org.json.JSONArray;
import org.json.JSONObject;

public class Float32 implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "std_msgs/Float32";
	public static final java.lang.String _DEFINITION = "float32 data";
	public Float32() {}
	private float data;
	public float getData() { return data; }
	public void setData(float value) { data = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.put("type", _TYPE);
		jobj.put("data", data);
		return jobj;
	}
}
