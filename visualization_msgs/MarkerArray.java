package visualization_msgs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import org.json.JSONArray;
import org.json.JSONObject;

public class MarkerArray implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "visualization_msgs/MarkerArray";
	public static final java.lang.String _DEFINITION = "Marker[] markers\n";
	public MarkerArray() {}
	private java.util.List<visualization_msgs.Marker> markers;
	public java.util.List<visualization_msgs.Marker> getMarkers() { return markers; }
	public void setMarkers(java.util.List<visualization_msgs.Marker> value) { markers = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.append("type", _TYPE);
		if(markers != null) {
			Collection<JSONObject> result = markers.stream()
				    .map(entry -> entry.toJSON()) // or ClassName::someMethod
				    .collect(Collectors.toCollection(ArrayList::new)); // or any other collection type
			JSONArray jarray = new JSONArray(result);
			jobj.append("markers", jarray);
		}
		return jobj;
	}
}
