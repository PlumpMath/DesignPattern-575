package builder_1;
/**
 * 遇到多个构造器参数时，要考虑用构造器，即建造者模式。
 * 1 JavaBeans模式在构造对象时，很可能出现不一致现象。
 * 2 在构造对象参数时，如果出现错误，很难定位。
 * 3 对象的属性只有在build时指定，之后类内不提供setter方法，可以保证安全。
 * @author Tong
 */
public class Book {
	private final int id;
	private final String name;
	private final String author;
	
	public static class Builder{
		private final int id;
		
		private String name = " ";
		private String author = " ";
		
		public Builder(int id){
			this.id = id;
		}
		
		public Builder name(String val){
			this.name = val;
			return this;			
		}
		
		public Builder author(String val){
			this.author = val;
			return this;
		}
		
		public Book build(){
			return new Book(this);
		}
	}
	public Book(Builder builder){
		id= builder.id;
		name = builder.name;
		author = builder.author;
	}
}
