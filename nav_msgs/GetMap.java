package nav_msgs;

import org.json.JSONObject;

public class GetMap implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "nav_msgs/GetMap";
	public static final java.lang.String _DEFINITION = "# Get the map as a nav_msgs/OccupancyGrid\n---\nnav_msgs/OccupancyGrid map\n";
	public GetMap() {}
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.append("type", _TYPE);
		jobj.append("text", _DEFINITION);
		return jobj;
	}
}
