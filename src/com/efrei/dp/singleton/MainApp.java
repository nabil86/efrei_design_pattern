package com.efrei.dp.singleton;

public class MainApp {

	public static void main(String[] args) throws Exception {
		mutlithreadExecutionEnum();

	}

	private static void mutlithreadExecutionEnum() throws InterruptedException {
		final var thread1 = new Thread(() -> display(SingletonEnum.INSTANCE));
		final var thread2 = new Thread(() -> display(SingletonEnum.INSTANCE));

		thread1.start();
		thread2.start();

		thread1.join();
		thread2.join();

	}

	private static void execSingletonEnum() {
		final var singletonEnum1 = SingletonEnum.INSTANCE;
		final var singletonEnum2 = SingletonEnum.INSTANCE;

		System.out.println("singletonEnum1 == singletonEnum2: " + (singletonEnum1 == singletonEnum2));
	}

	private static void execReflection() throws Exception {
		final var singleton1 = Singleton.getInstance("FOO");
		final var declaredConstructor = Singleton.class.getDeclaredConstructor(String.class);
		declaredConstructor.setAccessible(true);
		final var newInstance = declaredConstructor.newInstance("Hacked singleton");
		display(singleton1);
		display(newInstance);

		System.out.println("singleton1 == newInstance: " + (singleton1 == newInstance));
	}

	private static void display(SingletonEnum singleton) {
		singleton.display();
		System.out.println("Singleton Hash Code: " + singleton.hashCode());
	}

	private static void display(Singleton singleton) {
		singleton.display();
		System.out.println("Singleton Hash Code: " + singleton.hashCode());
	}

	private static void singleThreadExecution() {
		final var singleton1 = Singleton.getInstance("FOO");
		final var singleton2 = Singleton.getInstance("BAR");
		display(singleton1);
		display(singleton2);

		System.out.println("singleton1 == singleton2: " + (singleton1 == singleton2));
	}

	private static void mutlithreadExecution() throws InterruptedException {
		final var thread1 = new Thread(() -> display(Singleton.getInstance("FOO")));
		final var thread2 = new Thread(() -> display(Singleton.getInstance("BAR")));

		thread1.start();
		thread2.start();

		thread1.join();
		thread2.join();

	}
}
