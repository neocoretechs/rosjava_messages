package nav_msgs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import org.json.JSONArray;
import org.json.JSONObject;

public class GridCells implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "nav_msgs/GridCells";
	public static final java.lang.String _DEFINITION = "#an array of cells in a 2D grid\nHeader header\nfloat32 cell_width\nfloat32 cell_height\ngeometry_msgs/Point[] cells\n";
	public GridCells() {}
	private std_msgs.Header header;
	public std_msgs.Header getHeader() { return header; }
	public void setHeader(std_msgs.Header value) { header = value; }
	private float cell_width;
	public float getCellWidth() { return cell_width; }
	public void setCellWidth(float value) { cell_width = value; }
	private float cell_height;
	public float getCellHeight() { return cell_height; }
	public void setCellHeight(float value) { cell_height = value; }
	private java.util.List<geometry_msgs.Point> cells;
	public java.util.List<geometry_msgs.Point> getCells() { return cells; }
	public void setCells(java.util.List<geometry_msgs.Point> value) { cells = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.put("type", _TYPE);
		if(header != null)
		jobj.put("header", header.toJSON());
		jobj.put("cell_width", cell_width);
		jobj.put("cell_height", cell_height);
		if(cells != null) {
		Collection<JSONObject> result = cells.stream()
			    .map(entry -> entry.toJSON()) // or ClassName::someMethod
			    .collect(Collectors.toCollection(ArrayList::new)); // or any other collection type
		JSONArray jarray = new JSONArray(result);
		jobj.put("cells", jarray);
		}
		return jobj;
	}
}
