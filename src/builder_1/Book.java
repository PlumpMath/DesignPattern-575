package builder_1;
/**
 * �����������������ʱ��Ҫ�����ù���������������ģʽ��
 * 1 JavaBeansģʽ�ڹ������ʱ���ܿ��ܳ��ֲ�һ������
 * 2 �ڹ���������ʱ��������ִ��󣬺��Ѷ�λ��
 * 3 ���������ֻ����buildʱָ����֮�����ڲ��ṩsetter���������Ա�֤��ȫ��
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
