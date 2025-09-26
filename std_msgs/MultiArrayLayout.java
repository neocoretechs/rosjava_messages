package std_msgs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import org.json.JSONArray;
import org.json.JSONObject;

public class MultiArrayLayout implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "std_msgs/MultiArrayLayout";
	public static final java.lang.String _DEFINITION = "# The multiarray declares a generic multi-dimensional array of a\n# particular data type.  Dimensions are ordered from outer most\n# to inner most.\n\nMultiArrayDimension[] dim # Array of dimension properties\nuint32 data_offset        # padding bytes at front of data\n\n# Accessors should ALWAYS be written in terms of dimension stride\n# and specified outer-most dimension first.\n# \n# multiarray(i,j,k) = data[data_offset + dim_stride[1]*i + dim_stride[2]*j + k]\n#\n# A standard, 3-channel 640x480 image with interleaved color channels\n# would be specified as:\n#\n# dim[0].label  = \"height\"\n# dim[0].size   = 480\n# dim[0].stride = 3*640*480 = 921600  (note dim[0] stride is just size of image)\n# dim[1].label  = \"width\"\n# dim[1].size   = 640\n# dim[1].stride = 3*640 = 1920\n# dim[2].label  = \"channel\"\n# dim[2].size   = 3\n# dim[2].stride = 3\n#\n# multiarray(i,j,k) refers to the ith row, jth column, and kth channel.";
	public MultiArrayLayout() {}
	private java.util.List<std_msgs.MultiArrayDimension> dim;
	public java.util.List<std_msgs.MultiArrayDimension> getDim() { return dim; }
	public void setDim(java.util.List<std_msgs.MultiArrayDimension> value) { dim = value; }
	private int data_offset;
	public int getDataOffset() { return data_offset; }
	public void setDataOffset(int value) { data_offset = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.put("type", _TYPE);
		if(dim != null) {
			Collection<JSONObject> result = dim.stream()
				    .map(entry -> entry.toJSON()) // or ClassName::someMethod
				    .collect(Collectors.toCollection(ArrayList::new)); // or any other collection type
			JSONArray jarray = new JSONArray(result);
			jobj.put("dim", jarray);
		}
		jobj.put("data_offset", data_offset);
		return jobj;
	}
}
