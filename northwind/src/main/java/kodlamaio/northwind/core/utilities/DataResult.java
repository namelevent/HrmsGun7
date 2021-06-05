package kodlamaio.northwind.core.utilities;

public class DataResult<T> extends Result {
	
	private T data;
	
	public DataResult(T data, boolean success, String message) { 
		super(true,message);
		this.data = data;
	}
	
	public DataResult(T data, boolean success) { 
		super(true);
		this.data = data;
	}
	
	public T getData() {
		return this.data;
	}

}
