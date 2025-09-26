package std_msgs;

import org.json.JSONObject;

public class MultiArrayDimension implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "std_msgs/MultiArrayDimension";
	public static final java.lang.String _DEFINITION = "string label   # label of given dimension\nuint32 size    # size of given dimension (in type units)\nuint32 stride  # stride of given dimension";
	public MultiArrayDimension() {}
	private java.lang.String label;
	public java.lang.String getLabel() { return label; }
	public void setLabel(java.lang.String value) { label = value; }
	private int size;
	public int getSize() { return size; }
	public void setSize(int value) { size = value; }
	private int stride;
	public int getStride() { return stride; }
	public void setStride(int value) { stride = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.put("type", _TYPE);
		jobj.put("label", label);
		jobj.put("size", size);
		jobj.put("stride",stride);
		return jobj;
	}
}
