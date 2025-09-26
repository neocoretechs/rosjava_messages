package nav_msgs;

import org.json.JSONObject;

public class GetMapRequest implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "nav_msgs/GetMapRequest";
	public static final java.lang.String _DEFINITION = "# Get the map as a nav_msgs/OccupancyGrid\n";
	public GetMapRequest() {}
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.put("type", _TYPE);
		jobj.put("text", _DEFINITION);
		return jobj;
	}
}
