package diagnostic_msgs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import org.json.JSONArray;
import org.json.JSONObject;

public class KeyValue implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "diagnostic_msgs/KeyValue";
	public static final java.lang.String _DEFINITION = "string key # what to label this value when viewing\nstring value # a value to track over time\n";
	public KeyValue() {}
	private java.lang.String key;
	public java.lang.String getKey() { return key; }
	public void setKey(java.lang.String value) { key = value; }
	private java.lang.String value;
	public java.lang.String getValue() { return value; }
	public void setValue(java.lang.String xvalue) { value = xvalue; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.put("key", key);
		jobj.put("value", value);
		jobj.put("type", _TYPE);
		return jobj;
	}
}
