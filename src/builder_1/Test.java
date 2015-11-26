package builder_1;

import builder_1.Book.Builder;

public class Test {

	public static void main(String[] args) {
		Book book1 = new Book.Builder(1001).build();
		Book book2 = new Book.Builder(1002).name("万物简史").build();
		Book book3 = new Book.Builder(1003).name("陆小凤传奇").author("古龙").build();
		}
}
