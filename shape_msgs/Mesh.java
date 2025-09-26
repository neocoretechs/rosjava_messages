package shape_msgs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import org.json.JSONArray;
import org.json.JSONObject;

public class Mesh implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "shape_msgs/Mesh";
	public static final java.lang.String _DEFINITION = "# Definition of a mesh\n\n# list of triangles; the index values refer to positions in vertices[]\nMeshTriangle[] triangles\n\n# the actual vertices that make up the mesh\ngeometry_msgs/Point[] vertices\n";
	public Mesh() {}
	private java.util.List<shape_msgs.MeshTriangle> triangles;
	public java.util.List<shape_msgs.MeshTriangle> getTriangles() { return triangles; }
	public void setTriangles(java.util.List<shape_msgs.MeshTriangle> value) { triangles = value; }
	private java.util.List<geometry_msgs.Point> vertices;
	public java.util.List<geometry_msgs.Point> getVertices() { return vertices; }
	public void setVertices(java.util.List<geometry_msgs.Point> value) { vertices = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.put("type", _TYPE);
		if(triangles != null) {
			Collection<JSONObject> result = triangles.stream()
				    .map(entry -> entry.toJSON()) // or ClassName::someMethod
				    .collect(Collectors.toCollection(ArrayList::new)); // or any other collection type
			JSONArray jarray = new JSONArray(result);
			jobj.put("triangles", jarray);
		}
		if(vertices != null) {
			Collection<JSONObject> result = vertices.stream()
				    .map(entry -> entry.toJSON()) // or ClassName::someMethod
				    .collect(Collectors.toCollection(ArrayList::new)); // or any other collection type
			JSONArray jarray = new JSONArray(result);
			jobj.put("vertices", jarray);
		}
		return jobj;
	}
}
