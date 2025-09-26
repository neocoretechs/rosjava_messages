package shape_msgs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import org.json.JSONArray;
import org.json.JSONObject;

public class MeshTriangle implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "shape_msgs/MeshTriangle";
	public static final java.lang.String _DEFINITION = "# Definition of a triangle\'s vertices\nuint32[3] vertex_indices\n";
	public MeshTriangle() {}
	private int[] vertex_indices;
	public int[] getVertexIndices() { return vertex_indices; }
	public void setVertexIndices(int[] value) { vertex_indices = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.put("type", _TYPE);
		if(vertex_indices != null) {
			JSONArray jarray = new JSONArray(vertex_indices);
			jobj.put("vertex_indices", jarray);
		}
		return jobj;
	}
}
