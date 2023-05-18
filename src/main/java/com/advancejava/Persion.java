package com.advancejava;

import io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Consumer;

public class Persion {
	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//		functional interface  are 4 types
	// 1.predicate-- boolean result
	// 2.consumer--- modifie data --no output
	
	public static void main(String[] args) {
		Persion per = new Persion();
//		modifying the name using consumer inteface
		Consumer<Persion> persion = p -> p.setId(101);
		persion.accept(per);// if we donot use here accept method it will return null value
		persion = p -> p.setName("kiran");
		persion.accept(per);
		System.out.println(per.getId());
		System.out.println(per.getName());
		

	}

}
