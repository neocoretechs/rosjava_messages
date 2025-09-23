package diagnostic_msgs;

import org.json.JSONObject;

public class SelfTest implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "diagnostic_msgs/SelfTest";
	public static final java.lang.String _DEFINITION = "---\nstring id\nbyte passed\nDiagnosticStatus[] status\n";
	public SelfTest() {}
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.append("type", _TYPE);
		jobj.append("text", _DEFINITION);
		return jobj;
	}
}
