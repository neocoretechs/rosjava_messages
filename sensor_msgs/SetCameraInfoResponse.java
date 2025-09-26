package sensor_msgs;

import org.json.JSONObject;

public class SetCameraInfoResponse implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "sensor_msgs/SetCameraInfoResponse";
	public static final java.lang.String _DEFINITION = "bool success          # True if the call succeeded\nstring status_message # Used to give details about success";
	public SetCameraInfoResponse() {}
	private boolean success;
	public boolean getSuccess() { return success; }
	public void setSuccess(boolean value) { success = value; }
	private java.lang.String status_message;
	public java.lang.String getStatusMessage() { return status_message; }
	public void setStatusMessage(java.lang.String value) { status_message = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.put("type", _TYPE);
		jobj.put("success", success);
		jobj.put("status_message", status_message);
		return jobj;
	}
}
