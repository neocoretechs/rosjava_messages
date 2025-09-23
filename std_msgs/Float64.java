package std_msgs;

import org.json.JSONObject;

public class Float64 implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "std_msgs/Float64";
	public static final java.lang.String _DEFINITION = "float64 data";
	public Float64() {}
	private double data;
	public double getData() { return data; }
	public void setData(double value) { data = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.append("type", _TYPE);
		jobj.append("data", data);
		return jobj;
	}
}
