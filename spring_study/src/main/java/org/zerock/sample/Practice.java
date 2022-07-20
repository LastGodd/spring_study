package org.zerock.sample;

public class Practice {
	public static void main(String[] args) throws Exception {
		/* Class path를 한줄로 확인 가능 */
		// System.out.println(System.getProperty("java.class.path"));

		int cnt = 0;
		/* Class path를 여러 줄로 나누어 확인 가능 (Windows) */
		for (String element : System.getProperty("java.class.path").split(";")) {
			cnt++;
			System.out.println(cnt + " : "+element);
		}
	}
}
