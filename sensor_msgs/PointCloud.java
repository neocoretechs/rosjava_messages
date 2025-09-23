package sensor_msgs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import org.json.JSONArray;
import org.json.JSONObject;

public class PointCloud implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "sensor_msgs/PointCloud";
	public static final java.lang.String _DEFINITION = "# This message holds a collection of 3d points, plus optional additional\n# information about each point.\n\n# Time of sensor data acquisition, coordinate frame ID.\nHeader header\n\n# Array of 3d points. Each Point32 should be interpreted as a 3d point\n# in the frame given in the header.\ngeometry_msgs/Point32[] points\n\n# Each channel should have the same number of elements as points array,\n# and the data in each channel should correspond 1:1 with each point.\n# Channel names in common practice are listed in ChannelFloat32.msg.\nChannelFloat32[] channels\n";
	public PointCloud() {}
	private std_msgs.Header header;
	public std_msgs.Header getHeader() { return header; }
	public void setHeader(std_msgs.Header value) { header = value; }
	private java.util.List<geometry_msgs.Point32> points;
	public java.util.List<geometry_msgs.Point32> getPoints() { return points; }
	public void setPoints(java.util.List<geometry_msgs.Point32> value) { points = value; }
	private java.util.List<sensor_msgs.ChannelFloat32> channels;
	public java.util.List<sensor_msgs.ChannelFloat32> getChannels() { return channels; }
	public void setChannels(java.util.List<sensor_msgs.ChannelFloat32> value) { channels = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.append("type", _TYPE);
		if(header != null)
		jobj.append("header", header.toJSON());
		if(points != null) {
			Collection<JSONObject> result = points.stream()
				    .map(entry -> entry.toJSON()) // or ClassName::someMethod
				    .collect(Collectors.toCollection(ArrayList::new)); // or any other collection type
			JSONArray jarray = new JSONArray(result);
			jobj.append("points", jarray);
		}
		if(channels != null) {
			Collection<JSONObject> result = channels.stream()
				    .map(entry -> entry.toJSON()) // or ClassName::someMethod
				    .collect(Collectors.toCollection(ArrayList::new)); // or any other collection type
			JSONArray jarray = new JSONArray(result);
			jobj.append("channels", jarray);
		}
		return jobj;
	}
}
