package collections.generic;

public class Type_Program {
	public static void main(String[] args) {

		HideMessage<String> h = new HideMessage<String>("Hello World");
		System.out.println(h.getMessage("test"));
		
//		Way of getting any object in:
		HideMessage<DiaryEntry> q = new HideMessage<DiaryEntry>(new DiaryEntry("My diary","This is the first page of many..."));		
		Object result = q.getMessage("test");
		if (result instanceof DiaryEntry) {
			DiaryEntry e = (DiaryEntry) result;
			System.out.println(e.title);
			System.out.println(e.content);
		}
		System.out.println("");
	}
}
