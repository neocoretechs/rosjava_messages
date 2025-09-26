package sensor_msgs;

import org.json.JSONArray;
import org.json.JSONObject;

public class Joy implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "sensor_msgs/Joy";
	public static final java.lang.String _DEFINITION = "# Reports the state of a joysticks axes and buttons.\nHeader header           # timestamp in the header is the time the data is received from the joystick\nfloat32[] axes          # the axes measurements from a joystick\nint32[] buttons         # the buttons measurements from a joystick \n";
	public Joy() {}
	private std_msgs.Header header;
	public std_msgs.Header getHeader() { return header; }
	public void setHeader(std_msgs.Header value) { header = value; }
	private float[] axes;
	public float[] getAxes() { return axes; }
	public void setAxes(float[] value) { axes = value; }
	private int[] buttons;
	public int[] getButtons() { return buttons; }
	public void setButtons(int[] value) { buttons = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.put("type", _TYPE);
		if(header != null)
		jobj.put("header", header.toJSON());
		if(axes != null) {
			JSONArray jarray = new JSONArray(axes);
			jobj.put("axes", jarray);
		}
		if(buttons != null) {
			JSONArray jarray = new JSONArray(buttons);
			jobj.put("buttons", jarray);
		}
		return jobj;
	}
}
