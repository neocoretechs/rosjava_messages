package std_msgs;

import org.json.JSONArray;
import org.json.JSONObject;

public class UInt16MultiArray implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "std_msgs/UInt16MultiArray";
	public static final java.lang.String _DEFINITION = "# Please look at the MultiArrayLayout message definition for\n# documentation on all multiarrays.\n\nMultiArrayLayout  layout        # specification of data layout\nuint16[]            data        # array of data\n\n";
	public UInt16MultiArray() {}
	private std_msgs.MultiArrayLayout layout;
	public std_msgs.MultiArrayLayout getLayout() { return layout; }
	public void setLayout(std_msgs.MultiArrayLayout value) { layout = value; }
	private short[] data;
	public short[] getData() { return data; }
	public void setData(short[] value) { data = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.append("type", _TYPE);
		if(layout != null)
		jobj.append("layout", layout.toJSON());
		if(data != null) {
			JSONArray jarray = new JSONArray(data);
			jobj.append("data", jarray);
		}
		return jobj;
	}
}
