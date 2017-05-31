package testkotlin;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.http.NameValuePair;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class JsonModel {
	
	public static final String ERROR = "error";
	public static final String SUCCESS = "success";
	private String status="success";
	private Integer errorcode=0;
	
	/**
	 * 数据总条数
	 * <br>
	 * -1为没有进行条数查询
	 * <br>
	 * 如果为-2,则查询出错,sql有问题
	 */
	private Long snow_count=-1L;
	
	/**
	 * 列名
	 */
	private ArrayList<String> columnNames =Lists.newArrayList();
	
	
	private String connkey;
	private String json;
	
	/**
	 * 用于客户端POST过来的参数
	 */
	private HashMap<String,String> parameters=new HashMap<String,String>();
	
	//错误信息提示
	private String errorinfo = "NONE";
	
	/**
	 * exception 转换为 String 格式信息
	 */
	private String errorexception;
	
	/**
	 * 数据
	 */
	private HashMap<String,Object> data=Maps.newLinkedHashMap();
	
	
	/**
	 * 业务对象,用于与maximo端的 webservice 通讯
	 */
	private String business;
	
	

	public String getErrorexception() {
		return errorexception;
	}

	public void setErrorexception(String errorexception) {
		this.errorexception = errorexception;
	}

	public String getBusiness() {
		return business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	public String getJson() {
		return json;
	}

	public void setJson(String json) {
		this.json = json;
	}

	public String getErrorinfo() {
		return errorinfo;
	}

	public void setErrorinfo(String errorinfo) {
		this.errorinfo = errorinfo;
	}

	public HashMap<String, String> getParameters() {
		return parameters;
	}

	public void setParameters(HashMap<String, String> parameters) {
		this.parameters = parameters;
	}

	public HashMap<String, Object> getData() {
		return data;
	}

	public void setData(HashMap<String, Object> data) {
		this.data = data;
	}

	public String getConnkey() {
		return connkey;
	}

	public void setConnkey(String connkey) {
		this.connkey = connkey;
	}
	
	
	public Integer getErrorcode() {
		return errorcode;
	}

	public void setErrorcode(Integer errorcode) {
		this.errorcode = errorcode;
	}

	public JsonModel addParameters(NameValuePair... paras){
		for (NameValuePair nameValuePair : paras) {
			addParameters(nameValuePair);
		}
		return this;
	}
	
	
	
	public JsonModel addParameters(HashMap<String, String> paras){
		if(parameters==null){
			parameters=new HashMap<String,String>();
		}
		parameters.putAll(paras);
		return this;
	}
	
	public JsonModel addParameters(NameValuePair paras){
		if(parameters==null){
			parameters=new HashMap<String,String>();
		}
		parameters.put(paras.getName(), paras.getValue());
		return this;
	}
	
	public String getParameter(String name){
		return parameters.get(name);
	}

	
	public JsonModel addDatas(String name,Object obj){
		if(data==null){
			data=new HashMap<String,Object>();
		}
		data.put(name,obj);
		return this;
	}

	public ArrayList<String> getColumnNames() {
		return columnNames;
	}

	public void setColumnNames(ArrayList<String> columnNames) {
		if(this.columnNames==null){
			this.columnNames =Lists.newArrayList();		
		}
		if(this.columnNames.isEmpty()){
			this.columnNames.addAll(columnNames);
		}
	}

	public void setColumnNames(String[] columnNames) {
		if(this.columnNames==null){
			this.columnNames =Lists.newArrayList();		
		}
		if(this.columnNames.isEmpty()){
			for (String columnName : columnNames) {
				this.columnNames.add(columnName);
			}
		}
	}

	public Long getSnow_count() {
		return snow_count;
	}

	public void setSnow_count(Long snow_count) {
		this.snow_count = snow_count;
	}
	
	
}
