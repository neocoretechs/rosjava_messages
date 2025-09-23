package sensor_msgs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import org.json.JSONArray;
import org.json.JSONObject;

public class JoyFeedbackArray implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "sensor_msgs/JoyFeedbackArray";
	public static final java.lang.String _DEFINITION = "# This message publishes values for multiple feedback at once. \nJoyFeedback[] array";
	public JoyFeedbackArray() {}
	private java.util.List<sensor_msgs.JoyFeedback> array;
	public java.util.List<sensor_msgs.JoyFeedback> getArray() { return array; }
	public void setArray(java.util.List<sensor_msgs.JoyFeedback> value) { array = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.append("type", _TYPE);
		if(array != null) {
		Collection<JSONObject> result = array.stream()
			    .map(entry -> entry.toJSON()) // or ClassName::someMethod
			    .collect(Collectors.toCollection(ArrayList::new)); // or any other collection type
		JSONArray jarray = new JSONArray(result);
		jobj.append("array", jarray);
		}
		return jobj;
	}
}
