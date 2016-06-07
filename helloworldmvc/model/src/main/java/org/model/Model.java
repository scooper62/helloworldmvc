package org.model;

	public class Model {
		private Model model;
	}
	
	public class Model implements IModel {
		public String getHelloWorld() {
			return null;
	}
		
	public void setUp() throws Exception {
		this.model = new Model();
	}
	
	public void testGetHelloWorld() {
		assertEquals("Hello World", this.model.getHelloWorld());
	}
		
	}
