package rosgraph_msgs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import org.json.JSONArray;
import org.json.JSONObject;

public class Log implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "rosgraph_msgs/Log";
	public static final java.lang.String _DEFINITION = "##\n## Severity level constants\n##\nbyte DEBUG=1 #debug level\nbyte INFO=2  #general level\nbyte WARN=4  #warning level\nbyte ERROR=8 #error level\nbyte FATAL=16 #fatal/critical level\n##\n## Fields\n##\nHeader header\nbyte level\nstring name # name of the node\nstring msg # message \nstring file # file the message came from\nstring function # function the message came from\nuint32 line # line the message came from\nstring[] topics # topic names that the node publishes\n";
	public Log() {}
	public static final byte DEBUG = 1;
	public static final byte INFO = 2;
	public static final byte WARN = 4;
	public static final byte ERROR = 8;
	public static final byte FATAL = 16;
	private std_msgs.Header header;
	public std_msgs.Header getHeader() { return header; }
	public void setHeader(std_msgs.Header value) { header = value; }
	private byte level;
	public byte getLevel() { return level; }
	public void setLevel(byte value) { level = value; }
	private java.lang.String name;
	public java.lang.String getName() { return name; }
	public void setName(java.lang.String value) { name = value; }
	private java.lang.String msg;
	public java.lang.String getMsg() { return msg; }
	public void setMsg(java.lang.String value) { msg = value; }
	private java.lang.String file;
	public java.lang.String getFile() { return file; }
	public void setFile(java.lang.String value) { file = value; }
	private java.lang.String function;
	public java.lang.String getFunction() { return function; }
	public void setFunction(java.lang.String value) { function = value; }
	private int line;
	public int getLine() { return line; }
	public void setLine(int value) { line = value; }
	private java.util.List<java.lang.String> topics;
	public java.util.List<java.lang.String> getTopics() { return topics; }
	public void setTopics(java.util.List<java.lang.String> value) { topics = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.put("type", _TYPE);
		if(header != null)
		jobj.put("header", header.toJSON());
		jobj.put("level", level);
		jobj.put("msg", msg);
		jobj.put("file", file);
		jobj.put("function", function);
		jobj.put("line", line);
		if(topics != null) {
		JSONArray jarray = new JSONArray(topics);
		jobj.put("topics", jarray);
		}
		return jobj;
	}
}
