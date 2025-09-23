package diagnostic_msgs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import org.json.JSONArray;
import org.json.JSONObject;

public class DiagnosticArray implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "diagnostic_msgs/DiagnosticArray";
	public static final java.lang.String _DEFINITION = "# This message is used to send diagnostic information about the state of the robot\nHeader header #for timestamp\nDiagnosticStatus[] status # an array of components being reported on";
	public DiagnosticArray() {}
	private std_msgs.Header header;
	public std_msgs.Header getHeader() { return header; }
	public void setHeader(std_msgs.Header value) { header = value; }
	private java.util.List<diagnostic_msgs.DiagnosticStatus> status;
	public java.util.List<diagnostic_msgs.DiagnosticStatus> getStatus() { return status; }
	public void setStatus(java.util.List<diagnostic_msgs.DiagnosticStatus> value) { status = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		if(header != null)
		jobj.append("header", header.toJSON());
		jobj.append("type", _TYPE);
		if(status != null) {
		Collection<JSONObject> result = status.stream()
			    .map(entry -> entry.toJSON()) // or ClassName::someMethod
			    .collect(Collectors.toCollection(ArrayList::new)); // or any other collection type
		JSONArray jarray = new JSONArray(result);
		jobj.append("status", jarray);
		}
		return jobj;
	}
}
