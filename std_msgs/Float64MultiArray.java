package std_msgs;

import org.json.JSONArray;
import org.json.JSONObject;

public class Float64MultiArray implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "std_msgs/Float64MultiArray";
	public static final java.lang.String _DEFINITION = "# Please look at the MultiArrayLayout message definition for\n# documentation on all multiarrays.\n\nMultiArrayLayout  layout        # specification of data layout\nfloat64[]         data          # array of data\n\n";
	public Float64MultiArray() {}
	private std_msgs.MultiArrayLayout layout;
	public std_msgs.MultiArrayLayout getLayout() { return layout; }
	public void setLayout(std_msgs.MultiArrayLayout value) { layout = value; }
	private double[] data;
	public double[] getData() { return data; }
	public void setData(double[] value) { data = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.put("type", _TYPE);
		if(layout != null)
		jobj.put("layout", layout.toJSON());
		if(data != null) {
			JSONArray jarray = new JSONArray(data);
			jobj.put("data", jarray);
		}
		return jobj;
	}
}
